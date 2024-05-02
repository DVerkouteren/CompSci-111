package Chapter9;

public class Rectangle {
    int length = 1;
    int width = 1;

    public Rectangle(){

    }
    public Rectangle(int leng, int wid){
        length = leng;
        width = wid;
    }
    public int area(){
        return length * width;
    }
}
