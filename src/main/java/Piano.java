public class Piano extends Instrument implements IPlay,ISell{

    private int NoOfKeys;
    private String keyType;
    private String pianoType;

    public Piano(String name,String material, String colour, InstrumentType instrumentType, String manufacturer, int stockPrice, int retailPrice, int noOfKeys, String keyType,String pianoType) {
        super(name,material, colour, instrumentType, manufacturer, stockPrice, retailPrice);
        NoOfKeys = noOfKeys;
        this.keyType = keyType;
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public int getNoOfKeys() {
        return NoOfKeys;
    }

    public String getKeyType() {
        return keyType;
    }

    public String play(){
        return "Dink";
    }

}
