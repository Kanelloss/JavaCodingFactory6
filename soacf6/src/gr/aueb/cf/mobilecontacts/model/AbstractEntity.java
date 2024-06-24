package gr.aueb.cf.mobilecontacts.model;

public class AbstractEntity implements IdentifiableEntity{
    private long id;

    // getter
    @Override
    public long getId() {
        return id;
    }

    // setter
    public void setId(long id) {
        this.id = id;
    }
}
