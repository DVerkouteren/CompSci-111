package ExtraCredit.Shapes;

public class Circle extends Shape{

    int radius = 1;
    
    public Circle(){
        X = 1;
        Y = 1;
        radius = 1;
    }
    public Circle(int x, int y, int r){
        X = x;
        Y = y;
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle (x,y,r): " + X + ", " + Y + ", " + radius);
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
}
