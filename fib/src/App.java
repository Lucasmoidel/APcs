import java.util.Random;
import java.util.Scanner;  // Import the Scanner class
public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int random = r.nextInt(100); // Generates a number from 0 to 99
        Scanner myObj = new Scanner(System.in);
        String guess = "";
        while (Integer.valueOf(guess) != random){
            System.out.println("pick a random number between 1 and 100: ");
            guess = myObj.next();
            if (Integer.valueOf(guess) >= random){

                System.out.println(guess + " was too high");
            } else if (Integer.valueOf(guess) >= random){

                System.out.println(guess + " was too low");
            }
        }
        System.out.println(guess + " was correct");
        
    }
}
