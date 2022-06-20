import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathScreen extends World
{

    /**
     * Constructor for objects of class DeathScreen.
     * 
     */
    public DeathScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
    }
    public void act()
    {
        showText("Press \"r\" to restart your level", 450, 300);
        int levelCurrent = Level2.levelCurrent;
        if(Greenfoot.isKeyDown("r"))
        {
            if(levelCurrent == 2)
            {
                Greenfoot.setWorld(new Level2());
            }
        }
    }
}
