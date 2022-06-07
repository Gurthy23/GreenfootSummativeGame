import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    
    int deltaX = 0;
    int deltaY = 0;
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        deltaX = 0;
        
        if(Greenfoot.isKeyDown("left"))
        {
            deltaX = deltaX -5;
        }    
        if(Greenfoot.isKeyDown("right"))
        {
            deltaX = deltaX +5;
        }   
        if (isTouching(Platform.class) && Greenfoot.isKeyDown("up"))
        {
            deltaY = -15;
        }
        
        
        setLocation(getX() + deltaX, getY() + deltaY);
        
        if(isTouching(Platform.class))
        {
            deltaY = 0;
        }
        else
        {
            deltaY = deltaY + 1;
        }
    }
}
