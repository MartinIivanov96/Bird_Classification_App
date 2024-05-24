package unidue.de;

public interface SwimmingBehaviour {

    void jumpIntoWater() ;
    void swim() ;
    void leaveWater() ;

    void setMaxWaterSpeed(float maxWaterSpeed);

    float getMaxWaterSpeed();


}
