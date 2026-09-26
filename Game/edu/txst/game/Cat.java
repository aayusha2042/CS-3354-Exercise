package edu.txst.game;

/**
 * The Cat class represents a cat in the game. 
 * It implements the Animal interface, and provides its own implementation of the makeSound() method.
 * Each animal class that implements the Animal interface must provide
 * its own version of the makeSound() method.
 */
public class Cat implements Animal {

    /**
     * This method is required by the Animal interface and is implemented here to provide the specific sound a cat makes.
     */
    @Override
    public void makeSound() {
        System.out.println("The cat says: meow");
    }
}