package practice_lab7_2;

import java.security.SecureRandom;

public class Dog extends Animal{

    public Dog(){
        int randomSpeed = new SecureRandom().nextInt(60);
        this.name = "Dog";
        this.speed = randomSpeed;
    }
}
