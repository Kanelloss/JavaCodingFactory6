package gr.aueb.cf.mobilecontacts.model;

import java.util.Objects;

public class UserDetails extends AbstractEntity implements IdentifiableEntity {
    private String firstname;
    private String lastname;

    public UserDetails() {

    }

    public UserDetails(long id, String firstname, String lastname) {
        setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public UserDetails(UserDetails userDetails) {
        this.firstname = userDetails.getFirstname();
        this.lastname = userDetails.getLastname();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDetails that = (UserDetails) o;

        return Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
