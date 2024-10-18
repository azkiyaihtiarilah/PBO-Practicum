/**
 * Helikopter
 */
public class Helikopter {

    //atribut
    String name;
    String merk;
    int kecepatan;

    //method
    public static int tambahKec(int kecepatan, int increment){
        kecepatan += increment;
        return kecepatan;
    }
    
    public static int kurangKec(int kecepatan, int decrement){
        kecepatan -= decrement;
        return kecepatan;
    }
}