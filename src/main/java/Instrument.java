public abstract class Instrument implements IPlay,ISell{

    private String name;
    private String material;
    private String colour;
    private InstrumentType instrumentType;
    private String manufacturer;
    private int stockPrice;
    private int retailPrice;



    public Instrument(String name,String material, String colour, InstrumentType instrumentType, String manufacturer, int stockPrice, int retailPrice) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.manufacturer = manufacturer;
        this.stockPrice = stockPrice;
        this.retailPrice = retailPrice;
    }

    public String getName(){
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }


    public InstrumentType getType() {
        return instrumentType;
    }


    public String getManufacturer() {
        return manufacturer;
    }


    public int getStockPrice() {
        return stockPrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public double calculateMarkup() {
        return retailPrice - stockPrice;
    }
}
