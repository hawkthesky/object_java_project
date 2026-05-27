import  java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("          GEOMETRICAL");

        Scanner scanf = new Scanner(System.in);

        int num = 50;
        double[] P = new double[num];
        double[] S = new double[num];
        String[] color = new String[num];
        String[] name = new String[num];

        int mune;
        do {
            System.out.println("1 add circle");
            System.out.println("2 add oblong");
            System.out.println("3 add triangle");
            System.out.println("4 show format");
            System.out.println("5 show mohit and area particular");
            System.out.println("6 found format the most mohit");
            System.out.println("7 exit");
            System.out.print("=>> ");
            mune = scanf.nextInt();

            if (mune > 7 || mune < 1)
                System.out.println("ERROR CHOICE !!");
            else if ( mune == 1) {

                for (int i = 0; i < num; i++) {

                    if (color[i] == null){

                        name[i] = "CIRCLE";
                        break;
                    }

                }

                double r;
                System.out.println("radius:");
                r = scanf.nextDouble();

                Circle c = new Circle();
                Format f = new Format();

                c.setInput(r);


                for (int i = 0; i < num ; i++) {

                    if (P[i] == 0) {
                        P[i] = c.getMohit();
                        break;
                    }
                }

                for (int i = 0; i < num ; i++) {

                    if (S[i] == 0) {
                        S[i] = c.getArea();
                        break;
                    }
                }

                for (int i = 0; i < num; i++) {
                    if (color[i] == null){
                        color[i] = c.getColor();
                        break;
                    }
                }

                System.out.println("area :"+c.getArea());
                System.out.println("mohit :"+c.getMohit());
                System.out.println("color:"+c.getColor());
            }

            else if ( mune == 2) {

                for (int i = 0; i < num; i++) {

                    if (color[i] == null){
                        name[i] = "OBLONG";
                        break;
                    }
                }

                double breadth,len;
                System.out.println("Breadth :");
                breadth = scanf.nextDouble();

                System.out.println("Length :");
                len = scanf.nextDouble();

                Oblong o = new Oblong();

                o.setBreadth(breadth);
                o.setLength(len);
                o.object();

                temp(S,P,color,o);

            }

            else if (mune == 3) {


                for (int i = 0 ; i < num ;i++){

                    if (color[i] == null){
                        name[i] = "TRIANGLE";
                        break;
                    }
                }


                System.out.println("         ADD TRIANGLE");

                double drop,ground;

                System.out.println("ground rule :");
                ground = scanf.nextDouble();

                System.out.println("drop :");
                drop = scanf.nextDouble();

                Triangle t = new Triangle();
                t.setGround(ground);
                t.setDrop(drop);


                temp_triangle(S,P,color,t);
            }

            else if (mune == 4) {

                Show show = new Show(name,color);
            }

            else if ( mune == 5) {

                unique(name,P,S);
            }

            else if (mune == 6) {

                Most most = new Most();
                most.setMohit(P);

                System.out.println("MOST : "+most.getMost());
                System.out.println("\n*****************");
            }
        }while (mune != 7);

        System.out.println("\nEND.");

    }

    private static void temp(double[] S ,double[] P ,String[] color,Oblong o){

        int num = 50;

        for (int i = 0; i < num ; i++) {

            if (P[i] == 0) {
                P[i] = o.getMohit();
                break;
            }
        }

        for (int i = 0; i < num ; i++) {

            if (S[i] == 0) {
                S[i] = o.getArea();
                break;
            }
        }

        for (int i = 0; i < num; i++) {
            if (color[i] == null){
                color[i] = o.getColor();
                break;
            }
        }

        System.out.println("area :"+o.getArea());
        System.out.println("mohit :"+o.getMohit());
        System.out.println("color:"+o.getColor());
    }


    private static void temp_triangle(double[] S,double[] P,String[] color,Triangle t){

        int num = 50;

        t.object();

        for (int i = 0; i < num ; i++) {

            if (P[i] == 0) {
                P[i] = t.getMohit();
                break;
            }
        }

        for (int i = 0; i < num ; i++) {

            if (S[i] == 0) {
                S[i] = t.getArea();
                break;
            }
        }

        for (int i = 0; i < num; i++) {
            if (color[i] == null){
                color[i] = t.getColor();
                break;
            }
        }

        System.out.println("area :"+t.getArea());
        System.out.println("mohit :"+t.getMohit());
        System.out.println("color:"+t.getColor());
    }

    private static void unique(String[] name,double[] P,double[] S){

        final int num = 50;
        int[] rand = new int[num];
        Random random = new Random();

        int target ;
        for (int i = 0; i < num; i++) {

            if (name[i] == null)
                break;

            target = random.nextInt(1000,9999)+1;

            for (int j = 0; j < num ; j++) {

                if (target != rand[j] && rand[j] == 0){
                    rand[i] = target;
                    break;
                } else if ( target == rand[j]) {
                    i--;
                    break;
                }
            }

        }

        A_Show aShow = new A_Show(rand,name,P,S);

    }

}
