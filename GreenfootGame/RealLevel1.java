import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RealLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RealLevel1 extends World
{
    boolean leverOn = false;
    /**
     * Constructor for objects of class RealLevel1.
     * 
     */
    public RealLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        Player1 player1 = new Player1(30, 40);
        addObject(player1, 420, 550);
        
        Player2 player2 = new Player2(30, 40);
        addObject(player2, 470, 550);

        prepare();
        
    }
    private void prepare()
    {
        Platform platform1 = new Platform(200, 30);
        addObject(platform1,183,579);
        platform1.setLocation(450,585);
        
        Platform platform2 = new Platform(200, 30);
        addObject(platform2,183,579);
        platform2.setLocation(100,585);
        
        Platform platform3 = new Platform(200, 30);
        addObject(platform3,183,579);
        platform3.setLocation(800,585);
        
        Lever2 lever1 = new Lever2(30,30);
        addObject(lever1,100,100);
        lever1.setLocation(50,555);
    }    
    
    
}
