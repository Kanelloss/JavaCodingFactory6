package gr.aueb.cf.ch17.exercise01;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, Serializable, Cloneable {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }

    // copy constructor
    public Line(Line line) {
        super();
        this.setId(line.getId());
        this.length = line.getLength();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
