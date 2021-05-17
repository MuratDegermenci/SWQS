import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KalenderTest {

    Kalender kalender;

    @Before
    public void setup(){
        kalender = new Kalender();
    }

    @Test
    public void tagGültig() {

        boolean testJan = kalender.tagGültig(31,1);
        boolean testFebTrue = kalender.tagGültig(10,2);
        boolean testFebFalse = kalender.tagGültig(30,2);
        boolean testJun = kalender.tagGültig(7,6);
        boolean testUng = kalender.tagGültig(50,13);


        assertTrue(testJan);
        assertTrue(testFebTrue);
        assertFalse(testFebFalse);
        assertFalse(testJun);
        assertFalse(testUng);

    }

    @After
    public void teardown(){
        kalender = null;
    }
}