import accessories.GuitarStrings;
import behaviours.ISell;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("Mahogany", "Archtop", "New", 200, 300, "Gibson", "ES 175", "Sunburst");
        guitarStrings = new GuitarStrings("Gut", "Apple", "Nuts", 3, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.itemCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.itemCount());
    }

    @Test
    public void canCalculateMarkUp() {
        shop.addToStock(guitar);
        shop.addToStock(guitar);
        shop.addToStock(guitarStrings);
        assertEquals(203, shop.calculateMarkup(guitar), 0.01);


    }
}
