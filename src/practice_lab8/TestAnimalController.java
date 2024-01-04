package practice_lab8;

import practice_lab8.AnimalWithBuilder.Builder;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestAnimalController {
    public static void main(String[] args) {

        AnimalWithBuilder eagle = new Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(60)).setFlyable(true).build();
        AnimalWithBuilder falcon = new Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(80)).setFlyable(true).build();
        AnimalWithBuilder horse = new Builder().setName("Horse").setSpeed(new SecureRandom().nextInt(70)).setFlyable(false).build();
        AnimalWithBuilder tiger = new Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(90)).setFlyable(false).build();
        AnimalWithBuilder dog = new Builder().setName("Dog").setSpeed(new SecureRandom().nextInt(50)).setFlyable(false).build();

        List<AnimalWithBuilder> animal = new ArrayList<>();
        animal.add(eagle);
        animal.add(falcon);
        animal.add(horse);
        animal.add(tiger);
        animal.add(dog);

        AnimalWithBuilder winner = AnimalController.getWinner(animal);
        System.out.println(winner.getName() + " " + winner.getSpeed());
    }
}
