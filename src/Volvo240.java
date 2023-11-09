import java.awt.*;

public class Volvo240 extends Vehicle{

    public Volvo240(){
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        setTrimFactor(1.25);
        stopEngine();
    }
}
