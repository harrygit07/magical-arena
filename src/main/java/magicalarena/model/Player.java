package magicalarena.model;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return this.health;
    }

    public void setHealthValue(int health) {
        this.health = health;
    }

    public int getStrengthValue() {
        return this.strength;
    }

    public void setStrengthValue(int strength) {
        this.strength = strength;
    }

    public int getAttackValue() {
        return this.attack;
    }

    public void setAttackValue(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return name + " -> Health: " + this.health + ", Strength: " + strength + ", Attack: " + attack;
    }

}
