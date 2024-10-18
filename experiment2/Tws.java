/**
 * Tws
 */
public class Tws {

    //atribut
    public String merk;
    public String color;
    public int batrai;

    //method
    public boolean turnOn() {
        System.out.println("bluetooth connected ON.");
        return true;
    }

    public boolean turnOff() {
        System.out.println("bluetooth connected OFF.");
        return false;
    }
    
    public static int kurangDaya(int batrai, int decrement){
        batrai -= decrement;
        return batrai;
    }
}