package java_lab10;

import java.security.SecureRandom;

public class Horse extends Animal{

    private final static int MAX_SPEED = 75;
    public Horse(){
        this.name = "Horse";
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
