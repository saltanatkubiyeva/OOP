package p1a;


public class ShapeTest {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(4.0,12.0);
        Shape3D sphere = new Sphere(8.0);
        Shape3D cube = new Cube(9.0);

        System.out.println("=== 3D Shapes ====");
        System.out.println(cylinder);
        System.out.println(sphere);
        System.out.println(cube);
    }
}