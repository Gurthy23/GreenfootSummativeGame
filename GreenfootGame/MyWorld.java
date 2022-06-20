import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Portal1 portal1 = new Portal1();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(900 , 600, 1); 
        
        
        Player1 player1 = new Player1(100,50);
        addObject(player1, 300, 240);
        
        Player2 player2 = new Player2(100,50);
        addObject(player2, 400, 240);
        
        Collectable collectable1 = new Collectable();
        addObject(collectable1, 500, 240);
        
        Collectable collectable2 = new Collectable();
        addObject(collectable2, 400, 75);
        
        

        //addObject(lethal, 200, 240);

        
        DoorwayP1 doorwayp1 = new DoorwayP1();
        addObject(doorwayp1, 600, 240);
        
        DoorwayP2 doorwayp2 = new DoorwayP2();
        addObject(doorwayp2, 700, 240);
        
        Platform platform = new Platform(900, 30);
        addObject(platform,183,579);
        platform.setLocation(457,290);
        
        
        addObject(portal1, 600, 240);
        
        Portal2 portal2 = new Portal2();
        addObject(portal2, 200, 100);
        
        Button button = new Button();
        addObject(button, 850, 240);
        
        Spikes spikes = new Spikes();
        addObject(spikes,100,240);
    }
    public void act()
    {
        
    }
    
}
