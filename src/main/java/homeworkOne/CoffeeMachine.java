package homeworkOne;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffeeMachine = new ArrayList<>();
    private double cash = 0;

    public CoffeeMachine addCoffee(Coffee prod){
        coffeeMachine.add(prod);
        return this;
    }

    public List<Coffee> getCoffeeMachine() {
        return coffeeMachine;
    }

    public Coffee findCoffee(String name){
        for (Coffee coffee :coffeeMachine) {
            if (name.equals(coffee.getCoffeeName())){
                return coffee;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Coffee saleCoffee(String nameProd){
        Coffee found = findCoffee(nameProd);
        if (found != null){
            cash = cash + found.getCoffeePrice();
            coffeeMachine.remove(found);
        }
        return found;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Деньги в аппарате: ").append(cash).append(" руб. \n\nКофе в аппарате:\n");
        for (Coffee coffee :coffeeMachine) {
            builder.append(coffee).append("\n");
        }
        return builder.toString();
    }
}


