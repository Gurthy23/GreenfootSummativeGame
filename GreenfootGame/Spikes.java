import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikes extends Actor
{
    private String[] imgs_;
    boolean isSpikeUp = false;
    int frameCounter = 0;
    /**
     * Act - do whatever the Spikes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        imgs_ = new String[4];

        for(int i = 0; i <imgs_.length; i++)
        {
            imgs_[i] = "Spike"+i+".png";
            
        }
        if(Greenfoot.isKeyDown("o"))
        {
            isSpikeUp = spikeUp();
        }   
        if(Greenfoot.isKeyDown("i"))
        {
            isSpikeUp = spikeDown();
        }  
        if(isSpikeUp)
        {
            collideWithPlayer1();
            collideWithPlayer2();
        }
        
    } 
    
    public boolean spikeUp()
    {
        Greenfoot.playSound("SpikeSound.mp3");
        frameCounter++;


        if (frameCounter == 0)
        {
            setImage(imgs_[0]);
        }
        if (frameCounter == 5)
        {
            setImage(imgs_[1]);
        }
        if (frameCounter == 10)
        {
            setImage(imgs_[2]);
        }
        if (frameCounter == 15)
        {
            setImage(imgs_[3]);
        }
        if (frameCounter == 20)
        {
            frameCounter = 0;
        }
        return true;
    }
    public boolean spikeDown()
    {
        
        Greenfoot.playSound("SpikeSound2.mp3");
        for(int i = imgs_.length-1; i >= 0; i--)
        {
            setImage(imgs_[i]);
        }
        return false;
    }
    public void collideWithPlayer1()
    {
        if(getOneIntersectingObject(Player1.class) != null)
        {
            Greenfoot.playSound("DeathSound.mp3");
            getWorld().removeObject(getOneIntersectingObject(Player1.class));
        } 
    }
    public void collideWithPlayer2()
    {
        if(getOneIntersectingObject(Player2.class) != null)
        {
            Greenfoot.playSound("DeathSound.mp3");
            getWorld().removeObject(getOneIntersectingObject(Player2.class));
        } 
    } 
}
