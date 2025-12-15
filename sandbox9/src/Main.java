public class Main{
    public static void main(String args[]){
        int[] arr = {1, 4, 5, 2, 9};
        double huge = Math.random() * Integer.MAX_VALUE;
        System.out.println(huge);
        System.out.println((int) (huge) % arr.length);

    }
}