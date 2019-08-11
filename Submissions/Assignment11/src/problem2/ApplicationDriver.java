package problem2;

public class ApplicationDriver {
    public static void main(String[] args) {
        Transformer t1 = new Transformer( "Soundwave", "D", 8,9,2,6,7,5,6,10 );
        t1.overallRating();

        Transformer t2 = new Transformer( "Bluestreak", "A",6,6,7,9,5,2,9,7 );
        t2.overallRating();
    }
}
