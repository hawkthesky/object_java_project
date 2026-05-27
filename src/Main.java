import java.util.Scanner;

public class Main {

    public static void main(String[]args ){

        final int num = 50;

        int mune ;
        String [] name = new String[num];
        String [] code_item = new String[num];
        int [] number = new  int [num];
        double [] money = new double[num];

        Scanner scanf = new Scanner(System.in);

        System.out.println("          WELCOME TO SHOP");

        do {
            System.out.println("        MUNE");
            System.out.println("1) add item");
            System.out.println("2) factor shopping");
            System.out.println("3) show item number zero ");
            System.out.println("4) show one item");
            System.out.println("5) show total item");
            System.out.println("6) Exit");

            mune = scanf.nextInt();

            if (mune == 1){

                System.out.println("how item add:");
                int how = scanf.nextInt();

                for (int h = 0; h < how; h++) {

                    System.out.println("enter name item :");
                    String target = scanf.next();

                    for (int i = 0; i < num; i++) {

                        if (name[i] == null) {

                            name[i] = target;
                            break;
                        }
                    }

                    int flag ;
                    do {
                        System.out.println("enter code item :");
                        System.out.println("len = 6");
                        String code = scanf.next();

                        boolean yes = false;
                        flag = 0;

                        int lenstr = code.length();

                        if (lenstr == 6) {

                            for (int s = 0; s < 6; s++) {
                                for (int i = 0; i < 6; i++) {

                                    if (code.charAt(s) == code.charAt(i) && s != i) {

                                        System.out.println("repetition");
                                        yes = true;
                                        flag = 1;
                                        break;

                                    }

                                }

                                if (yes == true) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("ERROR LEN CODE ITEM .");
                            flag = 1;
                        }

                        flag =  unique(code,code_item,num);

                        if (flag == 0){

                            for (int j = 0; j < num; j++) {

                                if (code_item[j] == null) {

                                    code_item[j] = code;
                                    break;

                                }

                            }
                        }

                    } while (flag == 1);

                    int extant;
                    do {
                        System.out.println("enter number extant:");
                        extant = scanf.nextInt();

                    }while (extant < 0);

                    for (int i = 0; i < num; i++) {

                        if (number[i] == 0) {
                            number[i] = extant;
                            break;
                        }

                    }

                    System.out.println("enter number money:");
                    double pol = scanf.nextDouble();

                    for (int i = 0; i < num; i++) {

                        if (money[i] == 0) {

                            money[i] = pol;
                            break;
                        }

                    }

                }

            }
            else if (mune == 2) {

                shopping shop = new shopping(code_item,number,money);

                shop.shop();
            }
            else if (mune == 3) {

                Zero_Item zero = new Zero_Item(name,number);

                System.out.println("      ZERO NUMBER ITEM");

                for (int j = 0; j < num; j++) {

                    if (zero.getName()[j] != null)
                        System.out.println(zero.getName()[j]);
                }


            }
            else if (mune == 4) {

                One_Print item = new One_Print(name,number,money,code_item);

                System.out.println("ENTER NUMBER CODE ITEM :");
                System.out.println("len = 6");
                String temp = scanf.next();

                int len = temp.length();

                if (len == 6){

                    if (item.getName(temp) != null) {
                        System.out.println("NAME " + item.getName(temp));
                        System.out.println("CODE " + item.getCode(temp));
                        System.out.println("MONEY " + item.getMoney(temp));
                        System.out.println("NUMBER " + item.getNumber(temp));
                    }
                    else
                        System.out.println("DO NOT FOUND.");
                }else {
                    System.out.println("most len 6 !");
                }
            }
            else if (mune == 5) {
                System.out.println("        print total item ");

                total total_it = new total(name,code_item,number,money);

                for (int i = 0; i < num ; i++) {

                    if (name[i] == null){
                        break;
                    }
                    System.out.println("            <<"+(i+1)+">>");
                    System.out.println(total_it.getName()[i]);
                    System.out.println(total_it.getCode_item()[i]);
                    System.out.println(total_it.getNumber()[i]);
                    System.out.println(total_it.getMoney()[i]);
                }

            }


        }while (mune != 6);


        System.out.println("\nGOODBYE");

    }

    public static int unique(String code,String[] code_item,int number){

        int flag = 0;

        for (int i = 0; i < number ; i++) {

            if (code.equals(code_item[i])){
                flag = 1;
                System.out.println("Error code item repetition");
            }
        }

        return flag;
    }
}
