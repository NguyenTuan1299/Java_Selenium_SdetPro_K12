package practice_lab8;

public class AnimalWithBuilder {

    private String name;
    private int speed;
    private boolean flyable;

    public AnimalWithBuilder() {
    }

    public AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder{
        private String name;
        private int speed;
        private boolean flyable;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }
    }
}
