package unidue.de;


public class Puffin extends Bird {
    private float maxAirSpeed, maxWaterSpeed;

    Puffin(String name, int age, float weight, float maxAirSpeed, float maxWaterSpeed) {
    super(name, age, weight);
    this.setMaxAirSpeed(maxAirSpeed);
    this.setMaxWaterSpeed(maxWaterSpeed);
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
    public void setMaxWaterSpeed(float maxWaterSpeed) {
        this.maxWaterSpeed = maxWaterSpeed;
    }

    @Override
    public float getMaxWaterSpeed() {
        return maxWaterSpeed;
    }

    @Override
    public void eatFood() {
        System.out.println("Ich esse kleine Fische und Insekten.");
    }

    @Override
    public void fly() {
        System.out.println("Ich fliege mit " + this.getMaxAirSpeed() + " km/h.");
    }

    @Override
    public void liftOff() {
        System.out.println("Ich fliege vom Ast ab.");
    }

    @Override
    public void land() {
        System.out.println("Ich lande im Nest.");
    }

    @Override
    public void jumpIntoWater() {
        System.out.println("Ich tauche ins Wasser.");
    }

    @Override
    public void swim() {
        System.out.println("Ich schwimme mit " + this.getMaxWaterSpeed() + " km/h.");
    }

    @Override
    public void leaveWater() {
        System.out.println("Ich komme aus dem Wasser raus.");
    }
}
