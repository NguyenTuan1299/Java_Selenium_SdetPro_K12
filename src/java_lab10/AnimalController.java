package java_lab10;

import java.util.List;

public class AnimalController {
    public static Animal getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (winner.getSpeed() < animal.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }
}
