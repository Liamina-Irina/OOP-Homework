package homeworkTwo.inhabitants;

import homeworkTwo.SwimSpeed;
import homeworkTwo.inhabitants.base.Amphibian;

public class Turtle extends Amphibian implements SwimSpeed {

    public Turtle(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Черепашка: %s, Корм: %s, Скорость плавания: %d км/ч", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 1;
    }
}
