import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    static boolean touchingDoorP1 = false;
    int deltaX = 0;
    int deltaY = 0;
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        
        setLocation(getX() + deltaX, getY() + deltaY);
        
        if(isTouching(Platform.class))
        {
            deltaY = 0;
        }
        else
        {
            deltaY = deltaY + 1;
        }
        hitCollectable();
        movement();
        doorwayLevel();
    }
    public void movement()
    {
        deltaX = 0;
        
        if(Greenfoot.isKeyDown("left"))
        {
            deltaX = deltaX -4;
        }    
        if(Greenfoot.isKeyDown("right"))
        {
            deltaX = deltaX +4;
        }   
        if (isTouching(Platform.class) && Greenfoot.isKeyDown("up"))
        {

            deltaY = -16;
            
        } 

        if(Greenfoot.isKeyDown("p"))

        {
            Greenfoot.setWorld(new Level2());
        }
    }
    public void hitCollectable()
    {
       if(getOneIntersectingObject(Collectable.class) != null)
       {
            getWorld().removeObject(getOneIntersectingObject(Collectable.class));
       } 
    }
    public void doorwayLevel()
    {
        touchingDoorP1 = false;
        if(isTouching(DoorwayP1.class))
        {
            touchingDoorP1 = true;
        }
        if(isTouching(Portal1.class))
        {
            setLocation(200, 100);
        }
    }
}
