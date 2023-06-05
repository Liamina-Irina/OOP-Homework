package homeworkTwo.inhabitants;

import homeworkTwo.SwimSpeed;
import homeworkTwo.inhabitants.base.Fish;


public class Guppy extends Fish implements SwimSpeed {
    public Guppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Гуппи: %s, Корм: %s, Скорость плавания: %d км/ч", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }
}
