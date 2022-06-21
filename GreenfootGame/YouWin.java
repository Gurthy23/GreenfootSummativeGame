import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends GameLevel
{

    /**
     * Constructor for objects of class YouWin.
     * 
     */
    public YouWin()
    {
        super(900 , 600, 1); 
        prepare();
        showText("You Win!", 450, 300);
    }
    private void prepare()
    {
        Platform platform = new Platform(950, 30);
        addObject(platform,183,579);
        platform.setLocation(450,585);
         addObject(player1, 40, 525);

        
        addObject(player2, 102, 525);
    }
}
