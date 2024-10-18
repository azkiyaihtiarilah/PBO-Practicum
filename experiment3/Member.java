package experiment3;

public class Member {
    private String idCardNumber;
    private String name;
    private int borrowingLimit;
    private int loanAmount;

    // Constructor with no parameters
    public Member() {
    }

    // Constructor with parameters
    public Member(String idCardNumber, String name, int borrowingLimit) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.borrowingLimit = borrowingLimit;
        this.loanAmount = 0; // Initialize loan amount to 0
    }

    // Get member's name
    public String getName() {
        return name;
    }

    // Get loan limit
    public int getLimitLoan() {
        return borrowingLimit;
    }

    // Get current loan amount
    public int getLoanAmount() {
        return loanAmount;
    }

    // Borrow money method
    public void borrow(int amount) {
        if (loanAmount + amount > borrowingLimit) {
            System.out.println("Sorry, the loan amount exceeds the limit.");
        } else {
            loanAmount += amount;
            System.out.println("Current loan amount: " + loanAmount);
        }
    }

    // Pay back method
    public void installment(int amount) {
        if (amount >= loanAmount) {
            loanAmount = 0;
            System.out.println("Current loan amount: " + loanAmount);
        } else {
            loanAmount -= amount;
            System.out.println("Current loan amount: " + loanAmount);
        }
    }
}
