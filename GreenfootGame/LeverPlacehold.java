import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeverPlacehold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeverPlacehold extends Actor
{
    public boolean leverOn = false;
    GreenfootImage image1 = new GreenfootImage("Lever0.png");
    GreenfootImage image2 = new GreenfootImage("Lever1.png");
    boolean playSound = false;
    boolean soundHasPlayed = false;
    
    
    public LeverPlacehold(int width, int height)
    {
        getImage().scale(width, height);
    }
    
    /**
     * Act - do whatever the LeverPlacehold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        collideWithPlayer();
        
    }
    public void collideWithPlayer()
    {
        if(getOneIntersectingObject(Player1.class) != null || getOneIntersectingObject(Player2.class) != null)
        {
            
            leverOn = true;
            setImage(image2);
            
            buttonSoundEffect();
        } 
    }
    
    public void buttonSoundEffect()
    {
        if(!soundHasPlayed)
        {
            Greenfoot.playSound("LeverSound.mp3");
            soundHasPlayed = true;
        }
    }
}       
