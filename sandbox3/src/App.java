public class App {
    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int x = 10;

        if (x < min){
            min=x;
        }
        x = -5;
        if (x < min){
            min=x;
        }
        System.out.println("this is the max: " + max);
        System.out.println("this is the min: " + min);
    }
}
