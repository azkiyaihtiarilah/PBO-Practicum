public class TwsDemo {
    public static void main(String[] args) {
        Tws tws1 = new Tws();
        tws1.merk = "Lenovo";
        tws1.color = "Hitam";
        tws1.batrai = 100;

        System.out.println("True Wireless Stereo Details     " );
        System.out.println("Merk                : " + tws1.merk);
        System.out.println("Color               : " + tws1.color);
        System.out.println("Batrai              : " + tws1.batrai);
        System.out.println("Penggunaan Batrai   : " + tws1.kurangDaya(tws1.batrai, 30) + " menit");
        tws1.turnOn();
        System.out.println();
    }
}
