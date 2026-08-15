//
public class BankAccount {
    private String account_no;
    private String Name;
    private double Balance;
    void setAccountDetails(String ac_no, String name, double amount){
      this.account_no=ac_no;
      this.Name=name;
      this.Balance=amount;
     } 
     void deposit(double amount){
      Balance+=amount;
      System.out.println("total Balance is :" + Balance);
     }
     void withdraw(double amount) {
    if (amount <= Balance) {
        Balance -= amount;
        System.out.println("Total Balance is: " + Balance);
    } else {
        System.out.println("Insufficient Balance");
    }
}
//displayAccountDetails()
      void displayAccountDetails(){
        System.out.println("Account number:"+ account_no);
        System.out.println("Account Holder Name:"+ Name);
        System.out.println("Account Balance:"+ Balance);
      }
     public static void main(String[] args) {
        BankAccount a1=new BankAccount();
        a1.setAccountDetails("00123432", "Ankit",120002.43);
        System.out.println("balance is "+ a1.Balance);
        a1.deposit(1000);
        System.out.println("balance is "+ a1.Balance);
        a1.withdraw(5000);
        a1.displayAccountDetails();
     }
}
