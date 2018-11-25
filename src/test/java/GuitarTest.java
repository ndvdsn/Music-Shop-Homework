import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {


    Guitar guitar;


    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Mahogany", "Archtop", "New", 200, 300, "Gibson", "ES 175", "Sunburst");
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Archtop", guitar.getType());
    }

    @Test
    public void canGetNewSecondHand() {
        assertEquals("New", guitar.getNewSecondHand());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(200, guitar.getCostPrice());
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(300, guitar.getSalePrice());
    }

    @Test
    public void canGetMake() {
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("ES 175", guitar.getModel());
    }

    @Test
    public void canGetFinish() {
        assertEquals("Sunburst", guitar.getFinish());
    }

    @Test
    public void canSetMaterial() {
        guitar.setMaterial("Plywood");
        assertEquals("Plywood", guitar.getMaterial());
    }

    @Test
    public void canSetType() {
        guitar.setType("Solid Body");
        assertEquals("Solid Body", guitar.getType());
    }

    @Test
    public void canSetNewSecondHand() {
        guitar.setNewSecondHand("Second Hand");
        assertEquals("Second Hand", guitar.getNewSecondHand());
    }

    @Test
    public void canSetCostPrice() {
        guitar.setCostPrice(200);
        assertEquals(200, guitar.getCostPrice());
    }


    @Test
    public void canSetSalePrice() {
        guitar.setSalePrice(500);
        assertEquals(500, guitar.getSalePrice());
    }

    @Test
    public void canSetMake() {
        guitar.setMake("Hunch Back");
        assertEquals("Hunch Back", guitar.getMake());
    }

    @Test
    public void canSetModel() {
        guitar.setModel("Blueberry");
        assertEquals("Blueberry", guitar.getModel());
    }

    @Test
    public void canSetFinish() {
        guitar.setFinish("Robot");
        assertEquals("Robot", guitar.getFinish());

    }

    @Test
    public void canPlay() {
        assertEquals("playing guitar sounds", guitar.play("guitar"));

    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100, guitar.calculateMarkup(), 0.01);
    }
}
