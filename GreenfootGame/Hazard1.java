import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hazard1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hazard1 extends Actor
{
    int deltaX = 0;
    int deltaY = 0;
    /**
     * Act - do whatever the Hazard1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int deltaX = 0;
        setLocation(getX() + deltaX, getY() + deltaY);
        
    }
    
}
