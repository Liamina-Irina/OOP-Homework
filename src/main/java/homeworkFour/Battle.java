package homeworkFour;

import homeworkFour.warriors.Warrior;

public class Battle {
    private final Warrior w1;
    private final Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        String firstName = w1.getName();
        String secondName = w2.getName();
        while ((w1.getHealthPoint() > 0) || (w2.getHealthPoint() > 0)){
            int damage1 = w1.hit();
            int protect2 = w2.protectByShield();
            System.out.printf("%s hit %s with damage: %d; %s's shield protection: %d;\n",firstName,secondName, damage1,secondName,protect2);
            w2.reduceHealth(damage1, protect2);
            int damage2 = w2.hit();
            int protect1 = w1.protectByShield();
            if (w2.getHealthPoint() <= 0){
                System.out.println();
                System.out.printf("END OF THE FIGHT: %s WON; %s LOST.", firstName, secondName);
                System.out.println();
                break;
            }
            w1.reduceHealth(damage2, protect1);
            System.out.printf("%s hit %s with damage: %d; %s's shield protection: %d;\n",secondName,firstName, damage2,firstName, protect1);
            if (w1.getHealthPoint() <= 0){
                System.out.println();
                System.out.printf("END OF THE FIGHT: %s LOST; %s WON.", firstName, secondName);
                System.out.println();
                break;
            }
            System.out.printf("%s's HealthPoint: %d; %s's HealthPoint: %d.\n",firstName, w1.getHealthPoint(),secondName, w2.getHealthPoint());
            System.out.println();
        }
    }
}