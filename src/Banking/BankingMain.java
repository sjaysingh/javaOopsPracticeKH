package Banking;

public class BankingMain {

    public static void main(String[] args){
        BankAccount ba1=new BankAccount("Roy",45000);

        ba1.withdraw(2000);
        ba1.getBalance();
        ba1.deposit(5000);
        ba1.getBalance();
        ba1.getBankID();
        System.out.println(BankAccount.bankID);
        ba1.getIfsCode();
    }
}
