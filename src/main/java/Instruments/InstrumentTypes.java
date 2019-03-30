package Instruments;

public enum InstrumentTypes {


        STRINGS(10),
        WOODWIND(5),
        BRASS(10),
        PERCUSSION(5);

        public final int leadTime;
        InstrumentTypes(int leadTime){
            this.leadTime = leadTime;
        }
    }

