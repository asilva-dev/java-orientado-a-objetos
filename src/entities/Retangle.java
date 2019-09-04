package entities;

public class Retangle {

    public  double width;
    public double height;

    public double area(){
        double a = width * height;
        return a;
    }

    public double perimeter(){
        double p = 2 * (width + height);
        return p;
    }
}
