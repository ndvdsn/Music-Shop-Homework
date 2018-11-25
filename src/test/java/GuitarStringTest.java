import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
         guitarStrings = new GuitarStrings("Gut", "Fish Farm", "Stinkers", 3, 6);
    }

    @Test
    public void canGetType() {
        assertEquals("Gut", guitarStrings.getType());
    }

    @Test
    public void canSetType() {
        guitarStrings.setType("Steel");
        assertEquals("Steel", guitarStrings.getType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Fish Farm", guitarStrings.getMake());
    }

    @Test
    public void canSetMake() {
        guitarStrings.setMake("Blase");
        assertEquals("Blase", guitarStrings.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Stinkers", guitarStrings.getModel());
    }

    @Test
    public void canSetModel() {
        guitarStrings.setModel("Blouse");
        assertEquals("Blouse", guitarStrings.getModel());
    }


    @Test
    public void canGetCostPrice() {
        assertEquals(3, guitarStrings.getCostPrice());
    }

    @Test
    public void canSetCostPrice() {
        guitarStrings.setCostPrice(4);
        assertEquals(4, guitarStrings.getCostPrice());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(6, guitarStrings.getSalePrice());
    }

    @Test
    public void canSetSalePrice() {
        guitarStrings.setSalePrice(9);
        assertEquals(9, guitarStrings.getSalePrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3, guitarStrings.calculateMarkup(), 0.01);
    }
}
