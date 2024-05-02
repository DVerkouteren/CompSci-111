package Project61;

public class Boat {
    private String Color = "red";
    private int ModelNumber = 123456789;

    public Boat(){

    }
    public Boat(String Color, int ModelNumber){
        setColor(Color);
        setModelNumber(ModelNumber);
    }
    public String getColor(){
        return Color;
    }
    public int getModelNumber(){
        return ModelNumber;
    }
    public void setColor(String color){
        switch (color) {
            case "red", "blue", "green", "yellow", "grey", "black", "white","purple","orange":
                Color = color;
                break;
        
            default:
            System.out.println("Error: You have not entered a valid color for your boat. Please use enter all lowercase colors.");
                break;
        }

    }
    public void setModelNumber(int ModelNum){
        if(ModelNum >= 100000000 && ModelNum < 1000000000){
            ModelNumber = ModelNum;
        }else{
            System.out.println("Error: Your model number is not nine digits");
        }
    }
    public String toString(){
        return "Boat(color, model): " + Color + ", " + ModelNumber;
    }

    public static void main(String[] args) {
        Boat b1 = new Boat();
        Boat b2 = new Boat("bl", 123456789);
        System.out.println(b1);
        System.out.println(b2);
    }
    
}
