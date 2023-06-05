package homeworkTwo.inhabitants.base;

public abstract class Mollusc extends Animal {
    public Mollusc(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Моллюск: %s", super.toString());
    }

    @Override
    public String feed() {
        return "корм для рыбок";
    }
}
