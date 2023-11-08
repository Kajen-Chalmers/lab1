import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testSaab {
    private Saab95 saab = new Saab95();
    @Before
    public void testSpeedBeforeTests(){
        //Det här testas före varje test

    }
    @Test
    public void testSetTurboOn(){
        //Det här är testet
        saab.setTurboOn();
    }

    @After
    public void testSpeedAfterTest(){
        //Det här testas efter varje test

    }

    @Test
    public void testSetTurboOff(){

    }
}
