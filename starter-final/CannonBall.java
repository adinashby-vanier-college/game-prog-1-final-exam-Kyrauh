// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * where all the actions take place.
     */
    public void act()
    {
        transitionToGameOverScreen();
        isGameOver();
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
        }
    }

    /**
     * transitiontoGameOverScreen
     */
    public void transitionToGameOverScreen()
    {
        World gameOverScreen =  new  GameOverScreen();
        Greenfoot.setWorld(gameOverScreen);
    }

    /**
     * game is lost if ladybug touches the cannon
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
