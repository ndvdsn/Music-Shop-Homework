import behaviours.ISell;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("Mahogany", "Archtop", "New", 200, 300, "Gibson", "ES 175", "Sunburst");
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
}
