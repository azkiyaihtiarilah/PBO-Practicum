package experiment1;
/**
 * helikopterStruktural
 */
public class helikopterStruktural {

    public static void main(String[] args) {
        //variable declaration
        String name, name2, name3, name4, name5, name6, name7, name8, name9, name10;
        String merk, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        int kecepatan, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6, kecepatan7, kecepatan8, kecepatan9, kecepatan10;

        //inisialisasi variable
        name = "Bell 206 JetRanger";
        merk = "Bell";
        kecepatan = 150;

        name2 = "Airbus H125";
        merk2 = "Airbus ";
        kecepatan2 = 160;

        name3 = "Sikorsky S-76";
        merk3 = "Sikorsky ";
        kecepatan3 = 177;

        name4 = "Robinson R22";
        merk4 = "Robinson ";
        kecepatan4 = 156;

        name5 = "AW109";
        merk5 = "AgustaWestland";
        kecepatan5 = 250;

        name6 = "EC135";
        merk6 = "Eurocopter ";
        kecepatan6 = 200;

        name7 = "MD 500";
        merk7 = "MD ";
        kecepatan7 = 189;

        name8 = "AH-64 Apache";
        merk8 = "Boeing";
        kecepatan8 = 197;

        name9 = "Kawasaki BK117";
        merk9 = "Kawasaki ";
        kecepatan9 = 245;

        name10 = "Mil Mi-8";
        merk10 = "Russian ";
        kecepatan10 = 222;

        kecepatan = tambahKec(kecepatan, 150);
        kecepatan2 = kurangKec(kecepatan2, 10);
        kecepatan3 = tambahKec(kecepatan3, 100);
        kecepatan4 = tambahKec(kecepatan4, 50);
        kecepatan5 = kurangKec(kecepatan5, 70);
        kecepatan6 = tambahKec(kecepatan6, 20);
        kecepatan7 = kurangKec(kecepatan7, 30);
        kecepatan8 = tambahKec(kecepatan8, 88);
        kecepatan9 = kurangKec(kecepatan9, 99);
        kecepatan10 = kurangKec(kecepatan, 100);

        System.out.println("Name: "+ name);
        System.out.println("Merk: "+ merk);
        System.out.println("Kecepatan: "+ kecepatan);
        System.out.println();
        
        System.out.println("Name: "+ name2);
        System.out.println("Merk: "+ merk2);
        System.out.println("Kecepatan: "+ kecepatan2);
        System.out.println();

        System.out.println("Name: "+ name3);
        System.out.println("Merk: "+ merk3);
        System.out.println("Kecepatan: "+ kecepatan3);
        System.out.println();

        System.out.println("Name: "+ name4);
        System.out.println("Merk: "+ merk4);
        System.out.println("Kecepatan: "+ kecepatan4);
        System.out.println();

        System.out.println("Name: "+ name5);
        System.out.println("Merk: "+ merk5);
        System.out.println("Kecepatan: "+ kecepatan5);
        System.out.println();

        System.out.println("Name: "+ name6);
        System.out.println("Merk: "+ merk6);
        System.out.println("Kecepatan: "+ kecepatan6);
        System.out.println();

        System.out.println("Name: "+ name7);
        System.out.println("Merk: "+ merk7);
        System.out.println("Kecepatan: "+ kecepatan7);
        System.out.println();

        System.out.println("Name: "+ name8);
        System.out.println("Merk: "+ merk8);
        System.out.println("Kecepatan: "+ kecepatan8);
        System.out.println();

        System.out.println("Name: "+ name9);
        System.out.println("Merk: "+ merk9);
        System.out.println("Kecepatan: "+ kecepatan9);
        System.out.println();

        System.out.println("Name: "+ name10);
        System.out.println("Merk: "+ merk10);
        System.out.println("Kecepatan: "+ kecepatan10);
        System.out.println();
    }

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
