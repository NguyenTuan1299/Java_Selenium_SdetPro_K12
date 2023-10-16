package java_lab7_2;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Dog(), new Horse(), new Tiger());
        Animal winner = AnimalController.getWinner(animalList);
        System.out.printf("The winner is: %s with the speed: %d\n", winner.getName(), winner.getSpeed());
    }
}
