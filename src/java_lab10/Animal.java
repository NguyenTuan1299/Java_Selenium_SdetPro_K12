package java_lab10;

public abstract class Animal {
    protected String name;
    protected int speed;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSpeed();

    public abstract int setSpeed();
}
