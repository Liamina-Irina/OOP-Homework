package homeworkOne;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine apparat = new CoffeeMachine();
        apparat.addCoffee (new Coffee("Cappuccino", 250, 35,
                        200))
                .addCoffee(new Coffee("Latte Macciatto", 200, 40, 200))
                .addCoffee(new Coffee("Americano", 200, 40, 150))
                .addCoffee(new Coffee("Latte", 250, 30, 200));

        System.out.println(apparat);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Coffee coffee1 = apparat.saleCoffee("Latte");
        String soldCoffee1 = String.format("Продано: %s за %.2f руб.\n", coffee1.getCoffeeName(), coffee1.getCoffeePrice());
        System.out.println(soldCoffee1);
        System.out.println(apparat);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Coffee coffee2 = apparat.saleCoffee("Cappuccino");
        String soldCoffee2 = String.format("Продано: %s за %.2f руб.\n", coffee2.getCoffeeName(), coffee2.getCoffeePrice());
        System.out.println(soldCoffee2);
        System.out.println(apparat);
    }
}
