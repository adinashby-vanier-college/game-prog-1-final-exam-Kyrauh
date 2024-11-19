// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverScreen extends World
{

    /**
     * Constructor for objects of class GameOverScreen. Displays the text given to us
     */
    public GameOverScreen()
    {
        super(600, 400, 1);
        showTextWithBigWhiteFont("Game Over", 220, 190);
    }

    /**
     * Here is where the text is displayed with a white font. There is also the winning sound playing  
     */
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(30);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
        Greenfoot.playSound("lose.wav");
    }
}
