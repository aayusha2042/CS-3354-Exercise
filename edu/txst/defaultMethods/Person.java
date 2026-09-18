package edu.txst.defaultMethods;

/**
 * Represents a person with a name and age.
 * This class demonstrates overriding the toString()
 * method inherited from the Object class.
 *
 * @author Aayusha Adhikari
 */
public class Person {

    private String name;
    private int age;

    /**
     * Creates a Person with a specified name and age.
     *
     * @param name the person's name
     * @param age the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the person's information as a readable String.
     * This overrides the default toString() method from Object.
     *
     * @return a String containing the person's name and age
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    /**
     * Creates Person objects and displays their information.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Printing an object automatically calls its toString()
        // method, so our overridden version controls the output.
        Person person = new Person("Maya", 21);
        System.out.println(person);

        // My modification: a second Person object shows that
        // the same overridden method works for different objects.
        Person person2 = new Person("Alex", 24);
        System.out.println(person2);
    }
}