package Chapter9;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 2);
        System.out.println("r1 area = "+r1.area());
        System.out.println("r2 area = " +r2.area());
    }
}
