package edu.txst.inheritance;

/**
 * Represents a cylinder that inherits its radius
 * and circle behavior from CircleType.
 *
 * @author Aayusha Adhikari
 */
public class CylinderType extends CircleType {

    private double height;

    /**
     * Changes the height of the cylinder.
     *
     * @param height the new height of the cylinder
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the height of the cylinder.
     *
     * @return the cylinder's height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates the volume of the cylinder.
     *
     * @return the volume of the cylinder
     */
    public double getVolume() {

        // super.getArea() reuses CircleType's area calculation
        // to find the area of the circular base.
        return super.getArea() * height;
    }

    /**
     * Calculates the total surface area of the cylinder.
     * This method overrides getArea() from CircleType.
     *
     * @return the total surface area of the cylinder
     */
    @Override
    public double getArea() {

        // super.getArea() calculates the two circular bases.
        // radius is inherited from CircleType and can be accessed
        // here because it is protected.
        return super.getArea() * 2
                + height * Math.PI * radius * 2;
    }

    /**
     * Creates a cylinder using the default CircleType constructor.
     */
    public CylinderType() {
        super();
        height = 0.0;
    }

    /**
     * Creates a cylinder with a specified radius and height.
     *
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     */
    public CylinderType(double radius, double height) {

        // The superclass constructor initializes the inherited radius.
        super(radius);

        // Height belongs specifically to CylinderType,
        // so this subclass initializes it itself.
        this.height = height;
    }

    /**
     * Tests the CylinderType class and its inherited behavior.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        CylinderType cylinder = new CylinderType(6, 8);

        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface area: " + cylinder.getArea());

        // My modification: change the cylinder's height using
        // the subclass setter and calculate the new volume.
        cylinder.setHeight(10);

        System.out.println("New height: " + cylinder.getHeight());
        System.out.println("New volume: " + cylinder.getVolume());
    }
}