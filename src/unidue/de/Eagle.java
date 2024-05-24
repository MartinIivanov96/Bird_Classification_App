package unidue.de;

public class Eagle extends Bird {

    Eagle(String name, int age, float weight) {
        super(name, age, weight, new BasicFlyBehaviour(), new NoSwimmingBehaviour());
        getFlyingBehaviour().setMaxAirSpeed(100f);
    }
    @Override
    public void eatFood() {
        System.out.println("Ich esse kleinere Säugetiere");
    }




}
