import java.util.Scanner;

public class Triangle extends Format{

    private double drop;
    private double ground;
    private double mohit;
    private double area;
    private String color;

    public void setDrop(double drop){
        this.drop =drop;
    }

    public void setGround(double ground){
        this.ground = ground;
    }

    public void object(){

        Triangle triangle = new Triangle();
        mohit = triangle.Mohit();
        area = triangle.Area(ground,drop);
        color = triangle.Color();
    }

    public double Mohit(){

        Scanner scanner = new Scanner(System.in);

        double a ,b ,c ;
        System.out.println("3 enter number :");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        return a + b + c ;
    }

    public double Area(double ground,double drop){

        return 0.5 * ground * drop;
    }

    public double getMohit(){
        return mohit;
    }

    public double getArea(){
        return area;
    }

    public String getColor() {
        return color;
    }
}