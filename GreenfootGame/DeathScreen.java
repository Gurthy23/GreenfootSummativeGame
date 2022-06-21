import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathScreen extends World
{
    int currentLevel;
    
    
    public DeathScreen(int currentLevel)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        this.currentLevel = currentLevel;
    }
    public void act()
    {
        //Tells user to press r
        showText("Press \"r\" to restart your level", 450, 300);
        //Checks what level the user is currently on
        
         //If user presses r then it restarts the level they are currently on
        if(Greenfoot.isKeyDown("r"))
        {
            if(currentLevel == 1)
            {
                Greenfoot.setWorld(new RealLevel1());   
            }
            
            //Sets level to level 2
            if(currentLevel == 2)
            {
                Greenfoot.setWorld(new Level2());
            }

            if(currentLevel == 3)
            {
                Greenfoot.setWorld(new Level3());

            }
        }
    }
}
