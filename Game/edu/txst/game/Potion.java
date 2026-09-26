package edu.txst.game;

/**
 * The Potion class is an abstract class that represents a potion in the game.
 * It has a value that can be retrieved by subclasses through the getValue() method.    
 */
public abstract class Potion {

    // Protected allows subclasses to access the potion value.
    protected int value;

    /**
     * Returns the value of the potion.
     * Each subclass provides its own implementation.
     *
     * @return the value of the potion
     */
    public abstract int getValue();

    /**
     * Creates a potion with a given value.
     *
     * @param value the value assigned to the potion
     */
    public Potion(int value) {
        if (value < 1)
            this.value = 1;

        this.value = value;
    }
}