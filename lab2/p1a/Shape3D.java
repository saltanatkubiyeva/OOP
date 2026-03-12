package p1a;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " | Volume:" + String.format("%.2f,", volume()) +
                " | Surface Area: " + String.format("%.2f", surfaceArea());
    }

}
