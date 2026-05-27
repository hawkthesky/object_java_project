public class BankAccount {

    private String accountnumber ;
    private String ownername;
    private double balance;

    public  BankAccount(String accountnumber,String ownername,double balance){
        this.accountnumber = accountnumber;
        this.ownername = ownername;
        this.balance = balance;
    }

    public BankAccount(String accountnumber,String ownername){

        this.accountnumber = accountnumber;
        this.ownername = ownername;
        this.balance = 0;
    }

    public void depsit(double dep){

        this.balance = this.balance +dep;
    }
    public void Withdraw(double  wit){

        if (wit <= this.balance){
            this.balance = this.balance - wit;
        }else {
            System.out.println("no balance");
        }


    }
    public void show(){

        System.out.println("SHOW BALANCE:"+this.balance);
    }
    public double getBalance() {
        return balance;
    }

}
