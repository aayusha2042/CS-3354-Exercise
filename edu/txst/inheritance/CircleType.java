package edu.txst.inheritance;

/**
 * Represents a circle using its radius.
 * This class will also be used as the superclass
 * for other shapes such as spheres and cylinders.
 *
 * @author Aayusha Adhikari
 */
public class CircleType {

    // protected allows subclasses such as SphereType and
    // CylinderType to directly use the radius they inherit.
    protected double radius;

    /**
     * Changes the radius of the circle.
     *
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the current radius.
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Creates a circle with a default radius of 0.0.
     */
    public CircleType() {
        this.radius = 0.0;
    }

    /**
     * Creates a circle with the given radius.
     *
     * @param radius the radius used to create the circle
     */
    public CircleType(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Tests the CircleType class.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // My modification: create a CircleType object and
        // display both its radius and calculated area.
        CircleType circle = new CircleType(6);

        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());

        // Change the radius using the inherited class's mutator
        // to demonstrate that the same object can be updated.
        circle.setRadius(8);

        System.out.println("New radius: " + circle.getRadius());
        System.out.println("New area: " + circle.getArea());
    }
}