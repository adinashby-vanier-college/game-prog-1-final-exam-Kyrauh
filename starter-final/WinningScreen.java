// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinningScreen extends World
{

    /**
     * Constructor for objects of class WinningScreen. Displays the text given to us.
     */
    public WinningScreen()
    {
        super(600, 400, 1);
        showText("Congratulations, You Win!", 280, 200);
    }

    /**
     * Here is where the text is displayed with a black font. There is also the winning sound playing  
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
        Greenfoot.playSound("win.wav");
    }
}
