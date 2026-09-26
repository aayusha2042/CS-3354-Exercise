package edu.txst.game;

/**
 * The Pig class implements the Animal interface and represents a pig in the game.
 * It provides its own implementation of the makeSound() method, which is required by the Animal interface. 
 * Additionally, it has a sleep() method to simulate the pig sleeping.
 */
public class Pig implements Animal {

    /**
     * Makes the sound of a pig.
     */
    @Override
    public void makeSound() {
        System.out.println("The pig says: wee wee");
    }

    /**
     * Simulates the pig sleeping by printing "Zzz" to the console.
     */
    public void sleep() {
        System.out.println("Zzz");
    }

    /**
     * The main method demonstrates polymorphism by creating instances of Pig and Cat using the Animal interface.
     * It calls the makeSound() method on each instance, showcasing that different animal types
     *  can be treated uniformly through the Animal interface.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Both objects use Animal references but behave differently.
        Animal animal0 = new Pig();
        animal0.makeSound();

        Animal animal1 = new Cat();
        animal1.makeSound();
    }
}