package java_lab8;

import java.util.List;

public class AnimalBuilderController {
    public static AnimalWithBuilder getWinner(List<AnimalWithBuilder> animalList) {
        AnimalWithBuilder winner = animalList.get(0);
        for (AnimalWithBuilder animal : animalList) {
            if (!animal.isFlyable()) {
                if (winner.getSpeed() < animal.getSpeed()) {
                    winner = animal;
                }
            }
        }
        return winner;
    }
}
