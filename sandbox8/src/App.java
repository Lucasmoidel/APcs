public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        String s = "Pigskin";
        if (s.contains("skin")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        while (x<20){
            x++;
            System.out.println(x);
        }
    }
}
