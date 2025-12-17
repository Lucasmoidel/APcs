import java.util.ArrayList;

public class toyStore {
    private ArrayList<toy> toys = new ArrayList<>();
    private ArrayList<Integer> toysStock = new ArrayList<>();
    private ArrayList<Double> toysPrice = new ArrayList<>();
    private double profits;

    private String city;
    private String hours;

    public void lowerPrice(){
        for (int i = 0; i < toys.size(); i++){
            if (toys.get(i).getblackfriday()){
                toysPrice.set(i, toysPrice.get(i)*0.8);
            }
        }
    }

    public toyStore(ArrayList<toy>  toys, ArrayList<Integer> toysStock,  ArrayList<Double> toysPrice, String city, String hours){
        this.toys = toys;
        this.toysStock = toysStock;
        this.toysPrice = toysPrice;
        this.city = city;
        this.hours = hours;
        this.profits = Profits();
        lowerPrice();

    }

    public int Inventory(){
        int x = 0;
        for (int i = 0; i < toysStock.size(); i++){
            x += toysStock.get(i);
        }
        return x;
    }

    public double Profits(){
        //using the inventory function does not work because it return the total number of toys in the store.
        double y = 0.0;
        for (int i = 0; i < toys.size(); i++){
            y += toysPrice.get(i) * toysStock.get(i);
        }
        return y;
    }

    public void SalesProfits(){
        for (int i = 0; i < toys.size(); i++){
            if (toys.get(i).getblackfriday()){
                toysPrice.set(i, (toysPrice.get(i)/0.8)*0.6);
            }
        }
    }
    public String getCity(){
        return this.city;

    }
    public String getHours(){
        return this.hours;

    }

    public int getStock(int index){
        return toysStock.get(index);

    }

    public void setStock(int index, int stock){
        toysStock.set(index, stock);
    }
}
