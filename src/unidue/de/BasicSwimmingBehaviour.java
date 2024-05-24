package unidue.de;

public class BasicSwimmingBehaviour implements SwimmingBehaviour {
    private float maxWaterSpeed;


    @Override
    public void setMaxWaterSpeed(float maxWaterSpeed) {
        this.maxWaterSpeed = maxWaterSpeed;
    }

    @Override
    public float getMaxWaterSpeed() {
        return maxWaterSpeed;
    }

    @Override
    public void jumpIntoWater() {
        System.out.println("Ich springe ins Wasser");
    }

    @Override
    public void swim() {
        System.out.println("Ich schwimme mit " + this.getMaxWaterSpeed() + "km/h");
    }


    @Override
    public void leaveWater() {
        System.out.println("Ich komme aus dem Wasser raus");
    }
}
