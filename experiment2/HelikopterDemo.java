public class HelikopterDemo {
    public static void main(String[] args) {
        Helikopter heli1 = new Helikopter();
        heli1.name = "Airbus H125";
        heli1.merk = "Airbus";
        heli1.kecepatan = 200;

        Helikopter heli2 = new Helikopter();
        heli2.name = "Kawasaki BK117";
        heli2.merk = "Kawasaki";
        heli2.kecepatan = 250;

        System.out.println("Helikopter 1 information" );
        System.out.println("Name                : " + heli1.name);
        System.out.println("Merk                : " + heli1.merk);
        System.out.println("Kecepatan awal      : "+ heli1.kecepatan);
        System.out.println("Kecepatan Udara     : "+ heli1.kurangKec(heli1.kecepatan,10));
        System.out.println();

        System.out.println("Helikopter 2 Information" );
        System.out.println("Name                : " + heli2.name);
        System.out.println("Merk                : " + heli2.merk);
        System.out.println("Kecepatan awal      : "+ heli2.kecepatan);
        System.out.println("Kecepatan Udara     : "+ heli2.tambahKec(heli2.kecepatan,20));
    }
}