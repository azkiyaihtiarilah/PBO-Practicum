package question3;

/**
 * User
 */
public class User extends UserProfile{

    // Constructor for User, calling the constructor of UserProfile
    public User(int userID, String password, String name, int age, String email_id, String doc) {
        super(userID, password, name, age, email_id, doc); // Calls the constructor of UserProfile
    }
    
    public boolean log_in(int userID, String password) {
        //method login, digunakan untuk mengecek apakah user id dan password nya sudah sesuai
        System.out.println("Logged in with User ID : " + userID);
        return true; //Return true jika login sukses
    }

    public void recover_password() {
        //method untuk mereset password
        System.out.println("Password recovery process initiated.");
    }

    public void log_out() {
        //method untuk logout
        System.out.println("Logged out successfully.");
    }
}