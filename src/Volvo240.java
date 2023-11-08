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
        System.out.println(myVolvo.speedFactor());
        myVolvo.incrementSpeed(5);
        System.out.println(myVolvo.getCurrentSpeed());
        myVolvo.setCurrentSpeed(0);
        myVolvo.incrementSpeed(10);
        myVolvo.decrementSpeed(5);
        System.out.println(myVolvo.getCurrentSpeed());
        System.out.println(myVolvo.getPosition());
        System.out.println(new Point(0, 0));



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
