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
        //Tells user to press r
        showText("Press \"r\" to restart your level", 450, 300);
        //Checks what level the user is currently on
        int levelCurrent = Level2.levelCurrent;
         //If user presses r then it restarts the level they are currently on
        if(Greenfoot.isKeyDown("r"))
        {
            //Sets level to level 2
            if(levelCurrent == 2)
            {
                Greenfoot.setWorld(new Level2());
            }
            //Sets level back to level 3
            if(levelCurrent == 3)
            {
                Greenfoot.setWorld(new Level3());
            }
        }
    }
}
