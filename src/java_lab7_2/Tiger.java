package java_lab7_2;

import java.security.SecureRandom;

public class Tiger extends Animal {

    final int MAX_SPEED = 100;

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }

    @Override
    public String getName() {
        return "Tiger";
    }
}
