package gr.aueb.cf.ch15.immutable;

public final class Immutable3D_2 {
    private final ImmutablePoint point;
    private final int z;

    public Immutable3D_2() {
        this.point = new ImmutablePoint();
        this.z = 0;
    }

    public Immutable3D_2(ImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
    }

    public ImmutablePoint getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }


}
