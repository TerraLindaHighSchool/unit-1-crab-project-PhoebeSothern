import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author Phoebe Sothern
 * @version 8/26/21
 */

public class Crab extends Actor
{
    private int numOfWorms = 8;
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
        if(isAtEdge())
       {
           turn(50);
       }
    }
    
    
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(1);
        }
    }

    
    // Check for collisions with other objects
    private void onCollision()
    {
       if(isTouching(Worm.class))  
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            numOfWorms--;
            
            System.out.println("Number of worms: " + numOfWorms);
            
            // Winning the game
            if(getWorld().getObjects(Worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        
       if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}


