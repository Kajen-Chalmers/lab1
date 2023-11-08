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



    public static void main(String[] args) {
        Saab95 mySaab = new Saab95();
        mySaab.startEngine();
        mySaab.gas(15);
        double recievedSpeed = mySaab.getCurrentSpeed();
        System.out.println(recievedSpeed);
        mySaab.gas(5);
        recievedSpeed = mySaab.getCurrentSpeed();
        System.out.println(recievedSpeed);


        System.out.println(mySaab.getDirection());
        mySaab.move();
        mySaab.moveLeft();
        System.out.println(mySaab.getDirection());
        mySaab.move();
        mySaab.moveRight();
        mySaab.moveRight();
        mySaab.move();
        System.out.println(mySaab.getDirection());
        System.out.println(mySaab.getPosition());
    }

    @Override
    public void move() {

        switch(getDirection()) {
            case "North":
                //+Y
                getPosition().move((int)getPosition().getX(),   (int)getPosition().getY()+(int)Math.round(getCurrentSpeed()));
                break;

            case "East":
                //+X
                getPosition().move((int)getPosition().getX()+(int)Math.round(getCurrentSpeed()), (int)getPosition().getY());
                break;

            case "South":
                //-Y
                getPosition().move((int)getPosition().getX(),   (int)getPosition().getY()-(int)Math.round(getCurrentSpeed()));
                break;

            case "West":
                //-X
                getPosition().move((int)getPosition().getX()-(int)Math.round(getCurrentSpeed()),(int)getPosition().getY());
                break;
        }
    }

    @Override
    public void moveLeft() {
        setCurrentDirection(getCurrentDirection()-1);
        if (getCurrentDirection() < 0){
            setCurrentDirection(3);
        }
    }

    @Override
    public void moveRight() {
        setCurrentDirection(getCurrentDirection()+1);
        if (getCurrentDirection() > 3){
            setCurrentDirection(0);
        }
    }
}
