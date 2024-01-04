package java_lab10;

import java.security.SecureRandom;

public class Dog extends Animal{

    private final static int MAX_SPEED = 60;
    public Dog(){
        this.name = "Dog";
        this.speed = setSpeed();
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int setSpeed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
