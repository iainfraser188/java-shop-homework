import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Piano piano1;
    private Guitar guitar1;
    private ArrayList<ISell> stock;

    @Before
    public void before() {
        stock = new ArrayList<>();
        shop = new Shop(stock);
        piano1 = new Piano("GB1K","Wood","Black",InstrumentType.PERCUSSION,"Yamaha",600,1000,78,"Ivory","Grand");
        guitar1 = new Guitar("Les Paul","Wood","Black",InstrumentType.STRING,"Gibson",300, 450,6,"Electric");

    }

    @Test
    public void canAddToInventory(){
        shop.addToInventory(guitar1);
        assertEquals(1,shop.getShopInventory().size());
    }

    @Test
    public void canGetInventory(){
        shop.addToInventory(guitar1);
        assertEquals(guitar1,shop.getShopInventory().get(0));
    }

    @Test
    public void canRemoveInventory(){
        shop.addToInventory(guitar1);
        shop.removeFromInventory(guitar1);
        assertEquals(0,shop.getShopInventory().size());
    }

    @Test
    public void canAddDiffrentTypes() {
        shop.addToInventory(guitar1);
        shop.addToInventory(piano1);
        assertEquals(2, shop.getShopInventory().size());

    }

    @Test
        public void canGetTotalStockMarkup(){
            stock.add(guitar1);
            stock.add(piano1);
            assertEquals(550, shop.getTotalMarkup(stock),0.0);
        }

}
