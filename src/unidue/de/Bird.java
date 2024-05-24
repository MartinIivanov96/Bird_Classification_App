package unidue.de;

public abstract class Bird {
    private String name;
    private int age;
    private float weight;
    private FlyingBehaviour flyingBehaviour;
    private SwimmingBehaviour swimmingBehaviour;

    public Bird() {}

    public Bird(String name, int age, float weight, FlyingBehaviour flyingBehaviour, SwimmingBehaviour swimmingBehaviour) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.flyingBehaviour = flyingBehaviour;
        this.swimmingBehaviour = swimmingBehaviour;
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

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void setSwimmingBehaviour(SwimmingBehaviour swimmingBehaviour) {
        this.swimmingBehaviour = swimmingBehaviour;
    }

    public FlyingBehaviour getFlyingBehaviour() {
        return flyingBehaviour;
    }

    public SwimmingBehaviour getSwimmingBehaviour() {
        return swimmingBehaviour;
    }
}
