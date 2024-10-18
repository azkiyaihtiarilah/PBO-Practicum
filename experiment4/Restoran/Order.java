import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Pelanggan pelanggan;
    private Pegawai pegawai;
    private ArrayList<Menu> menus;
    private ArrayList<Integer> quantities;
    private int jumlahItem;
    private Date tanggalPembelian;

    // Constructor
    public Order(Pelanggan pelanggan, Pegawai pegawai) {
        this.pelanggan = pelanggan;
        this.pegawai = pegawai;
        this.menus = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.jumlahItem = 0;
        this.tanggalPembelian = new Date(); 
    }

    // Method untuk menambahkan menu ke order
    public void setMenus(Menu menu, int quantity) {
        menus.add(menu);
        quantities.add(quantity);
        jumlahItem++;
    }

    // Method untuk menampilkan struk tanpa format khusus
    public void receipt() {
        int total = 0;

        // Cetak struk
        System.out.println("-------------------------------------");
        System.out.println("               Receipt               ");
        System.out.println("-------------------------------------");
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);  // Tanggal default tanpa format khusus
        System.out.println("Pegawai          : " + pegawai.getNama());
        System.out.println("-------------------------------------");
        System.out.println("Items   : ");

        int index = 0;
        for (Menu menu : menus) {
            int quantity = quantities.get(index);
            int itemTotal = menu.getHarga() * quantity;
            System.out.println(menu.getNama() + " x" + quantity + "        : Rp " + itemTotal);
            total += itemTotal;
            index++;
        }

        System.out.println("-------------------------------------");
        System.out.println("Pelanggan         : " + pelanggan.getNama());
        System.out.println("Total             : Rp " + total);  // Total dalam bentuk default (Rupiah)
        System.out.println("-------------------------------------");
        System.out.println("              Thank You              ");
        System.out.println("-------------------------------------");
    }
}
