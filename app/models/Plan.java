package models;

public abstract class Plan{
    public String name;
    public int price;
    public String type;
    
    public Plan(String name, int price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
 
    public String getType() {
        return type;
    }
    
    
}