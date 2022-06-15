import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal1 extends Actor
{
    public static int portal1X;
    public static int portal1Y;
    /**
     * Act - do whatever the Portal1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         
         
         
         
            Actor portal1 = (Actor)getWorld().getObjects(Portal1.class).get(0);
            portal1X = portal1.getX();
            portal1Y = portal1.getY();
            
    }
}