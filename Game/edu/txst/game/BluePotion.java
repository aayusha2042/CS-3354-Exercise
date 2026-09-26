package edu.txst.game;

/**
 * The Bluepotion class represents a blue potion in the game.
 * It extends Potion and implements the getValue() method to return its stored value.
 */
public class BluePotion extends Potion {

    /**
     * Returns the value of the blue potion.
     *
     * @return the value of the blue potion
     */
    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * Creates a BluePotion with a specific value.
     *
     * @param value the value assigned to the potion
     */
    public BluePotion(int value) {

        // Calls the constructor of the parent Potion class.
        super(value);
    }
}