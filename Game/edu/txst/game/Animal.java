package edu.txst.game;

/**
 * The Animal interface here, represents an animal in the game.
 * To be implemented by any class representing an animal in the game,
 * the implementing class must provide its own version of the makeSound() method.
 */
interface Animal {

    /**
     * Make animal sound. This method is abstract and must be implemented by any class that implements the Animal interface.
     * Each animal class will implement this method to produce its own unique sound.
     */
    void makeSound();
}