package experiment7.task;

class Mahasiswa extends Manusia {
    public void makan() {
        System.out.println("Mahasiswa sedang makan");
    }

    public void bernafas() {
        System.out.println("Mahasiswa sedang bernafas");
    }
}

class Dosen extends Manusia{
    public void makan() {
        System.out.println("Dosen sedang makan");
    }

    public void bernafas() {
        System.out.println("Dosen sedang bernafas");
    }
}

public class Manusia {
    public void makan() {
        System.out.println("Manusia harus makan");
    }

    public void bernafas() {
        System.out.println("Manusia harus bernafas");
    }

    public static void main(String[] args) {
        Manusia mns = new Manusia();
        Mahasiswa mhs = new Mahasiswa();
        Dosen ds = new Dosen();

        System.out.println("==========================");
        mns.bernafas();
        mhs.bernafas();
        ds.bernafas();
        System.out.println("==========================");

        Manusia mns1 = new Mahasiswa();
        Manusia mns2 = new Dosen();

        mns1.bernafas();
        mns2.bernafas();
        System.out.println("==========================");
    }
}
