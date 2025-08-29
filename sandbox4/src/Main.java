import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

//Uncomment each of these print statements one at a time to test your code. Once you get it to work, recomment the print statement and move on to the next one.

        System.out.println("Problem #1: " + countByTens());
        System.out.println("Problem #2: " + divideByNine());
        System.out.println("Problem #3: " + twoStepsForward());
        System.out.println("Problem #4: " + twoStepsForward());
        System.out.println("Problem #5: " + lotsOfMath());
        System.out.println("Problem #6: " + solveForY());
        System.out.println("Problem #7: " + solveForX());
        System.out.println("Problem #8: " + pickANumber());
        System.out.println("Problem #9: " + myIntMathProblem());
        System.out.println("Problem #10: " + myDoubleMathProblem());


    }
//1. Create a method that counts by 10s that starts at an initial value of -5 and uses a loop to count by 10s 20 times. 
public static int countByTens(){
    int x = -5;
    for (int i = 0; i<20;i++){
        x+=10;
    }
    return x;//note: this is a placeholder. You will have to make changes to this value in order to get the correct returned value!
}
//2. Create a method that takes an initial value of x=-20.5, divides this value by 9, and then adds it to the last value of x 5 times. 
public static double divideByNine(){
    double x = -20.5;
    x/=9;
    for (int i = 0; i<5;i++){
        x+=countByTens();
    }
    return x;//note: this is a placeholder. You will have to make changes to this value in order to get the correct returned value!
}

//3. Create a method that alternates adding 2 to an initial value of 0, but the next time subtracts 3. In other words, your individual outputs should be 2, -1, 1, -2, etc. Do this 100 times. 
public static int twoStepsForward(){
    int x = 0;
    for (int i = 0; i<100;i++){
        if(i%2 == 0){
            x+=2;
        } else {
            x-=3;
        }
    }
    return x;
}

//4. Create a method that takes an initial value of 100, divides by 2, and then adds 1 to the answer. Do this 100 times. You should get decimal values at the end of this problem (so, what kind of a variable should I create?)

public static double halfPlusOne(){
    double x = 100;
    for (int i = 0; i<100;i++){
        x = (x/2) + 1;
    }

    return x;
}

//5. Create a method that takes an initial value of -10; squares the value; adds half of the answer to the total; then takes the square root of the answer and adds it to the last value of x (hint: Google how to find the square root of a value in Java!)

public static double lotsOfMath(){
    double x = -10.0;
    x=halfPlusOne()+Math.sqrt((x*x) + ((x*x)/2));
    return x;
}

//6. Given the equation: y = 1.5X^2-4, write a method that will calculate the value of y if the initial value of x is 5 (no loop here!)

public static double solveForY(){
    double x = 5;
    return Math.pow((1.5*x), -2);
}

//7. Given the equation: y = 1.5X^2-4, write a method that will calculate the value of x if the initial value of y is -2 (no loop here!)

public static double solveForX(){
    double x = -2;
    return Math.pow((1.5*x), -2);
}

//8. Create a method that uses a Scanner object to ask the user's name and then to pick a number between 1 and 50. (Hint: go back to the commented code at the top of our Make a Diamond Robot Project for hints on this.) Given the input, return a number that has taken this input and squared it. 

public static int pickANumber(){
    System.out.println("What is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("pick a number between 1 and 50: ");
    int x = scanner.nextInt();
    return x*x;
}
//9. Create your own scenario for a method that takes a pre-determined int input, uses a loop to do math, and then returns the value. 
//Instructions for writing this method: 

public static int myIntMathProblem(){
    int x = 23;
    for (int i = 0; i<20;i++){
        x/=4;
        x*=100;
    }
    return x;
}

//9. Create your own scenario for a method that takes a pre-determined double input, uses a loop to do math, and then returns the value. 
//Instructions for writing this method: 

public static double myDoubleMathProblem(){
    double x = 23;
    for (int i = 0; i<20;i++){
        x/=4;
        x*=100;
    }
    return x;
}

}
