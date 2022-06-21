import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Kills player if touched
 */
public class Lethal extends Actor
{
    //Allows other classes to access variables
    GameLevel level;
    protected void addedToWorld(World world)
    {
        level = (GameLevel) world;
    }
    //Code for image width/height
    public Lethal(int width, int height)
    {
        getImage().scale(width, height);
    }
    //Code to start player collision
    public void act() 
    {
        collideWithPlayer1();
        collideWithPlayer2();
        
    }   
    public void collideWithPlayer1()
    {
       //Removes the player1 if touched and plays death sound 
       if(getOneIntersectingObject(Player1.class) != null)
       {
            Greenfoot.playSound("DeathSound.mp3");
            getWorld().removeObject(getOneIntersectingObject(Player1.class));
            level.isPlayer1Dead = true;
       } 
    
    }
    public void collideWithPlayer2()
    {
        //Removes the player2 if touched and plays death sound 
        if(getOneIntersectingObject(Player2.class) != null)
        {
            Greenfoot.playSound("DeathSound.mp3");
            getWorld().removeObject(getOneIntersectingObject(Player2.class));
            level.isPlayer2Dead = true;
        } 
    }
    
}
