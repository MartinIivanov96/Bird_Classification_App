package unidue.de;

public class Main {

    public static void main(String[] args) {
        Seagull seagull = new Seagull("Martin", 12 , 2.5f, 50.5f);
        Eagle eagle = new Eagle ("Dennis" , 8,6.5f, 165f);

        seagull.eatFood();
        eagle.eatFood();
        seagull.liftOff();
        eagle.liftOff();
        seagull.fly();
        eagle.fly();
        seagull.land();
        eagle.land();

        Penguin penguin = new Penguin ("Ivo", 19, 24f, 30f);
        penguin.eatFood();
        penguin.jumpIntoWater();
        penguin.swim();
        penguin.leaveWater();

        Puffin puffin = new Puffin("Cole", 13 , 13f, 21f, 24f);
        puffin.eatFood();
        puffin.liftOff();
        puffin.fly();
        puffin.land();
        puffin.jumpIntoWater();
        puffin.swim();
        puffin.leaveWater();


    }
}
