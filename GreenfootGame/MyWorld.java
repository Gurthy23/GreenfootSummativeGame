import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900 , 600, 1); 
        
        Player1 player1 = new Player1();
        addObject(player1, 300, 240);
        
        Player2 player2 = new Player2();
        addObject(player2, 400, 240);
        int platformX = 0;
        for(int i = 0; i < 16; i++)
        {
            Platform platform = new Platform();
            addObject(platform, platformX, 300);
            platformX = platformX + platform.getImage().getWidth();
        }
    }
}
