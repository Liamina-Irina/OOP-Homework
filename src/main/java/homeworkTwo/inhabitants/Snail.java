package homeworkTwo.inhabitants;

import homeworkTwo.inhabitants.base.Mollusc;

public class Snail extends Mollusc {
    public Snail(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Улитка: %s, Корм: %s", super.toString(), feed());
    }

}
