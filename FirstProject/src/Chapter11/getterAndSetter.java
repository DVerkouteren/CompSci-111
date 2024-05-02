package Chapter11;

public class getterAndSetter {
    
    String color = "Yellow";
    boolean filled = false;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public String toString() {
        return "getterAndSetter [color=" + color + ", filled=" + filled + "]";
    }

    
}
