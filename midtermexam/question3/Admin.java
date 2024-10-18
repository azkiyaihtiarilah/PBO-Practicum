package question3;

/**
 * Admin
 */
public class Admin {

    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Pembaruan detail kendaraan untuk ID Kendaraan: " + vehicle_id);
    }

    public void add_vehicle() {
        System.out.println("Kendaraan baru ditambahkan");
    }

    public void retrieve_complains() {
        System.out.println("Complaints diterima");
    }

    public void verify_user(int userID) {
        System.out.println("User dengan ID " + userID + " telah diverifikasi");
    }
}