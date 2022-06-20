import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for spikes
 */
public class Spikes extends Actor
{
    //Instantiation of variables for Spikes
    private String[] imgs_;
    boolean isSpikeUp = false;

    GameLevel level;
    protected void addedToWorld(World world)
    {
        level = (GameLevel) world;
    }
    //Instantiation of spikes timer and time length
    private int spikeTimer = 300;
    private int timer = spikeTimer;
    //Code to run spikes going up and down and spike animation
    public void act() 
    {
        //Decreases every frame
        timer--;
        //Instantiation of images for spike animation
        imgs_ = new String[4];
        for(int i = 0; i <imgs_.length; i++)
        {
            imgs_[i] = "Spike"+i+".png";
            
        }
        //Checks if timer is up and runs spikeUp code
        if(isSpikeUp==false &&timer<=0)
        {
            isSpikeUp = spikeUp();
        }
        //Check if timer has run through the timer once more and runs spikeDown
        if(isSpikeUp == true && timer>=0)
        {
            isSpikeUp = spikeDown();
        }
        //Resets timer
        if(timer<= -spikeTimer)
        {
            timer = spikeTimer;
        }
        //Checks collision with players
        if(isSpikeUp)
        {
            collideWithPlayer1();
            collideWithPlayer2();
        }
        //getWorld().showText("spikeTimer:" +timer,300 ,300 ); //Shows the timer for spike
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
