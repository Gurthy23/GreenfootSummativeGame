import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeverPlacehold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeverPlacehold extends Actor
{
    public static boolean leverOn = false;
    public LeverPlacehold(int width, int height)
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
            leverOn = true;
        } 
    }
    public void collideWithPlayer2()
    {
        if(getOneIntersectingObject(Player2.class) != null)
        {
            leverOn = true;                         
        } 
    }    
}       
