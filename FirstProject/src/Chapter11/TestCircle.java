package Chapter11;

public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle(3);
        Circle c = new Circle(5, "green", true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
