import java.util.ArrayList;

public class toyStore {
    ArrayList<toy> toys = new ArrayList<>();
    ArrayList<Integer> toysStock = new ArrayList<>();
    ArrayList<Double> toysPrice = new ArrayList<>();

    public void lowerPrice(){
        for (int i = 0; i < toys.size(); i++){
            if (toys.get(i).getblackfriday()){
                toysPrice.set(i, toysPrice.get(i)*0.8);
            }
        }
    }

    public int Inventory(){
        int x = 0;
        for (int i = 0; i < toysStock.size();i++){
            x+=toysStock.get(i);
        }
        return x;
    }
}
