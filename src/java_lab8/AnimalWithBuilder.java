package java_lab8;

public class AnimalWithBuilder {
    private int speed;
    private String name;
    private boolean flyable;

    public AnimalWithBuilder() {
    }

    protected AnimalWithBuilder(Builder builder) {
        this.speed = builder.speed;
        this.name = builder.name;
        this.flyable = builder.flyable;
    }

    // Read-only

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    // Inner class
    public static class Builder {
        // Writer only
        private int speed;
        private String name;
        private boolean flyable;

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }
}
