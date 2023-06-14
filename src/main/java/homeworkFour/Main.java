package homeworkFour;

import homeworkFour.shields.Buckler;
import homeworkFour.shields.ChainVest;
import homeworkFour.warriors.Archer;
import homeworkFour.warriors.Infantryman;
import homeworkFour.warriors.Warrior;
import homeworkFour.weapons.meleeWeapon.Axe;
import homeworkFour.weapons.meleeWeapon.Sword;
import homeworkFour.weapons.rangedWeapon.Bow;
import homeworkFour.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Warrior infantry = new Infantryman("John", 10, new Sword(), new Buckler());
        Infantryman axeInfantry = new Infantryman("Daniel", 10, new Axe(), new Buckler());
        Infantryman swordInfantry = new Infantryman("Nathan", 10, new Sword(), new Buckler());
        Archer archer = new Archer("Robin", 30, new Bow(), new ChainVest());
        Archer bowArcher = new Archer("Andrew", 31, new Bow(), new ChainVest());
        Archer crossBowArcher = new Archer("Connor", 50, new CrossBow(), new ChainVest());

        Team<Warrior> team1 = new Team();
        team1.add(infantry);
        team1.add(archer);
        team1.add(new Infantryman("William", 150, new Axe(), new Buckler()));

        Team<Archer> archers = new Team<>();
        archers.add(bowArcher);
        archers.add(crossBowArcher);
        archers.add(new Archer("Kevin", 45, new CrossBow(), new ChainVest()));

        Team<Infantryman> infantries = new Team<>();
        infantries.add(axeInfantry);
        infantries.add(swordInfantry);
        infantries.add(new Infantryman("Raymond", 90, new Axe(), new Buckler()));

        System.out.println(team1);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(archers);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(infantries);
        System.out.println();

        Battle fight1 = new Battle(axeInfantry, swordInfantry);
        System.out.println("                          FIGHT:");
        fight1.fight();
    }
}


