package practice_lab9;

import java.security.SecureRandom;

public class Horse extends Animal{

    public Horse(){
        int randomSpeed = new SecureRandom().nextInt(10)+15;
        this.name = "Horse";
        this.speed = randomSpeed;
    }
}
