import java.awt.*;

public class Saab95 extends Vehicle{



    public Saab95(){
        setNrDoors(2);
        setColor(Color.red);
        setEnginePower(125);
        setModelName("Saab95");
        stopEngine();
    }


    @Override
    protected double speedFactor() {
        setTurbo(1);
        if (getTurboOn()) {setTurbo(1.3);}
        return getEnginePower() * 0.01 * getTurbo();
    }
}
