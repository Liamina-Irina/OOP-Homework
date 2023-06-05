package homeworkTwo.inhabitants.base;

public abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Рыбка: %s", super.toString());
    }

    @Override
    public String feed() {
        return "корм для рыбок";
    }

}