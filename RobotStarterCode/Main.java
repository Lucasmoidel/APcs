import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void main(String[] args) 
	{
		//My robot's name is karel
    Robot karel = new Robot(5,1,South,-1);
    World.setVisible(true);
    World.setSize(7,50);
    World.setDelay(0);

    karel.putBeeper();
    move(karel, 4, true);
    karel.turnLeft();
    move(karel, 2, true);
    move(karel, 2, false);
    karel.turnLeft();
    karel.putBeeper();
    move(karel, 4, true);
    karel.turnLeft();
    karel.turnLeft();
    move(karel, 4, false);
    karel.turnLeft();
    karel.putBeeper();
    move(karel, 3, true);
    karel.turnLeft();
    move(karel, 4, true);

    turnRight(karel);
    move(karel, 2, false);
    

    karel.putBeeper();
    move(karel, 3, true);

    karel.turnLeft();
    karel.turnLeft();
    move(karel, 3, false);
    karel.turnLeft();
    
    move(karel, 4, true);
    karel.turnLeft();
    move(karel, 3, true);

    move(karel, 2, false);
    karel.putBeeper();
    for (int i = 0;i<2;i++){
      
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.move();
      karel.putBeeper();
      turnRight(karel);
    }
    turnRight(karel);
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.move();
    karel.putBeeper();
    turnRight(karel);
    karel.move();
    karel.move();
    karel.turnLeft();
    karel.move();
    karel.putBeeper();

    move(karel, 2, false);
    karel.putBeeper();
    move(karel, 2, true);
    karel.turnLeft();
    move(karel, 2, true);
    karel.turnLeft();
    move(karel, 2, true);
    turnRight(karel);
    move(karel, 2, true);
    turnRight(karel);
    move(karel, 2, true);
  }

  static void turnRight(Robot karel){
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
  }
  static void move(Robot karel, int x, Boolean putbeep){
      for (int i = 0; i < x; i++){
        karel.move();
        if (putbeep){
          karel.putBeeper();
        }
      }
  }
    
}