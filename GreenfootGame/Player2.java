import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for player2 actor
 */
public class Player2 extends Actor
{
    //Instantiation of images for player animation
    GreenfootImage image1 = new GreenfootImage("BillRunningRight.png");
    GreenfootImage image2 = new GreenfootImage("BillStandingRight.png");
    GreenfootImage image3 = new GreenfootImage("BillRunningLeft.png");
    GreenfootImage image4 = new GreenfootImage("BillStandingLeft.png");
    int FrameCount = 0;
    
    boolean touchingDoorP2 = false;
    //Allows code to be accessed from other classes
    GameLevel level;
    protected void addedToWorld(World world)
    {
        level = (GameLevel) world;
    }
    public Player2(int width, int height)
    {
        getImage().scale(width, height);
    }
    //Instantiates variable for player movement/score
    int deltaX = 0;
    int deltaY = 0;
    boolean InAir;
    final int gravityVal = 1;
    public int score = 0;
    //Runs rest of code
    public void act() 
    {
        //FrameCounter
        FrameCount++;
        
        if (FrameCount == 15)
        {
            FrameCount = 0;
        }
        PillarCollisionCheck();
        GateCollisionCheck();
        Gravity();
        CollisionCheck();
        hitCollectable();
        movement();
        touchingActor();
    }   
    //Movement code for player actor to move along with animation
    public void movement()
    {
        deltaX = 0;
        if(Greenfoot.isKeyDown("a"))
        {
            deltaX = deltaX -6;
            if (FrameCount == 5)
            {
                setImage(image3);
            }
            else if (FrameCount == 10)
            {
                setImage(image4); 
            }
            
            if (FrameCount == 15)
            {
                FrameCount = 0;
            }
        }    
        if(Greenfoot.isKeyDown("d"))
        {
            deltaX = deltaX +6;
            if (FrameCount == 5)
            {
                setImage(image1);
            }
            else if (FrameCount == 10)
            {
                setImage(image2); 
            }
            
            if (FrameCount == 15)
            {
                FrameCount = 0;
            }
        }   
        if (InAir == false && Greenfoot.isKeyDown("w"))
        {
            Greenfoot.playSound("JumpSound.mp3");
            deltaY = -15;
        }
        
        
        setLocation(getX() + deltaX, getY() + deltaY);
    }
    //Gravity to increase speed of player falling if from high height 
    public void Gravity()
    {
        int height = getImage().getHeight();
        
        Actor platformBottom = getOneObjectAtOffset(0, height / 2, Platform.class);
        Actor pillarBottom = getOneObjectAtOffset(0, height / 2, Pillar.class);
        if (platformBottom != null)   // if indeed there is platform touching the bottom of the character.
        {
            deltaY = 0;     // Don't apply gravity.
            InAir = false;
            
            moveOnTopOfObject(platformBottom);    // Adjust position to just touching platform.
         
        }
        else if (pillarBottom != null)
        {
            deltaY = 0;     // Don't apply gravity.
            InAir = false;
            
            moveOnTopOfObject(pillarBottom);    // Adjust position to just touching platform.
        }
        else    // No platform below.
        {
            if(deltaY < 20)
            {
                deltaY = deltaY + gravityVal;  // Apply gravity.
            }
            InAir = true;
        }
    }
    //Checks if player is colliding with platform object
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
    //Checks if player is colliding with the gate object
    public void GateCollisionCheck()
    {
           int width = getImage().getWidth();
           int height = getImage().getHeight();
           Actor gateRight = getOneObjectAtOffset(width / 2, 0, Gate.class);
           Actor gateLeft = getOneObjectAtOffset(-width / 2, 0, Gate.class);
           Actor gateTop = getOneObjectAtOffset(0, -height / 2, Gate.class);
           if (gateRight != null)
            {
                moveToLeftEdge(gateRight);
            }
           if (gateLeft != null)
            {
                moveToRightEdge(gateLeft);
            }
           if (gateTop != null)
            {
               moveToBottom(gateTop);
            }
    }
    //Checks if player is colliding with the gate object
    public void PillarCollisionCheck()
    {
           int width = getImage().getWidth();
           int height = getImage().getHeight();
           Actor pillarRight = getOneObjectAtOffset(width / 2, 0, Pillar.class);
           Actor pillarLeft = getOneObjectAtOffset(-width / 2, 0, Pillar.class);
           Actor pillarTop = getOneObjectAtOffset(0, -height / 2, Pillar.class);
           if (pillarRight != null)
            {
                moveToLeftEdge(pillarRight);
            }
           if (pillarLeft != null)
            {
                moveToRightEdge(pillarLeft);
            }
           if (pillarTop != null)
            {
               moveToBottom(pillarTop);
            }
    }
    //Checks if player has touched a collectable, plays sound and increases score
    public void hitCollectable()
    {
       if(getOneIntersectingObject(Collectable.class) != null)
       {
           score += 10;
           Greenfoot.playSound("CoinSound.mp3");
           getWorld().removeObject(getOneIntersectingObject(Collectable.class));
       } 
    }
    //Multiple different checks for if player is touching door or portal
    public void touchingActor()
    {
        int portal1X = Portal1.portal1X;
        int portal1Y = Portal1.portal1Y;
        int portal2X = Portal2.portal2X;
        int portal2Y = Portal2.portal2Y;
        touchingDoorP2 = false;
        if(isTouching(DoorwayP2.class))
        {
            level.isPlayer2TouchingDoor = true;
        }
        if(isTouching(Portal1.class))
        {
            Greenfoot.playSound("PortalSound.mp3");
            setLocation(portal2X, portal2Y);
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
