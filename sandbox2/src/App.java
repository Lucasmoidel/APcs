public class App {
    public static void main(String[] args) throws Exception {
        int x  = 10;
        x = x/3; //integer math gives only whole number
        double y = 10.5;
        y = y / 3;

        //int z = 10;
        //z = z/3.0; // this does not work because the result is a double and z in an int
        int j = Integer.MAX_VALUE;
        int k = Integer.MIN_VALUE;
        System.out.println();
        System.out.println();
        if(j<k){
            System.out.println("k is bigger");
        } else {
            System.out.println("j is bigger");
        }

    }
    ///////////////wirte new methods under this line
    public static int bigNum(int x){
        for (int i = 0; i < 20; i++){
            x*=10;
        }
        return x;
    }
}
