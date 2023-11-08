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
    }
    @Test
    public void testGetEnginePower() {
    }
    @Test
    public void testGetCurrentSpeed() {
    }
    @Test
    public void testGetColor() {
    }
    @Test
    public void testSetColor() {
    }
    @Test
    public void testStartEngine() {
    }
    @Test
    public void testStopEngine() {
    }
    @Test
    public void testSpeedFactor() {
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
        volvo.decrementSpeed(5);
        assert volvo.getCurrentSpeed() == 0;
        volvo.incrementSpeed(10);
        volvo.decrementSpeed(5);
        assert volvo.getCurrentSpeed() == 6.25;
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
    }
    @Test
    public void testMoveLeft() {
    }
    @Test
    public void testMoveRight() {
    }

}
