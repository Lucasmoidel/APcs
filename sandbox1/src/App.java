public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(bigNums(10));
        
    }
    public static int bigNums(int k){
        for(int i = 0; i<10; i++){
            k*=10;
        }
        return k;
    } 

}
