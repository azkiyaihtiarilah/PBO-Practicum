public class Main {
    public static void main(String[] args) {
        //membuat objek menu makanan
        Menu nasi = new Menu("Nasi Goreng ", 10);
        Menu ayam = new Menu("Ayam Goreng ", 5);
        Menu krupuk = new Menu("Krupuk Udang", 2);

        //membuat objek pegawai restoran
        Pegawai pegawai1 = new Pegawai("1111", "Kiya");

        //membuat objek pelanggan restoran
        Pelanggan pelanggan1 = new Pelanggan("Catherine");
        Pelanggan pelanggan2 = new Pelanggan("Gatron");

        //membuat order
        Order order1 = new Order(pelanggan1, pegawai1);
        Order order2 = new Order(pelanggan2, pegawai1);

        //input pesanan dan banyaknya
        order1.setMenus(nasi, 1);
        order1.setMenus(ayam, 2);
        order1.setMenus(krupuk, 1);
        System.out.println();
        order2.setMenus(nasi, 1);
        order2.setMenus(ayam, 1);
        order2.setMenus(krupuk, 4);
        System.out.println();

        //cetak resi
        order1.receipt();
        order2.receipt();
    }
}
