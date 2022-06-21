import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Code for 2nd Lever
 */
public class Lever2 extends Actor
{
    //Instantiation of variables and images for lever
    public boolean lever2On = false;
    GreenfootImage image1 = new GreenfootImage("Lever0.png");
    GreenfootImage image2 = new GreenfootImage("Lever1.png");
    boolean playSound = false;
    boolean soundHasPlayed = false;
    
    public Lever2(int width, int height)
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
            lever2On = true;
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
