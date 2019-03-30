package Instruments;



public class Guitar extends Instruments{
    private String type;
    private int strings;


    public Guitar(InstrumentTypes instrumentTypes, String make, String model, double costPrice, double retailPrice, String type, int strings) {
        super(instrumentTypes, make, model, costPrice, retailPrice);
        this.type = type;
        this.strings = strings;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}
