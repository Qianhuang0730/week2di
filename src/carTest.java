import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class carTest {
    public car car;

    @Before
    public void setUp() throws Exception {
        car = new car();
    }
    @Test
    public void testStart() {
        assertTrue(car.start());
    }

    @Test
    public void isStopped() {
        assertFalse(car.isStopped());
    }

}