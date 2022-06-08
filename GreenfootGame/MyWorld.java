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
        
        Portal1 portal1 = new Portal1();
        addObject(portal1, 600, 240);
        
        Portal2 portal2 = new Portal2();
        addObject(portal2, 200, 100);
        
        
    }
    public void act()
    {
        Greenfoot.playSound("Tobu_Candyland_but_its_so_low_quality_it_hurts.mp3");
    }
}
