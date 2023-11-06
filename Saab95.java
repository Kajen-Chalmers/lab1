import java.awt.*;

public class Saab95 extends Vehicle{

    private boolean turboOn;

    private Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }

    private void setTurboOn(){
        turboOn = true;
    }

    private void setTurboOff(){
        turboOn = false;
    }

    
    private double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    @Override
    protected void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    protected void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public static void main(String[] args) {
        Saab95 mySaab = new Saab95();
        mySaab.startEngine();
        mySaab.gas(15);
        double recievedSpeed = mySaab.getCurrentSpeed();
        System.out.println(recievedSpeed);
        mySaab.setTurboOn();
        mySaab.gas(5);
        recievedSpeed = mySaab.getCurrentSpeed();
        System.out.println(recievedSpeed);
        mySaab.setTurboOff();
    }

}
