import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal2 extends Actor
{
    //Instantiates variables for portals location
    public static int portal2X;
    public static int portal2Y;
    //Tracks portal location to be called upon in either player codes
    public void act() 
    {
        Actor portal2 = (Actor)getWorld().getObjects(Portal2.class).get(0);
        portal2X = portal2.getX();
        portal2Y = portal2.getY();
    }     
}
