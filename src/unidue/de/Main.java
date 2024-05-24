package unidue.de;

public class Main {

    public static void main(String[] args) {
        Seagull seagull = new Seagull("Martin", 12 ,15.5f);
        Eagle eagle = new Eagle ("Dennis" , 8,6.5f);

        seagull.eatFood();
        eagle.eatFood();
        seagull.getFlyingBehaviour().liftOff();
        eagle.getFlyingBehaviour().liftOff();
        seagull.getFlyingBehaviour().fly();
        eagle.getFlyingBehaviour().fly();
        seagull.getFlyingBehaviour().land();
        eagle.getFlyingBehaviour().land();
        seagull.getSwimmingBehaviour().swim();
        eagle.getSwimmingBehaviour().swim();

        Penguin penguin = new Penguin ("Ivo", 19, 24f);
        penguin.eatFood();
        penguin.getSwimmingBehaviour().jumpIntoWater();
        penguin.getSwimmingBehaviour().swim();
        penguin.getSwimmingBehaviour().leaveWater();
        penguin.getFlyingBehaviour().fly();

        Puffin puffin = new Puffin("Cole", 13 , 13f);
        puffin.eatFood();
        puffin.getFlyingBehaviour().liftOff();
        puffin.getFlyingBehaviour().fly();
        puffin.getFlyingBehaviour().land();
        puffin.getSwimmingBehaviour().jumpIntoWater();
        puffin.getSwimmingBehaviour().swim();
        puffin.getSwimmingBehaviour().leaveWater();


    }
}
