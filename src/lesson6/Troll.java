package lesson6;

/**
 * Created by admin on 6/21/17.
 */
public class Troll extends Enemy {
    public int health;

    public Troll(int health) {
        this.health = health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(30);
    }

    @Override
    public boolean isAlive() {
        if (this.health <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
