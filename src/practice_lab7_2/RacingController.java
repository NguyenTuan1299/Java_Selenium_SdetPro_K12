package practice_lab7_2;

import java.util.List;

public class RacingController {

    public static Animal getWinner(List<Animal> animalList){
        Animal winner = new Animal();
        for (Animal animal : animalList) {
            if(animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
        return winner;
    }
}
