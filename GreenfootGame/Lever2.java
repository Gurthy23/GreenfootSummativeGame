import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lever2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lever2 extends Actor
{
    public static boolean lever2On = false;
    GreenfootImage image1 = new GreenfootImage("Lever0.png");
    GreenfootImage image2 = new GreenfootImage("Lever1.png");
    public Lever2(int width, int height)
    {
        getImage().scale(width, height);
    }
    
    /**
     * Act - do whatever the LeverPlacehold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        collideWithPlayer1();
        collideWithPlayer2();
        
    }
    public void collideWithPlayer1()
    {
        if(getOneIntersectingObject(Player1.class) != null)
        {
            lever2On = true;
            setImage(image2);
        } 
    }
    public void collideWithPlayer2()
    {
        if(getOneIntersectingObject(Player2.class) != null)
        {
            lever2On = true;   
            setImage(image2);
        } 
    }
}
