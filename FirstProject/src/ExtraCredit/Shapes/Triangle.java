package ExtraCredit.Shapes;

public class Triangle extends Shape {

    int base = 1;
    int height = 1;

    public Triangle(){
        X = 1;
        Y = 1;
    }
    public Triangle(int x, int y, int h, int b){
        X = x;
        Y = y;
        height = h;
        base = b;
    }

    @Override
    public double area() {
        return (base * height)/2;
    }

    @Override
    public void display() {
        System.out.println("Triangle (x,y,h,b): " + X + ", "+Y+", "+height+", "+base);
    }

    public int getHeight(){
        return height;
    }
    public void setHieght(int h){
        height = h;
    }
    public int getBase(){
        return base;
    }
    public void setBase(int b){
        base = b;
    }
    
}
