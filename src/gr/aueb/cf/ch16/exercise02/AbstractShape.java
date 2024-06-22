package gr.aueb.cf.ch16.exercise02;

public abstract class AbstractShape implements IShape {
    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
