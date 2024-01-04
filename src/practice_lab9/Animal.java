package practice_lab9;

public class Animal {
    protected int speed;
    protected String name;

    public Animal() {
    }

    public Animal(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
