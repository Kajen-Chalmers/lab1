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
    public void testSpeedFactor() {
        assert volvo.speedFactor() == 1.25;
    }



}
