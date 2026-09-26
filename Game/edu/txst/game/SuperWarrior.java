package edu.txst.game;

/**
 * The SuperWarrior class extends the WarriorType class and represents a warrior with enhanced capabilities in the game.
 * It has a shield that reduces incoming damage, demonstrating the concept of composition.
 */
public class SuperWarrior extends WarriorType {

    // The SuperWarrior has a shield, which demonstrates composition.
    ShieldType shield;

    /**
     * Creates a SuperWarrior with health, attack power, and a shield.
     *
     * @param hp the starting health points
     * @param mhp the maximum health points
     * @param ap the starting attack power
     * @param shield the shield used by the warrior
     */
    public SuperWarrior(int hp, int mhp, int ap, ShieldType shield) {

        // Calls the WarriorType constructor to initialize health and attack power.
        super(hp, mhp, ap);

        // Sets the shield for the SuperWarrior, demonstrating composition.
        this.shield = shield;
    }

    /**
     * Decreases the SuperWarrior's health by a specified amount, taking into account the shield's durability.
     *
     * @param amount the original amount of damage
     */
    @Override
    public void decreaseHp(int amount) {

        // The shield reduces the incoming damage based on its durability.
        amount = amount / shield.getDurability();

        // Calls the inherited decreaseHp method to apply the reduced damage to the SuperWarrior's health.
        super.decreaseHp(amount);

        // Decreases the shield's durability after taking damage, demonstrating the shield's usage.
        shield.decreaseDurability(1);
    }

    /**
     * Returns information about the SuperWarrior, including health, maximum health, attack power, and shield durability.
     *
     * @return the warrior's health, maximum health, attack power,
     *         and shield durability
     */
    @Override
    public String toString() {
        return "[hp=" + hp + ", mhp=" + mhp + ", ap=" + ap
                + ", sd=" + shield.getDurability() + "]";
    }
}