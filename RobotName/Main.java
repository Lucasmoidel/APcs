import javax.swing.*;
import java.awt.event.*;
import java.sql.Time;

import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void main(String[] args) 
	{ 
    World.setVisible(true);
    World.setSize(6,23);
    World.setDelay(20);
    try {
      Thread.sleep(10000); // Pause for 1 second
    } catch (InterruptedException e) {
      // Handle the interruption
    }

    
    Thread lThread = new Thread(() -> {
      Robot l = new Robot(5,1,South,-1);
      l.putBeeper();
      move(l, 4, true);
      l.turnLeft();
      move(l, 2, true);
    });

    Thread uThread = new Thread(() -> {
      Robot u = new Robot(1,5,East,-1);
      u.turnLeft();
      u.putBeeper();
      move(u, 4, true);
      u.turnLeft();
      u.turnLeft();
      move(u, 4, false);
      u.turnLeft();
      move(u, 3, true);
      u.turnLeft();
      move(u, 4, true);
    });


    Thread cThread = new Thread(() -> {
      Robot c = new Robot(5,10,East,-1);
      c.putBeeper();
      move(c, 3, true);

      c.turnLeft();
      c.turnLeft();
      move(c, 3, false);
      c.turnLeft();
      
      move(c, 4, true);
      c.turnLeft();
      move(c, 3, true);
    });


    Thread aThread = new Thread(() -> {
      Robot a = new Robot(1,15,East,-1);
      a.putBeeper();
      
      a.turnLeft();
      move(a, 3, true);
      a.move();
      turnRight(a);
      a.move();
      a.putBeeper();
      a.move();
      a.putBeeper();
      a.move();
      turnRight(a);
      
      move(a, 4, true);
      a.turnLeft();
      a.turnLeft();
      move(a, 2, false);
      a.turnLeft();
      move(a, 2, true);
    });
    
    Thread sThread = new Thread(() -> {
      Robot s = new Robot(1,20,East,-1);
      s.putBeeper();
      move(s, 2, true);
      s.turnLeft();
      move(s, 2, true);
      s.turnLeft();
      move(s, 2, true);
      turnRight(s);
      move(s, 2, true);
      turnRight(s);
      move(s, 2, true);
    });


    lThread.start();
    uThread.start();
    cThread.start();
    aThread.start();
    sThread.start();

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