
public class Circle extends Format{

    private double input;
    private double area;
    private double mohit;
    private String color;

    public void setInput(double input) {
        this.input = input;

        object();
    }

    private void object(){

        Circle circle = new Circle();

        area = circle.Area(input);
        mohit = circle.Mohit(input);
        color = circle.Color();

    }

    public double getMohit() {
        return mohit;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }
}
