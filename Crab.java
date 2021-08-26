import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author Phoebe Sothern
 * @version 8/26/21
 */

public class Crab extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {

    }
    
    
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        
    }
    
    // Check for collisions with other objects
    private void onCollision()
    {
       if(isAtEdge())
       {
           turn(-50);
       }
    }
}


