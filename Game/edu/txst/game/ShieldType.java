package edu.txst.game;

/**
 * The ShieldType class represents a shield in the game.
 * It has a durability that can be decreased when the shield is used.
 */
public class ShieldType {

    // Private prevents direct access to durability outside this class.
    private int durability;

    /**
     * Returns the current durability of the shield.
     *
     * @return the current shield durability
     */
    public int getDurability() {
        return durability;
    }

    /**
     * Decreases the durability of the shield by a specified amount.
     *
     * @param decrement the amount to decrease the durability
     */
    public void decreaseDurability(int decrement) {
        durability = durability - decrement;

        // Shield durability cannot go below 1.
        if (durability < 1)
            durability = 1;
    }

    /**
     * Creates a shield with a specified durability.
     *
     * @param durability the starting durability of the shield
     */
    public ShieldType(int durability) {

        // Gives the shield a minimum durability of 1.
        if (durability < 1)
            durability = 1;

        this.durability = durability;
    }
}