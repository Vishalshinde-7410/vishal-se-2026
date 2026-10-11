class bank_acc {
    private int acc_NO;
    private String accHolderName;
    private double balance;

  
    void setacc_NO(int acc_NO) {
        this.acc_NO = acc_NO;
    }

    void setaccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    void setbalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance value.");
        }
    }

   
    int getacc_NO() {
        return acc_NO;
    }

    String getaccHolderName() {
        return accHolderName;
    }

    double getbalance() {
        return balance;
    }
}

public class third {
    public static void main(String[] args) {
       
        bank_acc b1 = new bank_acc(); 
        
        
        b1.setacc_NO(1111);
        b1.setaccHolderName("vishal");
        b1.setbalance(1000000);

        
        System.out.println("Account Number: " + b1.getacc_NO());
        System.out.println("Account Holder: " + b1.getaccHolderName());
        System.out.println("Balance: " + b1.getbalance());
    }
}