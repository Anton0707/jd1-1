package lesson6;

/**
 * Created by admin on 6/21/17.
 */
public abstract class Hero implements Mortal{
    private String name;
    public int healthLevel;

    public void takeDamage(int damage) {
        healthLevel -= damage;
    }

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);


}
