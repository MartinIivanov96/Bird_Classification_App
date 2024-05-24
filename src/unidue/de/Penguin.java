package unidue.de;

public class Penguin extends Bird  {


    Penguin(String name, int age, float weight) {
        super(name, age, weight, new NoFlyBehaviour(), new BasicSwimmingBehaviour());
        getSwimmingBehaviour().setMaxWaterSpeed(50f);
    }

    @Override
    public void eatFood() {
        System.out.println("Ich esse Fische");
    }


}
