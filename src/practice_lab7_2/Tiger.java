package practice_lab7_2;

import java.security.SecureRandom;

public class Tiger extends Animal{

    public Tiger(){
        int randomSpeed = new SecureRandom().nextInt(100);
        this.name = "Tiger";
        this.speed = randomSpeed;
    }
}
