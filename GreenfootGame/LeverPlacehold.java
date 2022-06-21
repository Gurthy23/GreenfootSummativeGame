import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for lever
 */
public class LeverPlacehold extends Actor
{
    //Instantiates variables and images for lever
    public boolean leverOn = false;
    GreenfootImage image1 = new GreenfootImage("Lever0.png");
    GreenfootImage image2 = new GreenfootImage("Lever1.png");
    boolean playSound = false;
    boolean soundHasPlayed = false;
    
    
    public LeverPlacehold(int width, int height)
    {
        getImage().scale(width, height);
    }
    public void act() 
    {
        collideWithPlayer();
        
    }
    public void collideWithPlayer()
    {
        //If collides with either player then switches lever image and 
        //sets lever2On to true
        if(getOneIntersectingObject(Player1.class) != null || getOneIntersectingObject(Player2.class) != null)
        {
            
            leverOn = true;
            setImage(image2);
            
            buttonSoundEffect();
        } 
    }
    //Plays lever sound
    public void buttonSoundEffect()
    {
        if(!soundHasPlayed)
        {
            Greenfoot.playSound("LeverSound.mp3");
            soundHasPlayed = true;
        }
    }
}       
