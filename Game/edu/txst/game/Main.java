package edu.txst.game;

/**
 * The Main class runs and tests the game application.
 * It demonstrates the use of characters, potions, and shields.
 */
public class Main {

    /**
     * The main method is the starting point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /*
         * Example code for testing characters and potions.
         *
         * CharacterType hero = new CharacterType(5, 10);
         * WarriorType warrior = new WarriorType(3, 20, 7);
         *
         * BluePotion bluePotion = new BluePotion(6);
         * RedPotion redPotion = new RedPotion(4);
         *
         * System.out.println("Warrior's HP: " + warrior.getHP());
         * System.out.println("Warrior's AP: " + warrior.attack());
         *
         * warrior.use(bluePotion);
         * warrior.use(redPotion);
         */

        // Creates a shield with durability of 5.
        ShieldType superShield = new ShieldType(5);

        // Creates a SuperWarrior with health, attack power, and the shield.
        SuperWarrior akira =
                new SuperWarrior(77, 100, 53, superShield);

        // Displays the initial state of the SuperWarrior.
        System.out.println(akira);

        // Decreases the SuperWarrior's health by 50.
        akira.decreaseHp(50);

        // Displays the warrior after taking damage.
        System.out.println(akira);
    }
}