package Banking;

public class BankAccount {
    private String name;
    private double balance;
    public static int bankID = 2401;
    private int ifsCode = 12342;

    BankAccount(String name, double startingBalance){
        this.name=name;
        this.balance=Math.max(startingBalance,0);
    }

    public void withdraw(int amount){
        if(amount<balance){
            this.balance=this.balance-amount;
            System.out.println(amount + " withdrawn ");

        }
    }
    public void getIfsCode(){
        System.out.println("IFSC code is: "+ ifsCode);
    }

    public void getBankID(){
        System.out.println("Bank ID is: "+ bankID);
    }

    public void deposit(int amount){
        if(amount>0) {
            this.balance = this.balance + amount;
            System.out.println(amount + " deposited ");
        }
    }

    public void getBalance(){
        System.out.println("The balance is: "+ this.balance);
    }

}
