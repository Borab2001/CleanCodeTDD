package banjoMandolin;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BanjoMandolinTest {

    @Test
    public void testMultipleOfThree() {
        BanjoMandolin bm = new BanjoMandolin();
        assertEquals("Banjo", bm.getOutput(3));
    }

    @Test
    public void testMultipleOfFive() {
        BanjoMandolin bm = new BanjoMandolin();
        assertEquals("Mandolin", bm.getOutput(5));
    }

    @Test
    public void testMultipleOfThreeAndFive() {
        BanjoMandolin bm = new BanjoMandolin();
        assertEquals("BanjoMandolin", bm.getOutput(15));
    }
}
