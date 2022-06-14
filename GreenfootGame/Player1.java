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
    public Player1(int width, int height)
    {
        getImage().scale(width, height);
    }
    int deltaX = 0;
    int deltaY = 0;
    boolean InAir;
    final int gravityVal = 1;
    

    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        CollisionCheck();
        Gravity();
        hitCollectable();
        movement();
        touchingActor();
    }
    public void movement()
    {
        deltaX = 0;
        if(Greenfoot.isKeyDown("left"))
        {
            deltaX = deltaX -6;
        }    
        if(Greenfoot.isKeyDown("right"))
        {
            deltaX = deltaX +6;
        } 
        if (InAir == false && Greenfoot.isKeyDown("up"))
        {
            deltaY = -15;
        }
        
        setLocation(getX() + deltaX, getY() + deltaY);

        if(Greenfoot.isKeyDown("p"))

        {
            Greenfoot.setWorld(new Level2());
        }
    }
    public void Gravity()
    {
        int height = getImage().getHeight();
        
        Actor platformBottom = getOneObjectAtOffset(0, height / 2, Platform.class);
        
        if (platformBottom != null)   // if indeed there is platform touching the bottom of the character.
        {
            deltaY = 0;     // Don't apply gravity.
            InAir = false;
            
            moveOnTopOfObject(platformBottom);    // Adjust position to just touching platform.
         
        }
        else    // No platform below.
        {
            deltaY = deltaY + gravityVal;  // Apply gravity.
            InAir = true;
        }
    }
    public void CollisionCheck()
    {
           int width = getImage().getWidth();
           int height = getImage().getHeight();
           Actor platformRight = getOneObjectAtOffset(width / 2, 0, Platform.class);
           Actor platformLeft = getOneObjectAtOffset(-width / 2, 0, Platform.class);
           Actor platformTop = getOneObjectAtOffset(0, -height / 2, Platform.class);
           if (platformRight != null)
            {
                moveToLeftEdge(platformRight);
            }
           if (platformLeft != null)
            {
                moveToRightEdge(platformLeft);
            }
           if (platformTop != null)
            {
               moveToBottom(platformTop);
            }
    }
    public void hitCollectable()
    {
       if(getOneIntersectingObject(Collectable.class) != null)
       {
            getWorld().removeObject(getOneIntersectingObject(Collectable.class));
       } 
    }
    public void touchingActor()
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
        if(isTouching(LeverPlacehold.class))
        {
            
        }
    }
    public void moveOnTopOfObject(Actor object)
    {
        int height = getImage().getHeight();
        int objectHeight = object.getImage().getHeight();
        
        // Adjust character position so that its bottom edge is just touching top edge of object.
        setLocation(getX(), object.getY() - objectHeight / 2 - height / 2 + 1); 
       
    }
    public void moveToBottom(Actor object)
    {
        int height = getImage().getHeight();
        int objectHeight = object.getImage().getHeight();
        
        // Adjust character position so that its bottom edge is just touching top edge of object.
        setLocation(getX(), object.getY() + objectHeight / 2 + height / 2 - 1);  
       
    }
    public void moveToLeftEdge(Actor object)
    {
        int width = getImage().getWidth();
        int objectWidth = object.getImage().getWidth();
        
        // Adjust character position so that its bottom edge is just touching top edge of object.
        setLocation(object.getX() - objectWidth / 2 - width / 2 + 1,getY()); 
    }
    public void moveToRightEdge(Actor object)
    {
        int width = getImage().getWidth();
        int objectWidth = object.getImage().getWidth();
        
        // Adjust character position so that its bottom edge is just touching top edge of object.
        setLocation(object.getX() + objectWidth / 2 + width / 2 - 1,getY());  
    }
}
