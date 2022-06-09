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
        
        
        Player1 player1 = new Player1();
        addObject(player1, 300, 240);
        
        Player2 player2 = new Player2();
        addObject(player2, 400, 240);
        
        Collectable collectable = new Collectable();
        addObject(collectable, 500, 240);
        
        Lethal lethal = new Lethal();
        addObject(lethal, 200, 240);
        
        DoorwayP1 doorwayp1 = new DoorwayP1();
        addObject(doorwayp1, 600, 240);
        
        DoorwayP2 doorwayp2 = new DoorwayP2();
        addObject(doorwayp2, 700, 240);
        
        int platformX = 0;
        for(int i = 0; i < 16; i++)
        {
            Platform platform = new Platform();
            addObject(platform, platformX, 300);
            platformX = platformX + platform.getImage().getWidth();
        }
        
        addObject(portal1, 600, 240);
        
        Portal2 portal2 = new Portal2();
        addObject(portal2, 200, 100);
        
        Button button = new Button();
        addObject(button, 850, 240);
    }
    public void act()
    {
        boolean isP1TouchingDoor = Player1.touchingDoorP1;
        boolean isP2TouchingDoor = Player2.touchingDoorP2;
        if(isP1TouchingDoor  == true && isP2TouchingDoor == true)
        {
            Greenfoot.setWorld(new Level2());
        }
    }
    
}
