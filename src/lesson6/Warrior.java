package lesson6;

/**
 * Created by admin on 6/21/17.
 */
public class Warrior extends Hero {
    int healthLevel;

    public Warrior(String name, int healthLevel) {
        super(name);
        this.healthLevel = healthLevel;
    }

    public void takeDamage(int damage) {
        healthLevel -= damage;
    }

    @Override
    public boolean isAlive() {
        if (this.healthLevel <= 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
    }
}
