package models;

public class Coffe{
    public String name;
    public int price;
    public String image;

    public Coffe(String name, int price, String image){
        this.name = name;
        this.price = price;
        this.image = image;
    }
    
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getImage() {
        return image;
    }
 
}