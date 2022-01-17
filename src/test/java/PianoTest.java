import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;


    @Before
    public void before(){

        piano1 = new Piano("GB1K","Wood","Black",InstrumentType.PERCUSSION,"Yamaha",600,1000,78,"Ivory","Grand");

    }

    @Test
    public void hasName(){
        assertEquals("GB1K", piano1.getName());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Wood",piano1.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Black", piano1.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION,piano1.getType());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Yamaha", piano1.getManufacturer());
    }

    @Test
    public void hasStockPrice(){
        assertEquals(600,piano1.getStockPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(1000,piano1.getRetailPrice());
    }


    @Test
    public void hasNoOfKeys(){
        assertEquals(78,piano1.getNoOfKeys());
    }

    @Test
    public void hasKeyType(){
        assertEquals("Ivory",piano1.getKeyType());
    }
    @Test
    public void hasPianoType(){
        assertEquals("Grand",piano1.getPianoType());
    }

    @Test
    public void canPlaySound(){
        assertEquals("Dink", piano1.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(400,piano1.calculateMarkup(),0.0);
    }
}
