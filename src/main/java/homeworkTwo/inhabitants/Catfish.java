package homeworkTwo.inhabitants;

import homeworkTwo.SwimSpeed;
import homeworkTwo.inhabitants.base.Fish;

public class Catfish extends Fish implements SwimSpeed {
    public Catfish(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "всеядный";
    }

    @Override
    public String toString() {
        return String.format("Сом: %s, Корм: %s, Скорость плавания: %d км/ч", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }
}
