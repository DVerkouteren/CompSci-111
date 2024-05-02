package Chapter8;

public class Stock {
    private String symbol;
    private String name;

    public Stock(){

    }
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    // public String getSymbol(){
    //     return symbol;
    // }
    // public void setSymbol(String symbol){
    //     this.symbol = symbol;
    // }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name != "")
        this.name = name;
    }
    public String toString(){
        return "Name: " + name + ", Symbol: " + symbol;
    }
}
