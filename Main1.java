
class BankAccount {
    private String accountHolder = "Leelasree";
    private double balance = 100000;
    public void getter() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    public void setBalance(double b) {
        if (b >= 0) {
            balance = b;
            System.out.println("Balance updated successfully");
        } else {
            System.out.println("Invalid balance");
        }
    }
}
public class Main1 {
    public static void main(String args[]) {
        BankAccount d = new BankAccount();
        d.getter();
        d.setBalance(50000);
        d.getter();
    }
}
