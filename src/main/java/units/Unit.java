/* Base class for Nidus units.
 */


package main.java.units;

public class Unit {
    private int ownerId;
    private int health;
    private int strength;
    private int stamina;
    private int agility;

    public String name = "It worked!";

    private int experience = 0;
    private boolean alive = true;

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getOwnerId() {
        return this.ownerId;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getStamina() {
        return this.stamina;
    }

    public int getAgility() {
        return this.agility;
    }
    
    public boolean getAlive() {
        return this.alive;
    }

    public void incExperience(int num) {
        this.experience += num;
    }
}

