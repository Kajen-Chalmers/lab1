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

    
    @Override
    protected double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }



    public static void main(String[] args) {
        Saab95 mySaab = new Saab95();
        mySaab.startEngine();
        mySaab.gas(15);
        double recievedSpeed = mySaab.getCurrentSpeed();
        System.out.println(recievedSpeed);
        mySaab.gas(5);
        recievedSpeed = mySaab.getCurrentSpeed();
        System.out.println(recievedSpeed);
        mySaab.moveLeft();

        System.out.println(mySaab.getDirection());
    }

    @Override
    public void move() {

        switch(getDirection()) {
            case "North":
                //+Y
                break;
            case "East":
                //+X
                break;
            case "South":
                //-Y
                break;
            case "West":
                //-X
                break;
        }
        //TODO:
    }

    @Override
    public void moveLeft() {
        currentDirection -= 1;
        if (currentDirection < 0){
            currentDirection = 3;
        }

        System.out.println(currentDirection);
    }

    @Override
    public void moveRight() {
        currentDirection += 1;
        if (currentDirection > 3){
            currentDirection = 0;
        }
    }
}
