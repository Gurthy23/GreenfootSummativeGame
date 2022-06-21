import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button that causes an event if pressed
 */
public class Button extends Actor
{
    
    GameLevel world;
    //Instantiates sound variables
    boolean buttonOn = false;
    boolean playSound = false;
    boolean soundHasPlayed = false;
   
    //Instantiates images for animation
    GreenfootImage image1 = new GreenfootImage("Button0.png");
    GreenfootImage image2 = new GreenfootImage("Button1.png");

    public Button(int width, int height)
    {
        getImage().scale(width, height);
    }
    /**
         
     */
    public void act() 
    {
        //If either player is touching the button then its set to true
        collideWithPlayer();
        //And rest of code is for if player isn't touching button
        
        

    }
    public void collideWithPlayer()
    {
        
        if(getOneIntersectingObject(Player1.class) != null || getOneIntersectingObject(Player2.class) != null)
        {
            playSound = true;
            buttonOn = true;
            setImage(image2);
            
            buttonSoundEffect();
        }
        else
        {
            setImage(image1);
            soundHasPlayed = false;
            playSound = false;
        }
    }   
    protected void addedToWorld(World world)
    {
        this.world = (GameLevel)world;
    }
    public void buttonSoundEffect()
    {
        //Plays sound if soundHasPlayed = false
        if(!soundHasPlayed)
        {
            Greenfoot.playSound("ButtonSound.mp3");
            soundHasPlayed = true;
        }
        
    }
}
