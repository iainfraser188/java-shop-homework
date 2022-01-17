public class Guitar extends Instrument implements IPlay,ISell{

    private int NoOfStrings;
    private String GuitarType;

    public Guitar( String name,String material, String colour, InstrumentType instrumentType, String manufacturer,int stockPrice, int retailPrice, int NoOfStrings, String GuitarType) {
        super(name, material, colour, instrumentType , manufacturer,stockPrice,retailPrice);
        this.NoOfStrings = NoOfStrings;
        this.GuitarType = GuitarType;
    }


    public int getNoOfStrings() {
        return NoOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        NoOfStrings = noOfStrings;
    }

    public String getGuitarType() {
        return GuitarType;
    }

    public void setGuitarType(String guitarType) {
        GuitarType = guitarType;
    }

    public String play(){
        return "Twang";
    }


}
