import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<toyStore> Locations = new ArrayList<>();


        ArrayList<toy> toys = new ArrayList<>();
        toys.add(new toy("Yaesu FT-891", false, false));
        toys.add(new toy("Yaesu FTX-1", false, true));
        toys.add(new toy("Yaesu FTX-1 optima", false, true));
        toys.add(new toy("Yaesu FT-991A", false, true));
        toys.add(new toy("Icom IC-7100", false, true));
        toys.add(new toy("Icom 7300 MK2", false, false));
        toys.add(new toy("Icom IC-705", false, false));
        toys.add(new toy("Baofeng UV-5R", false, true));
        ArrayList<Integer> toysStock = new ArrayList<>();
        toysStock.add(14);
        toysStock.add(10);
        toysStock.add(4);
        toysStock.add(90);
        toysStock.add(9);
        toysStock.add(65);
        toysStock.add(43);
        toysStock.add(20);
        ArrayList<Double> toysPrice = new ArrayList<>();
        toysPrice.add(639.95);
        toysPrice.add(1149.95);
        toysPrice.add(1799.95);
        toysPrice.add(1229.95);
        toysPrice.add(1199.95);
        toysPrice.add(1499.95);
        toysPrice.add(1399.95);
        toysPrice.add(16.92);
        Locations.add(new toyStore(toys, toysStock, toysPrice, "Pleasanton", "9AM-5PM"));

        toys = new ArrayList<>();
        toys.add(new toy("Yaesu FT-891", false, false));
        toys.add(new toy("Yaesu FTX-1", false, true));
        toys.add(new toy("Yaesu FTX-1 optima", false, true));
        toys.add(new toy("Yaesu FT-991A", false, true));
        toys.add(new toy("Icom IC-7300", false, true));
        toys.add(new toy("Icom 7300 MK2", false, false));
        toys.add(new toy("Icom IC-705", false, false));
        toys.add(new toy("Baofeng UV-5R", false, true));
        toysStock = new ArrayList<>();
        toysStock.add(14);
        toysStock.add(10);
        toysStock.add(4);
        toysStock.add(90);
        toysStock.add(3);
        toysStock.add(65);
        toysStock.add(43);
        toysStock.add(20);
        toysPrice = new ArrayList<>();
        toysPrice.add(639.95);
        toysPrice.add(1149.95);
        toysPrice.add(1799.95);
        toysPrice.add(1229.95);
        toysPrice.add(1349.95);
        toysPrice.add(1499.95);
        toysPrice.add(1399.95);
        toysPrice.add(16.92);
        Locations.add(new toyStore(toys, toysStock, toysPrice, "Las Vegas", "11AM-8PM"));

    
        toys = new ArrayList<>();
        toys.add(new toy("Yaesu FT-891", false, false));
        toys.add(new toy("Yaesu FTX-1", false, true));
        toys.add(new toy("Yaesu FTX-1 optima", false, true));
        toys.add(new toy("Yaesu FT-991A", false, true));
        toys.add(new toy("Icom IC-7300", false, true));
        toys.add(new toy("Icom 7300 MK2", false, false));
        toys.add(new toy("Icom IC-705", false, false));
        toys.add(new toy("Baofeng UV-5R", false, true));
        toysStock = new ArrayList<>();
        toysStock.add(14);
        toysStock.add(10);
        toysStock.add(4);
        toysStock.add(90);
        toysStock.add(3);
        toysStock.add(65);
        toysStock.add(43);
        toysStock.add(20);
        toysPrice = new ArrayList<>();
        toysPrice.add(639.95);
        toysPrice.add(1149.95);
        toysPrice.add(1799.95);
        toysPrice.add(1229.95);
        toysPrice.add(1349.95);
        toysPrice.add(1499.95);
        toysPrice.add(1399.95);
        toysPrice.add(16.92);
        Locations.add(new toyStore(toys, toysStock, toysPrice, "New York", "2AM-1PM"));

        toys = new ArrayList<>();
        toys.add(new toy("Yaesu FT-891", false, false));
        toys.add(new toy("Yaesu FTX-1", false, true));
        toys.add(new toy("Yaesu FTX-1 optima", false, true));
        toys.add(new toy("Yaesu FT-991A", false, true));
        toys.add(new toy("Icom IC-7300", false, true));
        toys.add(new toy("Icom 7300 MK2", false, false));
        toys.add(new toy("Icom IC-705", false, false));
        toys.add(new toy("Baofeng UV-5R", false, true));
        toysStock = new ArrayList<>();
        toysStock.add(14);
        toysStock.add(10);
        toysStock.add(4);
        toysStock.add(90);
        toysStock.add(3);
        toysStock.add(65);
        toysStock.add(43);
        toysStock.add(20);
        toysPrice = new ArrayList<>();
        toysPrice.add(639.95);
        toysPrice.add(1149.95);
        toysPrice.add(1799.95);
        toysPrice.add(1229.95);
        toysPrice.add(1349.95);
        toysPrice.add(1499.95);
        toysPrice.add(1399.95);
        toysPrice.add(16.92);
        Locations.add(new toyStore(toys, toysStock, toysPrice, "Livermore", "10AM-7PM"));

        toys = new ArrayList<>();
        toys.add(new toy("Yaesu FT-891", false, false));
        toys.add(new toy("Yaesu FTX-1", false, true));
        toys.add(new toy("Yaesu FTX-1 optima", false, true));
        toys.add(new toy("Yaesu FT-991A", false, true));
        toys.add(new toy("Icom IC-7300", false, true));
        toys.add(new toy("Icom 7300 MK2", false, false));
        toys.add(new toy("Icom IC-705", false, false));
        toys.add(new toy("Baofeng UV-5R", false, true));
        toysStock = new ArrayList<>();
        toysStock.add(14);
        toysStock.add(10);
        toysStock.add(4);
        toysStock.add(90);
        toysStock.add(3);
        toysStock.add(65);
        toysStock.add(43);
        toysStock.add(20);
        toysPrice = new ArrayList<>();
        toysPrice.add(639.95);
        toysPrice.add(1149.95);
        toysPrice.add(1799.95);
        toysPrice.add(1229.95);
        toysPrice.add(1349.95);
        toysPrice.add(1499.95);
        toysPrice.add(1399.95);
        toysPrice.add(16.92);
        Locations.add(new toyStore(toys, toysStock, toysPrice, "Los Angales", "10AM-3PM"));


        for (int i = 0; i < Locations.size(); i++){
            System.out.print(Locations.get(i).getCity());
            System.out.print(" " + Locations.get(i).getHours() + "\n");

        }
        System.out.println(Locations.get(4).Inventory());
        Locations.get(4).setStock(3, 200);
        Locations.get(4).setStock(5, 2000);
        System.out.println(Locations.get(4).Inventory());

        Locations.remove(4);

        toys = new ArrayList<>();
        toys.add(new toy("Yaesu FT-891", false, false));
        toys.add(new toy("Yaesu FTX-1", false, true));
        toys.add(new toy("Yaesu FTX-1 optima", false, true));
        toys.add(new toy("Yaesu FT-991A", false, true));
        toys.add(new toy("Icom IC-7300", false, true));
        toys.add(new toy("Icom 7300 MK2", false, false));
        toys.add(new toy("Icom IC-705", false, false));
        toys.add(new toy("Baofeng BF-F8HP-PRO", false, false));
        toysStock = new ArrayList<>();
        toysStock.add(14);
        toysStock.add(10);
        toysStock.add(4);
        toysStock.add(90);
        toysStock.add(3);
        toysStock.add(65);
        toysStock.add(43);
        toysStock.add(20);
        toysPrice = new ArrayList<>();
        toysPrice.add(639.95);
        toysPrice.add(1149.95);
        toysPrice.add(1799.95);
        toysPrice.add(1229.95);
        toysPrice.add(1349.95);
        toysPrice.add(1499.95);
        toysPrice.add(1399.95);
        toysPrice.add(16.92);
        Locations.add(new toyStore(toys, toysStock, toysPrice, "Portland", "11AM-3PM"));

        System.out.println(Locations.get(4).Inventory());    
    }
}