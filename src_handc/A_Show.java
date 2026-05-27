import java.util.Scanner;

public class A_Show {

    private int[] rand;
    private String[] name;
    private double[] P;
    private double[] S;

    public A_Show(int[] rand,String[] name,double[] P,double[] S){

        this.name = name;
        this.rand = rand;
        this.S = S;
        this.P = P;

        show_code();
    }

    private void show_code(){

        for (int i = 0; i < 50; i++) {

            if (rand[i] != 0)
                System.out.println("["+(i+1)+"] "+rand[i]);
            else
                break;
        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^");

        user();
    }

    private void user(){

        Scanner input = new Scanner(System.in);

        System.out.println("CHOICE >> ");
        int x = input.nextInt();

        boolean flag = false;

        for (int i = 0; i < 50; i++) {

            if (x == rand[i]){

                flag = true;
                System.out.println("NAME :"+name[i]);
                System.out.println("AREA :"+S[i]);
                System.out.println("MOHIT :"+P[i]);
                break;
            }
        }
        if (flag == false)
            System.out.println("DO NOT FOUND");


    }
}







