package homeworkFour.warriors;

import homeworkFour.weapons.Weapon;
import homeworkFour.shields.Shield;

import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield> {
    private final String name;
    private int healthPoint;
    private W weapon;
    private S shield;

    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public S getShield() {
        return shield;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setShield (S shield) {this.shield = shield;}

    public int hit() {
        Random rand = new Random();
        int hitDamage = rand.nextInt(0, weapon.damage() + 1);
        return hitDamage;
    }

    public void reduceHealth(int damage, int protectbyShield){
        if (protectbyShield >= damage) {
            damage = 0;
        }
        else {
            healthPoint -= (damage - protectbyShield);
        }
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    public int protectByShield(){
        Random rand = new Random();
        int shieldProtect = rand.nextInt(0, shield.protect() + 1);
        return shieldProtect;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; HP: %d; Weapon-%s; Shield-%s", name, healthPoint, weapon, shield);
    }
}
