import java.util.Scanner;

public class shopping {

    final int num = 50;
    private String[] code_item ;
    private int[] number ;
    private  double[] money;

    private int[] number_temp = new int[num];
    private String[] code_item_temp = new String[num];
    private double sum = 0;
    private int s = 0;

    Scanner scanf = new Scanner(System.in);

    public shopping(String[] code_item,int[] number,double[] money){

        this.code_item = code_item;
        this.number = number;
        this.money = money;

    }

    public void shop() {

        String choice;
        int len;

        do {
            System.out.println("enter code item :");
            choice = scanf.next();

            len = choice.length();
            if (len != 6){
                System.out.println("error len");
            }
        }while (len != 6);

        int number_shop;
        System.out.println("enter number:");
        number_shop = scanf.nextInt();

        double result = sum_factor(choice,number_shop);

        sum +=result;

        number_choice(number_shop,choice,result);
    }

    private void comparison(String choice,int number_choice){

        int flag = 0;

        for (int i = 0; i < num; i++) {

            if (choice.equals(code_item[i])){
                System.out.println("found");
                flag =1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("do not found");
            return;
        }

        for (int i = 0; i < num; i++) {

            if (choice.equals(code_item_temp[i])){
                number_temp[i]+=number_choice;
                end();
            }
        }

        for (int i = 0; i < num; i++) {
            if (code_item_temp[i] == null){
                code_item_temp[i] = choice;
                number_temp[i]+=number_choice;
                break;
            }
        }

        end();
    }

    private void end(){

        int mune;
        System.out.println("End Shopping :");
        System.out.println("1) No");
        System.out.println("2) Yes");
        mune = scanf.nextInt();

        if (mune == 1){
            shop();
        }
        else if (mune == 2) {
            factor();
            return;
        }
        else
            end();
    }

    private void number_choice(int number_choice,String choice,double result){

        for (int i = 0; i < num; i++) {

            if (choice.equals(code_item[i])){

                if (number[i] - number_choice >= 0){
                    number[i]-=number_choice;
                }
                else {
                    System.out.println("error !!");
                    System.out.println("please enter information");
                    shop();
                }
            }
        }

        comparison(choice,number_choice);
    }

    private void factor(){

        for (int i = 0; i < num; i++) {

            if (number_temp[i] == 0 && code_item_temp[i] == null){
                break;
            }
            System.out.println("           <<"+(i+1)+">>");
            System.out.println(code_item_temp[i]);
            System.out.println(number_temp[i]);

        }

        System.out.println("SUM FACTOR :"+sum);
    }

    private double sum_factor(String target,int num_shop){

        double result=0;

        for (int i = 0 ; i < num ;i++){

            if (target.equals(code_item[i])){

                result = money[i] * num_shop;
                break;

            }
        }

        return result;
    }
}
