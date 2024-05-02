/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juneja_u
 */

 package Chapter11; 

public class GO {
    private String color;
    private boolean filled;
    
    public GO(){
        color = "white";
        filled = false;
    }
    public GO(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

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
        return "GO{" + "color=" + color + ", filled=" + filled + '}';
    }
    
 
    
}
