import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
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
        if(Greenfoot.isKeyDown("a"))
        {
            deltaX = deltaX -6;
        }    
        if(Greenfoot.isKeyDown("d"))
        {
            deltaX = deltaX +6;
        } 
        if (isTouching(Platform.class) && Greenfoot.isKeyDown("w"))
        {
            deltaY = -12;
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
        if(isTouching(Portal1.class))
        {
            setLocation(200, 100);
        }
    }
}
