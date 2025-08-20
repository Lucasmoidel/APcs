import javax.swing.*;
import java.awt.event.*;
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
    int length = 18;
    Robot fred = new Robot(1, length+1, North, -1);
    World.setVisible(true);
    World.setSize(length*2+1, length*2+1);
    World.setDelay(1);
    
    
    diag(fred, North, length);
    diag(fred, East, length);
    diag(fred, South, length);
    diag(fred, West, length);
    }

}