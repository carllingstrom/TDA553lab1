 import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class Junit {
    private Saab95 saab;
    private Volvo240 volvo;

    @Before
    public void setup() {
        saab = new Saab95();
        volvo = new Volvo240();
    }
    @Test
    public void testStartEngine(){
        volvo.startEngine();
        saab.startEngine();
        assertEquals(0.1, volvo.getCurrentSpeed(), 0.0);
        assertEquals(0.1, saab.getCurrentSpeed(), 0.0);
    }
    @Test
    public void testMaxSpeed(){
        volvo.gas(1);
        saab.gas(1);
        assertEquals(volvo.enginePower, volvo.getCurrentSpeed(), volvo.enginePower);
        assertEquals(saab.enginePower, saab.getCurrentSpeed(), saab.enginePower);
    }

}
