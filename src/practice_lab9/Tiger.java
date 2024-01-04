package practice_lab9;

import java.security.SecureRandom;

public class Tiger extends Animal{

    public Tiger(){
        int randomSpeed =  (int)((new SecureRandom().nextInt(151)+250)*0.06);
        this.name = "Tiger";
        this.speed = randomSpeed;
    }
}
