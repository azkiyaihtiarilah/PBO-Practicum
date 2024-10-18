package question3;

/**
 * UserProfile
 */
public class UserProfile {

    private int userID;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc; //jpg, png, pdf

    // Constructor to initialize UserProfile
    public UserProfile(int userID, String password, String name, int age, String email_id, String doc) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    public int get_userID() {
        return userID;
    }

    public String get_password() {
        return password;
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public String get_email() {
        return email_id;
    }

    public String show_documents() {
        return doc;
    }

    // setter method untuk mengedit atribut
    public void edit_profile(int userID, String password, String name, int age, String email_id, String doc) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }
}