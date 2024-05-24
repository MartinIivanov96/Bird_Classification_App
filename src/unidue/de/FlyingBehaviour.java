package unidue.de;

public interface FlyingBehaviour {



    void fly() ;
    void liftOff();
    void land() ;

    void setMaxAirSpeed(float maxAirSpeed);

    float getMaxAirSpeed();
}
