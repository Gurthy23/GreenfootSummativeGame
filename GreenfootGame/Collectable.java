
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Collectable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collectable extends Actor
{
    GreenfootImage image1 = new GreenfootImage("Coin/sprite_collectable0.png");
    GreenfootImage image2 = new GreenfootImage("Coin/sprite_collectable1.png");

    GreenfootImage image3 = new GreenfootImage("Coin/sprite_collectable2.png");
    GreenfootImage image4 = new GreenfootImage("Coin/sprite_collectable3.png");

    
    int frameCounter = 0;
    /**
     * Act - do whatever the Collectable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
