package question3;

/**
 * Customer
 */
public class Customer extends User {

    private boolean verificationStatus = false;

    // Constructor for Customer
    public Customer(int userID, String password, String name, int age, String email_id, String doc) {
        // Call the constructor of the User class (or UserProfile class)
        super(userID, password, name, age, email_id, doc);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    // Validate the document before verification
    public void applyVerification(String doc) {
        if (isValidDocument(doc)) {
            this.verificationStatus = true;
            System.out.println("Verifikasi diterapkan dengan dokumen tipe: " + doc);
        } else {
            System.out.println("Tipe dokumen yang anda berikan salah. Ganti (jpg, png, pdf)");
        }
    }

    // Check if document type is valid
    private boolean isValidDocument(String doc) {
        String[] validDocumentTypes = { ".jpg", ".png", ".pdf"};
        for (String validType : validDocumentTypes) {
            if (doc.equalsIgnoreCase(validType)) {
                return true;
            }
        }
        return false;
    }
}
