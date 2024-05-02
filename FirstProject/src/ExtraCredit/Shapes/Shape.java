package ExtraCredit.Shapes;

public abstract class Shape {
    
    public int X = 0;
    public int Y = 0;

    public int getX(){
        return X;
    }
    public void setX(int x){
        X = x;
    }
    public int getY(){
        return Y;
    }
    public void setY(int y){
        Y = y;
    }

    public abstract double area();

    public abstract void display();
}
