package unidue.de;

public class BasicFlyBehaviour implements FlyingBehaviour {
    private float maxAirSpeed;
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
        System.out.println("Ich fliege über die Bergen mit " + this.getMaxAirSpeed() + "km/h");
    }

    @Override
    public void liftOff() {
        System.out.println("Vom Nest abgeflogen");
    }

    @Override
    public void land() {
        System.out.println("Im nest gelandet");
    }


}
