package homeworkTwo;

import homeworkTwo.inhabitants.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private final List<Animal> aquarium = new ArrayList<>();

    public Aquarium addAnimal(Animal animal){
        aquarium.add(animal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Обитатели аквариума:\n");
        for (Animal animal: aquarium) {
            builder.append(animal)
                    .append('\n');
        }
        return builder.toString();
    }

    private List<SwimSpeed> getSwimmers() {
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Animal animal : aquarium) {
            if (animal instanceof SwimSpeed) {
                swimmers.add((SwimSpeed) animal);
            }
        }
        return swimmers;
    }

    public SwimSpeed getFastestSwimmer() {
        List<SwimSpeed> swimmers = getSwimmers();
        SwimSpeed fastestSwimmer = swimmers.get(0);
        for (SwimSpeed swimmer : swimmers) {
            if (swimmer.getSwimSpeed() > fastestSwimmer.getSwimSpeed()) {
                fastestSwimmer = swimmer;
            }
        }
        return fastestSwimmer;
    }

}
