package homeworkTwo.inhabitants.base;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Кличка: %s", name);
    }
}
