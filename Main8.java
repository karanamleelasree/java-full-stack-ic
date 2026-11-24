class Account {
    int accountNumber;
    void showAccount(){
        System.out.println("Account Number: " + accountNumber);
    }
}
class SavingsAccount extends Account{
    double interestRate;
    void showSavingsDetails(){
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
}

class FixedDepositAccount extends SavingsAccount {
    int lockInYears;
    void showFDDetails(){
        System.out.println("Lock in years:"+lockInYears);
    }
}
    

class Main8{
public static void main(String args[]){
    FixedDepositAccount f = new FixedDepositAccount();
    f.accountNumber = 123456789;
    f.interestRate = 5674;
    f.lockInYears = 8;
    f.showAccount();
    f.showSavingsDetails();
    f.showFDDetails();
}
}

