package experiment7.task;

public class Segitiga {
    public int Sudut = 180;

    public void totalSudut(int SudutA) {
        System.out.println("Total Sudut: " + (Sudut - SudutA));
    }

    public void totalSudut(int SudutA, int SudutB) {
        System.out.println("Total Sudut: " + (Sudut - (SudutA + SudutB)));
    }

    public void keliling(int sisiA, int sisiB, int sisiC) {
        System.out.println("Keliling: " + (sisiA + sisiB + sisiC));
    }

    public void keliling(double sisiA, double sisiB) {
        double kuadratSisiA = Math.pow(sisiA, 2);
        double kuadratSisiB = Math.pow(sisiB, 2);

        double jumlahKuadratSisi = kuadratSisiA + kuadratSisiB;

        double sisiC = Math.sqrt(jumlahKuadratSisi);

        System.out.println("Sisi C: " + sisiC);
    }
    public static void main(String[] args) {
        Segitiga sgt1 = new Segitiga();
        sgt1.totalSudut(90);
        sgt1.totalSudut(45, 90);

        Segitiga sgt2 = new Segitiga();
        sgt2.keliling(6, 9, 6);
        sgt2.keliling(3, 4);
    }
}
