public class Lego{
    private String name;
    private double price;
    private int size;
    public Lego(String name){
        this.name = name;
    }
    public Lego(String name, double price){
        this.name = name;
        this.price = price;
    }
    public Lego(String name, double price, int size){
        this.name = name;
        this.price = price;
        this.size = size;
    }
    public String getName(){
        return this.name;
    }    
    public double getPrice(){
        return this.price;
    }
    public int getSize(){
        return this.size;
    }
    public String toString(){
        String str = new String();
        str+=this.name;
        if(this.price != 0.0){
            str+=", " + price;
        }
        if(this.size != 0){
            str+= ", " + size;
        }
        return str;
    }
}