package java_lab7_2;

import java.security.SecureRandom;

public class Horse extends Animal {

    final int MAX_SPEED = 75;

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }

    @Override
    public String getName() {
        return "Horse";
    }
}
