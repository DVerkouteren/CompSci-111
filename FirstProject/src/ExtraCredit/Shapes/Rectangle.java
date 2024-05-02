package ExtraCredit.Shapes;

public class Rectangle extends Shape{

    int wdith = 1;
    int height = 1;

    public Rectangle(){
        X = 1;
        Y = 1;
    }
    public Rectangle(int x,int y,int h,int w){
        X = x;
        Y = y;
        wdith = w;
        height = h;
    }

    @Override
    public double area() {
        return wdith * height;
    }

    @Override
    public void display() {
        System.out.println("Rectangle (x,y,w,h): " + X + ", " + Y + ", " + wdith + ", " + height);
    }
    
    public int getHeight(){
        return height;
    }
    public void setHieght(int h){
        height = h;
    }
    public int getWidth(){
        return wdith;
    }
    public void setWidth(int w){
        wdith = w;
    }
}
