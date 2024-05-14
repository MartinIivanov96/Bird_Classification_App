package unidue.de;

public interface FlyingEntity {



    void fly() ;
    void liftOff();
    void land() ;

    void setMaxAirSpeed(float maxAirSpeed);

    float getMaxAirSpeed();
}
