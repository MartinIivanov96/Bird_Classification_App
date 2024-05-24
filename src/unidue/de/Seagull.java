package unidue.de;

public class Seagull extends Bird {

    Seagull(String name, int age, float weight) {
        super(name, age, weight, new BasicFlyBehaviour(), new NoSwimmingBehaviour());
        getFlyingBehaviour().setMaxAirSpeed(60f);
        getSwimmingBehaviour().setMaxWaterSpeed(0.5f);
    }

    @Override
    public void eatFood() {
        System.out.println("Ich esse Fische");
    }

    }
