package practice_lab9;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public static void getRoundWinner(List<Animal> animalList) {
        List<Animal> listWinner = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            Animal roundWinner = new Animal();
            for (Animal animal : animalList) {
                if (roundWinner.getSpeed() < animal.getSpeed()) {
                    roundWinner = animal;
                }
            }
            listWinner.add(roundWinner);
        }

        for (Animal winner : listWinner) {
            System.out.println(winner);
        }
    }
}
    