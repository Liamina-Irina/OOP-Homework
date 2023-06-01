package homeworkOne;

public class Coffee {
    private String coffeeName;
    private int coffeeVolume;
    private double coffeeTemperature;
    private double coffeePrice;

    public Coffee(String coffeeName, int coffeeVolume, double coffeeTemperature, double coffeePrice) {
        this.coffeeName = coffeeName;
        this.coffeeVolume = coffeeVolume;
        this.coffeeTemperature = coffeeTemperature;
        this.coffeePrice = coffeePrice;
    }

    @Override
    public String toString() {
        return String.format("%s, объём: %d мл, температура: %.1f ℃, цена: %.2f руб.", coffeeName, coffeeVolume, coffeeTemperature, coffeePrice);
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public double getCoffeeVolume() {
        return coffeeVolume;
    }

    public double getCoffeeTemperature() {
        return coffeeTemperature;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }
}
