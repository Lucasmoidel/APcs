import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;

import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {


  public static void turnRight(Robot fred) {
    for (int i = 0; i < 3; i++) {
      fred.turnLeft();
    }
  }

  public static void turnLeft(Robot fred) {
    fred.turnLeft();
  }
  public static void diag(Robot fred, Direction dir, int length) {
    while (fred.direction() != dir) {
      turnLeft(fred);
    }
    for (int x = 0; x < length; x++) {
      fred.putBeeper();
      fred.move();
      turnLeft(fred);
      fred.move();
      turnRight(fred);
    }
  }
  public static void main(String[] args) {
    int length = 0;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter your user name");
    String userName = myObj.nextLine();  // Read user input of a String
    if (userName.contentEquals("random")){
      length = (int)(Math.random() * (100 - 1 + 1)) + 1;
    }else{
    System.out.println("Hello " + userName + "! It is good to meet you!");  // Returns user output user input
    
    Scanner in = new Scanner(System.in); // Read the user input of an int
    System.out.println("How many beepers do you want on each side of the diamond?");
    length = in.nextInt(); //Stores the number of beepers on each side of the diamond
    }
    Robot fred = new Robot(1, length+1, North, -1);
    World.setVisible(true);
    World.setSize(length*2+1, length*2+1);
    World.setDelay(1); 
    
    
    diag(fred, North, length);
    diag(fred, East, length);
    diag(fred, South, length);
    diag(fred, West, length);
    turnRight(fred);
    for (int i = 0; i<length*2;i++){
      fred.move();
      fred.putBeeper();
    }
    turnRight(fred);
    turnRight(fred);
      for (int x = 0; x < length; x++) {

        fred.move();
        turnLeft(fred);
        fred.move();
        turnRight(fred);
    }
    turnRight(fred);
    for (int i = 0; i<length*2;i++){
      fred.move();
      fred.putBeeper();
    }

    }

}