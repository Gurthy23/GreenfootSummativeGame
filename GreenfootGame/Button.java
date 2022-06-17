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

    boolean playSound = false;
    boolean soundHasPlayed = false;
   

    GreenfootImage image1 = new GreenfootImage("Button0.png");
    GreenfootImage image2 = new GreenfootImage("Button1.png");

    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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
        
        if(!soundHasPlayed)
        {
            Greenfoot.playSound("ButtonSound.mp3");
            soundHasPlayed = true;
        }
        
    }
}
