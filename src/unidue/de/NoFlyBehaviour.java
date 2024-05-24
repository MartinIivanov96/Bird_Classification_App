package unidue.de;

public class NoFlyBehaviour implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I kann nicht fliegen.");
    }

    @Override
    public void liftOff() {
        System.out.println("I kann nicht abfliegen.");
    }

    @Override
    public void land() {
        System.out.println("I kann nicht landen.");
    }

    @Override
    public void setMaxAirSpeed(float maxAirSpeed) {

    }

    @Override
    public float getMaxAirSpeed() {
        return 0;
    }
}
