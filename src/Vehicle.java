import java.awt.*;

public abstract class Vehicle implements Movable{

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double trimFactor = 1.0;
    private boolean turboOn = false;
    private Point position = new Point(0, 0);
    private final String[] directions = {"North", "East", "South", "West"};
    private int currentDirection = 0;
    private double turbo;

    public int getNrDoors(){
        return nrDoors;
    }
    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }
    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getCurrentSpeed(){ return currentSpeed; }
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getTrimFactor() {
        return trimFactor;
    }
    public void setTrimFactor(double trimFactor) {
        this.trimFactor = trimFactor;
    }

    public boolean getTurboOn() {return turboOn;}
    public void setTurboOn(){ this.turboOn = true; }
    public void setTurboOff(){ this.turboOn = false; }

    public double getTurbo(){return turbo;}
    public void setTurbo(double turboMod){this.turbo = turboMod; }

    public Point getPosition(){
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color clr){
        color = clr;
    }

    public String getDirection(){
        return directions[currentDirection];
    }



    public void startEngine(){ setCurrentSpeed(0.1); }
    public void stopEngine(){ setCurrentSpeed(0); }


    protected double speedFactor(){
        return getEnginePower() * 0.01 * getTrimFactor();
    }

    private void incrementSpeed(double amount){
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));}

    private void decrementSpeed(double amount){ setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));}

    public void gas(double amount){
        if (0.0<=amount & amount<=1.0 ){incrementSpeed(amount);}
    }

    public void brake(double amount){
        decrementSpeed(amount);
    }
}
