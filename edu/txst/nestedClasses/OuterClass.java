package edu.txst.nestedClasses;

/**
 * Demonstrates the difference between an inner class
 * and a static nested class.
 *
 * @author Aayusha Adhikari
 */
public class OuterClass {

    private String outerField = "Message from the outer class";

    /**
     * An inner class that can access members of its outer object.
     */
    class InnerClass {

        /**
         * Displays the private field that belongs to OuterClass.
         */
        public void accessMembers() {
            // An inner class can directly access a private member
            // of the outer class that contains it.
            System.out.println(outerField);
        }
    }

    /**
     * A static nested class that can be created without first
     * creating an OuterClass object.
     */
    static class StaticNestedClass {

        /**
         * Displays a message from the static nested class.
         */
        public void displayMessage() {
            System.out.println("Message from the static nested class.");
        }
    }

    /**
     * Creates and tests both types of nested classes.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // A static nested class does not require an OuterClass
        // object before its object can be created.
        OuterClass.StaticNestedClass staticObject =
                new OuterClass.StaticNestedClass();
        staticObject.displayMessage();

        // A regular inner class belongs to an OuterClass object,
        // so the outer object must be created first.
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject =
                outerObject.new InnerClass();
        innerObject.accessMembers();

        // My modification: create another outer object and use
        // another inner object to access the outer class field.
        OuterClass secondOuterObject = new OuterClass();
        OuterClass.InnerClass secondInnerObject =
                secondOuterObject.new InnerClass();
        secondInnerObject.accessMembers();
    }
}