import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class testSaab {
    private Saab95 saab;
    @Before
    public void init(){
        saab = new Saab95();
    }
    @Test
    public void testGetPosition() {
        saab.setPosition(new Point(2,10));
        assert  saab.getPosition().getY() == 10;
        assert  saab.getPosition().getX() == 2;
    }

    @Test
    public void testGetDirection() {
        saab.setCurrentDirection(2);
        assert saab.getDirection() == "South";
    }

    @Test
    public void testGetNrDoors() {
        assert saab.getNrDoors() == 2;
    }
    @Test
    public void testGetEnginePower() {
        assert saab.getEnginePower() == 125;
    }
    @Test
    public void testGetCurrentSpeed() {
        saab.setCurrentSpeed(5);
        assert saab.getCurrentSpeed() == 5;
    }
    @Test
    public void testGetColor() {
        assert saab.getColor() == Color.red;
    }
    @Test
    public void testSetColor() {
        saab.setColor(Color.black);
        assert saab.getColor() == Color.black;
    }
    @Test
    public void testGetModelName(){
        assert saab.getModelName() == "Saab95";
    }
    @Test
    public void testSetModelName(){
        saab.setModelName("Saab21");
        assert saab.getModelName() == "Saab21";
    }
    @Test
    public void testStartEngine() {
        saab.startEngine();
        assert saab.getCurrentSpeed() == 0.1;
    }
    @Test
    public void testStopEngine() {
        saab.startEngine();
        saab.stopEngine();
        assert saab.getCurrentSpeed() == 0;
    }
    @Test
    public void testSpeedFactor() {
        assert saab.speedFactor() == 1.25;
        saab.setTurboOn();
        assert saab.speedFactor() == 1.625;
    }
    @Test
    public void testGetTurboOn() {
        saab.setTurboOn();
        assert saab.getTurboOn();
    }
    @Test
    public void testSetTurboOn(){
        saab.setTurboOn();
        assert saab.getTurboOn();
    }
    @Test
    public void testSetTurboOff(){
        saab.setTurboOn();
        saab.setTurboOff();
        assert !saab.getTurboOn();
    }
    @Test
    public void testGetTurbo(){
        saab.setTurbo(5.0);
        assert saab.getTurbo() == 5.0;
    }
    @Test
    public void testSetTurbo(){
        saab.setTurbo(5.2);
        assert saab.getTurbo() == 5.2;
    }
    @Test
    public void testIncrementSpeed() {
        saab.startEngine();
        saab.setTurboOn();
        saab.incrementSpeed(5);
        assert saab.getCurrentSpeed() == 8.225;
    }
    @Test
    public void testDecrementSpeed() {
        saab.startEngine();
        saab.setTurboOn();
        saab.incrementSpeed(15);
        saab.decrementSpeed(5);
        assert saab.getCurrentSpeed() == 16.35;
    }
    @Test
    public void testGas() {
        //Chilla med detta
        saab.startEngine();
        saab.gas(5);
        assert saab.getCurrentSpeed() == 6.35;
    }
    @Test
    public void testBrake() {
        //Chilla med detta
        saab.startEngine();
        saab.setCurrentSpeed(0);
        saab.gas(10);
        saab.brake(5);
        assert saab.getCurrentSpeed() == 6.25;
    }
    @Test
    public void testMove() {
        assert saab.getPosition().getX() == 0;
        assert saab.getPosition().getY() == 0;
        saab.setCurrentSpeed(5);
        saab.move();
        saab.moveLeft();
        saab.move();
        assert saab.getPosition().getX() == -5;
        assert saab.getPosition().getY() == 5;
    }
    @Test
    public void testMoveLeft() {
        assert saab.getDirection() == "North";
        saab.moveLeft();
        assert saab.getDirection() == "West";
    }
    @Test
    public void testMoveRight() {
        assert saab.getDirection() == "North";
        saab.moveRight();
        assert saab.getDirection() == "East";
    }
}
