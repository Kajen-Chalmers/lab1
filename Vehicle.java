import java.awt.*;

public abstract class Vehicle implements Movable{

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public double trimFactor = 1.0;
    public Point position = new Point(0, 0);
    public String[] directions = {"North", "East", "South", "West"};
    public int currentDirection = 0;

    public Point getPosition(){
        return position;
    }

    public String getDirection(){
        return directions[currentDirection];
    }


    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }


    protected double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    protected void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    protected void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public void gas(double amount){
        incrementSpeed(amount);
    }

    public void brake(double amount){
        decrementSpeed(amount);
    }
}
