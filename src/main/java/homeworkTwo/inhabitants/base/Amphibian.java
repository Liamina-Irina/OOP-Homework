package homeworkTwo.inhabitants.base;

public abstract class Amphibian extends Animal {
    public Amphibian(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Амфибия: %s", super.toString());
    }

    @Override
    public String feed() {
        return "листья салата";
    }

}
