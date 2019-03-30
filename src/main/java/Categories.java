public enum Categories {

    STRINGS(10),
    WOODWIND(5),
    BRASS(10),
    PERCUSSION(5);

    public final int leadTime;
    Categories(int leadTime){
        this.leadTime = leadTime;
    }
}
