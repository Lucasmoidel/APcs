import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        // 1. Create a 2D array with the dimensions of 3 X 3 and fill with doubles.
        // 2. Now, find the AVERAGE of the numbers in each diagonal. Your method should ask the user if they want to find the downward diagonal or the upward diagonal.
        // Although we are doing this for a 3 X 3 2D Array, this method needs to work for ANY square 2D Array!

        double[][] arr = {
            {1.2, 4.1, 6.9},
            {4.2, 7.3, 7.2},
            {1.2, 4.8, 1.9}
        };

        Scanner in = new Scanner(System.in);
        // Ask the user to enter a 1 or a 2. If a 1 is entered, find the average of the downward diagonal; if a 2 is entered, find the average of the upward diagonal.
        System.out.print("inpit 1 or 2: ");
        if (in.nextLine().equals("1")){
            System.out.println(findDiagonalDown(arr));
        } else {
           System.out.println(findDiagonalUp(arr));
        }
    }

    public static int findDiagonalDown(double[][] matrix){
        double down = 0.0;
        for (int i = 0; i < matrix.length; i++){
            down += matrix[i][i];
        }
        down = down/matrix.length;
        return (int)down;
    }
    public static int findDiagonalUp(double[][] matrix){
        double up = 0.0;
        int c = 0;
        for (int r = matrix.length-1; r >= 0; r--){
            up += matrix[r][c];
            c++;
        }
        up = up/matrix.length;
        return (int)up;
    }
}