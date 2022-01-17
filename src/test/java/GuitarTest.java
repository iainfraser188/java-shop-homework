import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;



    @Before

    public void before(){
        guitar1 = new Guitar("Les Paul","Wood","Black",InstrumentType.STRING,"Gibson",300, 450,6,"Electric");
    }


    @Test
    public void hasName(){
        assertEquals("Les Paul", guitar1.getName());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Wood",guitar1.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Black", guitar1.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING,guitar1.getType());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Gibson", guitar1.getManufacturer());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6,guitar1.getNoOfStrings());
    }

    @Test
    public void hasStockPrice(){
        assertEquals(300,guitar1.getStockPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(450,guitar1.getRetailPrice());
    }

    @Test
    public void hasGuitarType(){
        assertEquals("Electric",guitar1.getGuitarType());
    }

    @Test
    public void canPlaySound(){
        assertEquals("Twang", guitar1.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(150,guitar1.calculateMarkup(),0.0);
    }



}
