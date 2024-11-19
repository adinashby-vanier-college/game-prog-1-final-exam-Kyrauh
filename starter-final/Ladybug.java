// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * 
     */
    public void act()
    {
        transitionToWinningScreen();
        moveAndTurn();
        isGameWon();
    }

    /**
     * moves the ladybug with the arrow keys
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * game is won if ladybug reaches the FinishLocation
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transitiontothewinningscreen
     */
    public void transitionToWinningScreen()
    {
        World WinningScreen =  new  WinningScreen();
        Greenfoot.setWorld(WinningScreen);
    }
}
