
public class Oblong extends Format{

    private double breadth;
    private double length;
    private double mohit;
    private double area;
    private String color;

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void object(){

        Oblong oblong = new Oblong();

        area = oblong.Area(length,breadth);
        mohit = oblong.Mohit(length,breadth);
        color = oblong.Color();
    }

    public double Mohit(double length,double breadth){

        double res;
        res = length + breadth;
        res *=2;

        return res;
    }

    public double Area(double length,double breadth){

        double result;

        result = length * breadth;
        return result;
    }

    public double getArea(){
        return area;
    }

    public double getMohit(){
        return mohit;
    }

    public String getColor() {
        return color;
    }
}