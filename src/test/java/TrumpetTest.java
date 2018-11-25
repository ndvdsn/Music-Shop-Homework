import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("Brass", "Bb", "Second Hand", 500, 800, "Bach", "Stradavarius 43", "Silver Plate", 3);
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canSetNumberOfValves() {
        trumpet.setNumberOfValves(4);
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("playing trumpet sounds", trumpet.play("trumpet"));
    }
}
