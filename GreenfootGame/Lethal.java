import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leathal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lethal extends Actor
{
    /**
     * Act - do whatever the Leathal wants to do. This method is called whenever
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
            
            getWorld().removeObject(getOneIntersectingObject(Player1.class));
       } 
    
    }
    public void collideWithPlayer2()
    {
         if(getOneIntersectingObject(Player2.class) != null)
        {
            getWorld().removeObject(getOneIntersectingObject(Player2.class));
        } 
    }
    
}
