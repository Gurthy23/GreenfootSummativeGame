import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button that causes an event if pressed
 */
public class Button extends Actor
{
    
    MyWorld world;
    //Instantiates sound variables
    boolean playSound = false;
    boolean soundHasPlayed = false;
   
    //Instantiates images for animation
    GreenfootImage image1 = new GreenfootImage("Button0.png");
    GreenfootImage image2 = new GreenfootImage("Button1.png");

    /**
         
     */
    public void act() 
    {
        //If either player is touching the button then its set to true
        //And rest of code is for if player isn't touching button
        if (isTouching(Player1.class) || isTouching(Player2.class))
        {
            playSound = true;
            world.portal1.setLocation(600, 400);
            setImage(image2);
        }
    
        else
        {
            setImage(image1);
            soundHasPlayed = false;
            playSound = false;
        }
        //Runs buttonSoundEffect code if playSound = true
        if (playSound)
        {
            buttonSoundEffect();
        }

    } 
    protected void addedToWorld(World world)
    {
        this.world = (MyWorld)world;
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
