package edu.txst.game;

/**
 * The CharacterType class represents a basic character in the game.
 * It stores the current health and maximum health of a character.
 */
public class CharacterType {

    // Protected allows subclasses to access these variables.
    protected int hp;
    protected int mhp;

    /**
     * Decreases the character's health by a given amount.
     *
     * @param amount the amount of health to decrease
     */
    public void decreaseHp(int amount) {
        this.hp = this.hp - amount;

        // Health should not go below zero.
        if (this.hp < 0)
            this.hp = 0;
    }

    /**
     * Returns the current health.
     *
     * @return the current health points
     */
    public int getHP() {
        return hp;
    }

    /**
     * Creates a character with current and maximum health.
     *
     * @param hp the starting health
     * @param mhp the maximum health
     */
    public CharacterType(int hp, int mhp) {

        if (mhp < 1)
            mhp = 1;

        this.mhp = mhp;

        if (hp > mhp)
            hp = mhp;

        this.hp = hp;
    }
}