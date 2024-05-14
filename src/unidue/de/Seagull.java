package unidue.de;

public class Seagull extends Bird {
    private float maxAirSpeed;

    Seagull(String name, int age, float weight, float maxAirSpeed) {
        super(name, age, weight);
        this.setMaxAirSpeed(maxAirSpeed);
    }

    @Override
    public void setMaxAirSpeed(float maxAirSpeed) {
        this.maxAirSpeed = maxAirSpeed;
    }

    @Override
    public float getMaxAirSpeed() {
        return maxAirSpeed;
    }

    @Override
    public void fly() {
        System.out.println("Ich fliege über das Meer mit " + this.getMaxAirSpeed() + "km/h");
    }

    @Override
    public void liftOff() {
        System.out.println("Vom Strand abgeflogen");
    }

    @Override
    public void land() {
        System.out.println("Am Strand gelandet");
    }

    @Override
    public void eatFood() {
        System.out.println("Ich esse Fische");
    }

    }
