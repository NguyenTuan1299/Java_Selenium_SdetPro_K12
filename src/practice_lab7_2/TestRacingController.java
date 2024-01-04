package practice_lab7_2;

import java.util.ArrayList;
import java.util.List;

public class TestRacingController {

    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();
        animal.add(new Horse());
        animal.add(new Tiger());
        animal.add(new Dog());
        Animal winner = RacingController.getWinner(animal);
        System.out.println("Name: " + winner.getName());
        System.out.println("Speed: " + winner.getSpeed());
        System.out.println(winner);
    }
}

