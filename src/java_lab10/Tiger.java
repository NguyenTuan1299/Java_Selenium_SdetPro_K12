package java_lab10;

import java.security.SecureRandom;

public class Tiger extends Animal{

    private final static int MAX_SPEED = 100;
    Tiger(){
        this.name = "Tiger";
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
