import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StillSpikes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StillSpikes extends Actor
{
    //Instantiation of variables for Spikes
    private String[] imgs_;
    boolean isSpikeUp = true;
    boolean spikeUp = true;

    GameLevel level;
    public StillSpikes(int width, int height)
    {
        getImage().scale(width, height);
    }
    /**
     * Act - do whatever the StillSpikes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imgs_ = new String[4];
        for(int i = 0; i <imgs_.length; i++)
        {
            imgs_[i] = "Spike"+i+".png";
            
        }
        if(isSpikeUp)
        {
            collideWithPlayer1();
            collideWithPlayer2();
        }
        if(spikeUp)
        {
            isSpikeUp = spikeUp();
        }
         
    }
    //Code for spike going up, sound and animation
    public boolean spikeUp()
    {
        Greenfoot.playSound("SpikeSound.mp3");
        for(int i = 0; i < imgs_.length; i++)
        {               
            setImage(imgs_[i]);
        }
        return true;
    }
    //Code for spike going down, sound and animation
    public boolean spikeDown()
    {
        Greenfoot.playSound("SpikeSound2.mp3");
        for(int i = imgs_.length-1; i >= 0; i--)
        {
            setImage(imgs_[i]);
        }
        return false;
    }
    //Checking collision with player1
    public void collideWithPlayer1()
    {
        if(getOneIntersectingObject(Player1.class) != null)
        {
            Greenfoot.playSound("DeathSound.mp3");
            getWorld().removeObject(getOneIntersectingObject(Player1.class));
            level.isPlayer1Dead = true;
        } 
    }
    //Checking collision with player2
    public void collideWithPlayer2()
    {
        if(getOneIntersectingObject(Player2.class) != null)
        {
            Greenfoot.playSound("DeathSound.mp3");
            getWorld().removeObject(getOneIntersectingObject(Player2.class));
            level.isPlayer2Dead = true;
        } 
    }
}
