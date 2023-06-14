package homeworkFour.warriors;

import homeworkFour.weapons.meleeWeapon.Melee;
import homeworkFour.shields.Shield;

public class Infantryman extends Warrior<Melee, Shield>{
    public Infantryman(String name, int healthPoint, Melee weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s.", super.toString());
    }
}
