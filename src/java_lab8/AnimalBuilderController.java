package java_lab8;

import java.util.ArrayList;
import java.util.List;

public class AnimalBuilderController {
    public static AnimalWithBuilder getWinner(List<AnimalWithBuilder> animalList) {
        List<AnimalWithBuilder> nonFlyableAnimal = new ArrayList<>();

        for (AnimalWithBuilder animalWithBuilder : animalList) {
            if (!animalWithBuilder.isFlyable()) {
                nonFlyableAnimal.add(animalWithBuilder);
            }
        }

        AnimalWithBuilder winner = nonFlyableAnimal.get(0);
        for (AnimalWithBuilder animal : nonFlyableAnimal) {
            if (winner.getSpeed() < animal.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }
}
