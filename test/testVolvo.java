import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class testVolvo {

    private Volvo240 volvo;
    @Before
    public void init(){
        volvo = new Volvo240();
    }
    @Test
    public void testGetPosition() {
        volvo.setPosition(new Point (2,10));
        assert  volvo.getPosition().getY() == 10;
        assert  volvo.getPosition().getX() == 2;
        }

    @Test
    public void testGetDirection() {
        volvo.setCurrentDirection(2);
        assert volvo.getDirection() == "South";
    }
    @Test
    public void testGetTrimFactor(){
        assert volvo.getTrimFactor() == 1.25;
    }
    @Test
    public void testSetTrimFactor(){
        volvo.setTrimFactor(0.5);
        assert volvo.getTrimFactor() == 0.5;
    }
   @Test
    public void testGetNrDoors() {
        assert volvo.getNrDoors() == 4;
    }
    @Test
    public void testGetEnginePower() {
        assert volvo.getEnginePower() == 100;
    }
    @Test
    public void testGetCurrentSpeed() {
        volvo.setCurrentSpeed(5);
        assert volvo.getCurrentSpeed() == 5;
    }
    @Test
    public void testGetColor() {
        assert volvo.getColor() == Color.black;
    }
    @Test
    public void testSetColor() {
        volvo.setColor(Color.red);
        assert volvo.getColor() == Color.red;
    }
    @Test
    public void testStartEngine() {
        volvo.startEngine();
        assert volvo.getCurrentSpeed() == 0.1;
    }
    @Test
    public void testStopEngine() {
        volvo.startEngine();
        volvo.stopEngine();
        assert volvo.getCurrentSpeed() == 0;
    }
    @Test
    public void testSpeedFactor() {
        assert volvo.speedFactor() == 1.25;
    }
    @Test
    public void testIncrementSpeed() {
        volvo.startEngine();
        volvo.incrementSpeed(5);
        assert volvo.getCurrentSpeed() == 6.35;
    }
    @Test
    public void testDecrementSpeed() {
        volvo.startEngine();
        volvo.incrementSpeed(10);
        volvo.decrementSpeed(5);
        assert volvo.getCurrentSpeed() == 6.35;
    }
    @Test
    public void testGas() {
        //Chilla med detta
        volvo.startEngine();
        volvo.gas(5);
        assert volvo.getCurrentSpeed() == 6.35;
    }
    @Test
    public void testBrake() {
        //Chilla med detta
        volvo.startEngine();
        volvo.setCurrentSpeed(0);
        volvo.gas(10);
        volvo.brake(5);
        assert volvo.getCurrentSpeed() == 6.25;
    }
    @Test
    public void testMove() {
        assert volvo.getPosition().getX() == 0;
        assert volvo.getPosition().getY() == 0;
        volvo.setCurrentSpeed(5);
        volvo.move();
        volvo.moveLeft();
        volvo.move();
        assert volvo.getPosition().getX() == -5;
        assert volvo.getPosition().getY() == 5;
    }
    @Test
    public void testMoveLeft() {
        assert volvo.getDirection() == "North";
        volvo.moveLeft();
        assert volvo.getDirection() == "West";
    }
    @Test
    public void testMoveRight() {
        assert volvo.getDirection() == "North";
        volvo.moveRight();
        assert volvo.getDirection() == "East";
    }

}
