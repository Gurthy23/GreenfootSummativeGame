import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for first portal
 */
public class Portal1 extends Actor
{
    //Instantiates variables to track portal location
    public static int portal1X;
    public static int portal1Y;
    //Tracks portal location to be called upon in either player codes
    public void act() 
    {
        Actor portal1 = (Actor)getWorld().getObjects(Portal1.class).get(0);
        portal1X = portal1.getX();
        portal1Y = portal1.getY();  
    }
}