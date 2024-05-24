package unidue.de;


public class Puffin extends Bird  {

    Puffin(String name, int age, float weight) {
    super(name, age, weight,new BasicFlyBehaviour(), new BasicSwimmingBehaviour() );
    getFlyingBehaviour().setMaxAirSpeed(35f);
    getSwimmingBehaviour().setMaxWaterSpeed(25f);
    }


    @Override
    public void eatFood() {
        System.out.println("Ich esse kleine Fische und Insekten.");
    }

}
