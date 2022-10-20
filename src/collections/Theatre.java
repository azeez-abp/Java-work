package collections;

public class Theatre {
    private final String theatreName ;
    private boolean hasSeat;
    ///////////field is set to property
    //////////properties can be assigned to parameter
    ///field=>props=>param
    public Theatre(String theatreName,int numRow,int seatPerRow) {
        this.theatreName = theatreName;
        this.hasSeat  = false;
        int lastSeat  = 'A'+(numRow-1);
        char a = 'A';
        //System.out.println(String.format("%2d",a));
    }
}
