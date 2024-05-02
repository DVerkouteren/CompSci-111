package Chapter9;

public class Circle {
    double radius = 1;
    double ham;
    public Circle(){
    }

    public Circle(int r, int h){
        radius = r;
        ham = h;
    }
    public double getArea(){
        double area = radius * radius * 3.14;
        return area;
    }

}
