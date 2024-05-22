package unidue.de;

public abstract class Bird {
    private String name;
    private int age;
    private float weight;

    public Bird() {}

    public Bird(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }




    public abstract void eatFood();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }





    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }




}
