package unidue.de;

public class NoSwimmingBehaviour implements SwimmingBehaviour {
    @Override
    public void jumpIntoWater() {
        System.out.println("Ich kann nicht ins wasser Springen");
    }

    @Override
    public void swim() {
        System.out.println("Ich kann nicht schwimmen.");
    }

    @Override
    public void leaveWater() {
        System.out.println("Ich kann nicht aus dem Wasser rauskommen");
    }

    @Override
    public void setMaxWaterSpeed(float maxWaterSpeed) {

    }

    @Override
    public float getMaxWaterSpeed() {
        return 0;
    }
}
