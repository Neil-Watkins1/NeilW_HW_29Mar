package Accessories;

public class SheetMusic extends Accessories{



    private SheetMusic sheetMusic;
    private double costPrice;
    private double retailPrice;
    private String  title;
    private String composer;





    public SheetMusic(double costPrice, double retailPrice, String title, String composer) {
        super(costPrice, retailPrice);
        this.title = title;
        this.composer = composer;


    }





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }
}
