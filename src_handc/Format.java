import java.lang.Math;
import java.util.Scanner;

public class Format {

    private double mohit;
    private double area;
    private String color;


    protected double Mohit(double r){

        mohit = 2 * Math.PI * r;
        return mohit;
    }

    protected double Area(double r){

        double res = Math.pow(r,2);
        area = res * Math.PI;

        return area;
    }

    protected String Color(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER COLOR :");
        color = scanner.next();

        return color;
    }

}