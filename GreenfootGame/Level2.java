import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
        
        
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900 , 600, 1); 
        
        Player1 player1 = new Player1();
        addObject(player1, 300, 300);
        
        Player2 player2 = new Player2();
        addObject(player2, 400, 300);
        
        Collectable collectable = new Collectable();
        addObject(collectable, 500, 300);
        
        Lethal lethal = new Lethal();
        addObject(lethal, 200, 300);
        int platformX = 0;
        for(int i = 0; i < 16; i++)
        {
            Platform platform = new Platform();
            addObject(platform, platformX, 360);
            platformX = platformX + platform.getImage().getWidth();
        }
    }
    
}
