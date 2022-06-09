import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    MyWorld world;
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Player1.class))
        {
            world.portal1.setLocation(600, 400);
        }
            
    } 
    protected void addedToWorld​(World world)
    {
        this.world = (MyWorld)world;
    }
        
}
