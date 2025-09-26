import kareltherobot.*;

public class JumpThoseHurdles {
  // Find the hurdle with the max height!!
  // This is the Robot we will use to jump the hurdles
 
    Robot hurdler = new Robot(1,1,Directions.East, 0); // What is different about the
    int numburdles = 3;                                    //  location of this line of code?
    int[] w = new int[numburdles]; //This creates a variable to save your width
    int[] h = new int[numburdles]; //This creates a variable to save your height.
    public static void main(String[] args) {
        new JumpThoseHurdles().start();
    }

    public void start() {
        loadWorld();
       

        for(int x = 0;x<numburdles; x++){
            w[x] = findHurdle(); //Discuss with your partner what this line of code is intended to do.
            h[x] = climbHurdle();
            clearHurdle(h[x]);
        }
        System.out.println();

       
    }

    /**
     * This method assumes the Robot is named hurdler and is facing East
     * This moves hurdler to the next wall (hurdle). It returns the number
     * of moves it took to get to the hurdle.
   * When the method is called. It will return an int. You can set it to anything you want
     */
    private int findHurdle() {
        int x = 0;
        while (hurdler.frontIsClear()){
            hurdler.move();
            x++;
        }
        return x;
    }
    /**
     * This method assumes the Robot is named hurdler, is facing East and
     * is at the base of the hurdle.
     * This moves the Robot to the top of the hurdle so that it can clear
     * the wall.  
     * @return The number of steps to get above the hurdle (height)
     */
    private int climbHurdle(){
        int heighthurdle = 0;
        while (true) {
            hurdler.turnLeft();
            hurdler.move();
            heighthurdle++;
            
            turnRight();
            if (hurdler.frontIsClear()){
                break;
            }
        }
        return heighthurdle;
    }

    /**
     * Moves the Robot (hurdler) over the wall and moves it to the ground so
     * that the Robot has its back to the hurdle and is facing the next one.
     */
    private void clearHurdle(int hurdleheight) {
       hurdler.move();
       hurdler.move();
       turnRight();
       for (int i = 0; i<hurdleheight; i++){
        hurdler.move();
       }
       hurdler.turnLeft();

    }

    private void loadWorld() {
        // line below "hardcodes" this to use one specific world
        // it would be better to ask the user...
        String worldName = "Worldb.wld";
        World.readWorld(worldName);
        World.setVisible(true);
        World.setDelay(5);
    }
    private void turnRight(){
        hurdler.turnLeft();
        hurdler.turnLeft();
        hurdler.turnLeft();
    }

}