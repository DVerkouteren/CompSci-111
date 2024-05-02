package Project61;

public class VideoGame {
    private String Name = "To Be Or Not To Be";
    private double Cost;

    VideoGame(){}
    VideoGame(String Name, double Cost_USD){
        setName(Name);
        setCost(Cost_USD);
    }
    public String getName(){
        return Name;
    }
    public double getCost(){
        return Cost;
    }
    public void setName(String name){
        name = name + "";
        String temp = name.replaceAll("\\s",""); 
        if(name.length() < 12 && temp.length() > 1){
            Name = name;
        }else{
            System.out.println("Error: Your video game name is not valid");
        }
    }
    public void setCost(double cost){
        if(cost > 0 && cost < 1000){
            Cost = cost;
        }else{
            System.out.println("Error: Your game's cost is unrealistic");
        }
    }
    public String toString(){
        return "VideoGame(Name,Cost): " + Name + ", "+Cost; 
    }
    public static void main(String[] args) {
        VideoGame g1 = new VideoGame();
        VideoGame g2 = new VideoGame("Minecraft", 2000);
        System.out.println(g1);
        System.out.println(g2);
    }
}
