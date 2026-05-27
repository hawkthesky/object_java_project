import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        String owner, number;

        System.out.println("              Welcome To Bank");
        System.out.println("OwnerName :");
        owner = scanf.nextLine();

        int xlen ;

        do {

            System.out.println("Account Number:");
            number = scanf.nextLine();

            int len = number.length();

            xlen = 0;

            if ( len != 16){
                System.out.println("ERROR NUMBER ACCOUNT");
                xlen = 1;
            }

        }while (xlen == 1);


        int x_mune;
        System.out.println("does the account have an initial balance or not :");
        System.out.println("1-yas");
        System.out.println("2-no");
        x_mune = scanf.nextInt();

        BankAccount account = new BankAccount(number, owner, 200);

        BankAccount account_no_money = new BankAccount(number, owner);

        if (x_mune == 1){

            int mune,flag;

            do {

                System.out.println("1) Deposit money ");
                System.out.println("2) Withdraw money");
                System.out.println("3) show balance");
                System.out.println("choice:");
                mune = scanf.nextInt();

                if (mune == 1 ){

                    double x;
                    System.out.println("money:");
                    x = scanf.nextDouble();

                    account.depsit(x);

                } else if (mune == 2) {
                    double x;
                    System.out.println("money:");
                    x = scanf.nextDouble();

                    account.Withdraw(x);

                } else if (mune == 3) {

                    account.show();
                } else {

                    System.out.println("choice error");
                }

                System.out.println("1) continue");
                System.out.println("2) stop");
                flag = scanf.nextInt();

            }while (flag == 1 );

            System.out.println(account.getBalance());


        } else if ( x_mune == 2) {

            int mune,flag2;

            do {

            System.out.println("1) Deposit money ");
            System.out.println("2) Withdraw money");
            System.out.println("3) show balance");
            System.out.println("choice:");
            mune = scanf.nextInt();

            if (mune == 1 ){

                double x;
                System.out.println("money:");
                x = scanf.nextDouble();

                account_no_money.depsit(x);

            } else if (mune == 2) {
                double x;
                System.out.println("money:");
                x = scanf.nextDouble();

                account_no_money.Withdraw(x);

            } else if (mune == 3) {

                account_no_money.show();
            } else {

                System.out.println("choice error");
            }

            System.out.println("1) continue");
            System.out.println("2) stop");
            flag2 = scanf.nextInt();

        }while (flag2 == 1 );

        System.out.println(account_no_money.getBalance());

        }


        scanf.close();
    }
}
