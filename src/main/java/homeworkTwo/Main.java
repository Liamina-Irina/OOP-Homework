package homeworkTwo;

import homeworkTwo.inhabitants.Guppy;
import homeworkTwo.inhabitants.Turtle;
import homeworkTwo.inhabitants.Catfish;
import homeworkTwo.inhabitants.Snail;

public class Main {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(new Turtle("Ниндзя")).addAnimal(new Guppy("Дори")).
                addAnimal(new Snail("Безымянная")).addAnimal(new Catfish("Чистильщик"));

        System.out.println(aquarium);

        System.out.println("Самый быстрый обитатель аквариума:");
        System.out.println(aquarium.getFastestSwimmer());
    }
}
