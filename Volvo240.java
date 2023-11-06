import java.awt.*;

public class Volvo240 extends Vehicle{

    private final static double trimFactor = 1.25;
    
    private Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    
    private double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    @Override
    protected void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    @Override
    protected void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }


    public static void main(String[] args) {
        Volvo240 myVolvo = new Volvo240();
        myVolvo.startEngine();
        myVolvo.gas(15);
        double recievedSpeed = myVolvo.getCurrentSpeed();
        System.out.println(recievedSpeed);
        myVolvo.gas(5);
        recievedSpeed = myVolvo.getCurrentSpeed();
        System.out.println(recievedSpeed);
    }

}
