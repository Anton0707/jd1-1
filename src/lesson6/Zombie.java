package lesson6;

/**
 * Created by admin on 6/21/17.
 */
public class Zombie extends Enemy {
    public int health;

    public Zombie(int health) {
        this.health = health;
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(10);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    public void Resurrection() {
        health += 100;
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
