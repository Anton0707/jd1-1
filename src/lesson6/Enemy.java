package lesson6;

/**
 * Created by admin on 6/21/17.
 */
public class Enemy implements Mortal {
    private int health;

    public Enemy(){
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(50);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
