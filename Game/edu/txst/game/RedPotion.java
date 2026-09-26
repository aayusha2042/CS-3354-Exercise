package edu.txst.game;

/**
 * The RedPotion class represents a red potion in the game.
 * It extends the abstract Potion class and provides its own implementation of the getValue() method.
 */
public class RedPotion extends Potion {

    /**
     * Creates a RedPotion with a specific value.
     *
     * @param value the value assigned to the potion
     */
    public RedPotion(int value) {

        // Calls the constructor of the parent Potion class.
        super(value);
    }

    /**
     * Returns the value of the red potion, which is twice the stored value.
     *
     * @return twice the potion value
     */
    @Override
    public int getValue() {
        return 2 * this.value;
    }
}