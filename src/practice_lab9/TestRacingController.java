package practice_lab9;

import java.util.ArrayList;
import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Horse());
        animalList.add(new Horse());
        animalList.add(new Tiger());
        animalList.add(new Tiger());
        animalList.add(new Elephant());
        animalList.add(new Elephant());
        RacingController.getRoundWinner(animalList);
    }
}
