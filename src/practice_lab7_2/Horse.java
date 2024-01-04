package practice_lab7_2;

import java.security.SecureRandom;

public class Horse extends Animal{

    public Horse(){
        int randomSpeed = new SecureRandom().nextInt(75);
        this.name = "Horse";
        this.speed = randomSpeed;
    }
}
