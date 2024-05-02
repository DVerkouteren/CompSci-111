package Chapter11;

public class Circle extends GO{
    private double raduis;
    public Circle(){
        this.raduis = 1;
    }
    public Circle(double raduis){
        this.raduis = raduis;
    }
    public Circle(double raduis, String color, boolean filled){
        this.raduis = raduis;
        setColor(color);
        setFilled(filled);
    }
    public double getRaduis() {
        return raduis;
    }
    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }
    @Override
    public String toString() {
        return "Circle [raduis=" + raduis + ", color= " + getColor()+", filled= "+isFilled()+"]";
    }
}
