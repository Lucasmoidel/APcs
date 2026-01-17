import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<Lego> arr1 = new ArrayList<>();
        arr1.add(new Lego("thing"));
        arr1.add(new Lego("human"));
        arr1.add(new Lego("brick"));
        arr1.add(new Lego("1x1"));
        ArrayList<Lego> arr2 = new ArrayList<>();
        arr2.add(new Lego("thing", 19.2));
        arr2.add(new Lego("human", 14.6));
        arr2.add(new Lego("brick", 19.99));
        arr2.add(new Lego("1x1", 8.1));
        ArrayList<Lego> arr3 = new ArrayList<>();
        arr3.add(new Lego("thing", 19.2, 1));
        arr3.add(new Lego("human", 14.6, 56));
        arr3.add(new Lego("brick", 19.99, 9));
        arr3.add(new Lego("1x1", 8.1, 4));
        for(int i = 0; i < arr1.size(); i++){
            System.out.println(arr1.get(i));
        }
        for(int i = 0; i < arr2.size(); i++){
            System.out.println(arr2.get(i));
        }
        for(int i = 0; i < arr3.size(); i++){
            System.out.println(arr3.get(i));
        }
    }
}