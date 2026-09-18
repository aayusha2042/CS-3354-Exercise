package edu.txst.inheritance;

/**
 * Represents a sphere that inherits its radius
 * and basic behavior from CircleType.
 *
 * @author Aayusha Adhikari
 */
public class SphereType extends CircleType {

    /**
     * Calculates the volume of the sphere.
     *
     * @return the volume of the sphere
     */
    public double getVolume() {

        // radius is inherited from CircleType. Since it is
        // protected, the subclass can access it directly.
        return 4 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates the surface area of the sphere.
     * This replaces the CircleType version of getArea().
     *
     * @return the surface area of the sphere
     */
    @Override
    public double getArea() {

        // This is method overriding because SphereType needs
        // a different area formula than CircleType.
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Creates a sphere using the default CircleType constructor.
     */
    public SphereType() {
        super();
    }

    /**
     * Creates a sphere with the specified radius.
     *
     * @param radius the radius of the sphere
     */
    public SphereType(double radius) {

        // super(radius) calls the CircleType constructor,
        // allowing the superclass to initialize the radius.
        super(radius);
    }

    /**
     * Tests inheritance, overriding, and polymorphism.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        SphereType sphere = new SphereType(6);

        System.out.println("Sphere radius: " + sphere.getRadius());
        System.out.println("Sphere volume: " + sphere.getVolume());
        System.out.println("Sphere surface area: " + sphere.getArea());

        CircleType circle = new CircleType(6);
        System.out.println("Circle area: " + circle.getArea());

        System.out.println("=========================");

        // A SphereType object can be passed where CircleType is
        // expected because SphereType is a subclass of CircleType.
        displayArea(sphere);

        // My modification: create another sphere with a different
        // radius and pass it to the same method.
        SphereType secondSphere = new SphereType(4);
        displayArea(secondSphere);
    }

    /**
     * Displays the area of a CircleType object.
     * If a SphereType object is passed, Java uses the
     * overridden SphereType getArea() method.
     *
     * @param circle the CircleType or subclass object to display
     */
    public static void displayArea(CircleType circle) {
        System.out.println("Printing area within a method.");
        System.out.println("Area: " + circle.getArea());
    }
}