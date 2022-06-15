import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal2 extends Actor
{
    public static int portal2X;
    public static int portal2Y;
    /**
     * Act - do whatever the Portal1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         Portal2 portal2 = new Portal2();
         portal2X = portal2.getX();
         portal2Y = portal2.getY();
    }     
}
