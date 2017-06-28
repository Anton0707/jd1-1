package lesson6;

/**
 * Created by admin on 6/21/17.
 */
public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("warrior", 100);
        Archer archer = new Archer("archer", 100);
        Zombie zombie = new Zombie(100);
        int countLifes = 0;
        while (true) {

            if (!warrior.isAlive()) {
                System.out.println("game over, warrior has lost");
                break;
            } else if (!archer.isAlive()) {
                System.out.println("game over, warrior has lost");
                break;
            }else {
                archer.attackEnemy(zombie);
                System.out.println("zomie health " + zombie.health);

                if (!zombie.isAlive() && countLifes <= 1) {
                    System.out.println("zombie has resurrectioned");
                    zombie.Resurrection();
                    countLifes++;
                }else if (!zombie.isAlive()) {
                        System.out.println("game over, zombie has lost");
                        countLifes++;
                        break;
                }
                warrior.attackEnemy(zombie);
                System.out.println("zomie health " + zombie.health);

                if (!zombie.isAlive() && countLifes <= 1) {
                    System.out.println("zombie has resurrectioned");
                    zombie.Resurrection();
                    countLifes++;
                }else if (!zombie.isAlive()) {
                        System.out.println("game over, zombie has lost");
                        countLifes++;
                        break;
                }
                zombie.attackHero(warrior);
                System.out.println("warrior health " + warrior.healthLevel);
            }
        }
    }
}
