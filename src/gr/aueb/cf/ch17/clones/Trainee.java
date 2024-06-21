package gr.aueb.cf.ch17.clones;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private City city;

    public Trainee() {

    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    // Copy Constructor (deep copy)
    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City(trainee.getCity());
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.setCity(city);
        return trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;


        return Objects.equals(name, trainee.name) && Objects.equals(city, trainee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
