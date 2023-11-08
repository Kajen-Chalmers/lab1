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

    @Override
    protected void incrementSpeed(double amount){
	    setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }

    @Override
    protected void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
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


    @Override
    public void move() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
