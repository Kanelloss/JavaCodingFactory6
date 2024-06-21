package gr.aueb.cf.ch17.threads;

public class Knight implements IKnight, Runnable{

    private String name;

    public Knight() {

    }

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void embarkOnMission(IMission mission) {
        System.out.println("Knight name: " + name);
        mission.embark();
    }

    @Override
    public void run() {

        synchronized (IKnight.missions) {
            for (IMission mission : IKnight.missions) {
                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    mission.setStatus(MissionStatus.STARTED);
                    embarkOnMission(mission);
                    break;
                }
            }
        }
    }


}
