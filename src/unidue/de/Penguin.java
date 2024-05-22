package unidue.de;

public class Penguin extends Bird  implements SwimmingEntity{

    private float maxWaterSpeed;

    Penguin(String name, int age, float weight, float maxWaterSpeed) {
        super(name, age, weight);
        this.setMaxWaterSpeed(maxWaterSpeed);
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
        System.out.println("Ich esse Fische");
    }

    @Override
    public void jumpIntoWater() {
        System.out.println("Ich springe ins Wasser");
    }

    @Override
    public void leaveWater() {
        System.out.println("Ich komme aus dem Wasser raus");
    }

    @Override
    public void swim() {
        System.out.println("Ich schwimme mit " + this.getMaxWaterSpeed() + "km/h");
    }

}
