package practice_lab9;

import java.security.SecureRandom;

public class Elephant extends Animal{

    public Elephant(){
        int randomSpeed =(new SecureRandom().nextInt(2)+3)*6;
        this.name = "Elephant";
        this.speed = randomSpeed;
    }
}
