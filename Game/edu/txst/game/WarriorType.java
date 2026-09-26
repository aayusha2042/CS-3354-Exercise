package edu.txst.game;

/**
 * The WarriorType class represents a warrior character in the game.
 * It extends the CharacterType class and adds an attack power attribute.
 */
public class WarriorType extends CharacterType {

    // Protected allows subclasses such as SuperWarrior to access attack power.
    protected int ap;

    /**
     * Returns the current attack power of the warrior.
     * 
     * @return the current attack power
     */
    public int attack() {
        return ap;
    }

    /**
     * Uses a BluePotion to increase the warrior's health.
     *
     * @param bluePotion the BluePotion used by the warrior
     */
    public void use(BluePotion bluePotion) {

        // Increases health by the value of the blue potion.
        this.hp = this.hp + bluePotion.getValue();

        // Health cannot go above maximum health.
        if (this.hp > this.mhp)
            this.hp = this.mhp;
    }

    /**
     * Uses a RedPotion to increase the warrior's attack power.
     *
     * @param redPotion the RedPotion used by the warrior
     */
    public void use(RedPotion redPotion) {

        // Adds the red potion value to attack power.
        this.ap = this.ap + redPotion.getValue();
    }

    /**
     * Creates a warrior with health, maximum health, and attack power.
     *
     * @param hp the starting health points
     * @param mhp the maximum health points
     * @param ap the starting attack power
     */
    public WarriorType(int hp, int mhp, int ap) {

        // Calls the CharacterType constructor to initialize health and maximum health.
        super(hp, mhp);

        // Ensures that attack power is not negative.
        if (ap < 0)
            ap = 0;

        this.ap = ap;
    }
}