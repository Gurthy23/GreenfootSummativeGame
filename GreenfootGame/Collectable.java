
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for the coin collectable 
 */
public class Collectable extends Actor
{
    //Instantiates the images for the coin animation
    GreenfootImage image1 = new GreenfootImage("Coin/sprite_collectable0.png");
    GreenfootImage image2 = new GreenfootImage("Coin/sprite_collectable1.png");

    GreenfootImage image3 = new GreenfootImage("Coin/sprite_collectable2.png");
    GreenfootImage image4 = new GreenfootImage("Coin/sprite_collectable3.png");

    //Sets frame counter to 0
    int frameCounter = 0;
    /**
     * Code for animation
     */
    public void act() 
    {
        frameCounter++;


        if (frameCounter == 0)
        {
            setImage(image1);
        }
        if (frameCounter == 5)
        {
            setImage(image2);
        }
        if (frameCounter == 10)
        {
            setImage(image1);
        }
        if (frameCounter == 15)
        {
            setImage(image3);
        }
        if (frameCounter == 20)
        {
            frameCounter = 0;
        }
   }    

}
