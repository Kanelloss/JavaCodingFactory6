package gr.aueb.cf.ch12;

/**
 * Java Bean - POJO (Plain ld Java Object)
 */
public class Student {

    private int id;
    private String firstname;
    private String lastname;


    /**
     * Default Constructor. Populates the state
     * of a {@link Student} to default values.
     */
    public Student() {

    }

    /**
     * Overloaded Constructor. Populates the state of the instance
     * based on specific values that are given.
     *
     * @param id
     *      the id of the {@link Student}.
     * @param firstname
     *      the firstname of the {@link Student}.
     * @param lastname
     *      the lastname of the {@link Student}.
     */
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;      //or this.id   -- it is the same, there is no conflict like in setId
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }




}
