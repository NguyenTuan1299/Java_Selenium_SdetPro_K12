package practice_lab8;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public static AnimalWithBuilder getWinner(List<AnimalWithBuilder> animalList) {
        List<AnimalWithBuilder> nonFlyableAnimal = new ArrayList<>();
        for (AnimalWithBuilder animal : animalList) {
            if (!animal.isFlyable()) {
                nonFlyableAnimal.add(animal);
            }
        }
        AnimalWithBuilder winner = nonFlyableAnimal.get(0);
        for (AnimalWithBuilder animal : nonFlyableAnimal) {
            if (animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
        return winner;
    }

}
