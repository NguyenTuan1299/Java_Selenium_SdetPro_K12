package java_lab8;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import static java_lab8.AnimalWithBuilder.Builder;

public class AnimalBuilderTest {
    public static void main(String[] args) {

        AnimalWithBuilder cat = new Builder().setName("Cat").setSpeed(new SecureRandom().nextInt(40)).setFlyable(false).build();
        AnimalWithBuilder lion = new Builder().setName("Lion").setSpeed(new SecureRandom().nextInt(60)).setFlyable(false).build();
        AnimalWithBuilder eagle = new Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(80)).setFlyable(true).build();
        AnimalWithBuilder falcon = new Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(70)).setFlyable(true).build();

        List<AnimalWithBuilder> animalList = Arrays.asList(cat, lion, eagle, falcon);
        AnimalWithBuilder winner = AnimalBuilderController.getWinner(animalList);
        System.out.println("The winner is: " + winner.getName() + " with the speed " + winner.getSpeed() + " and flyable is " + winner.isFlyable());

    }
}
