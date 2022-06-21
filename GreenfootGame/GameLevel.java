import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLevel extends World
{
    DoorwayP1 doorwayP1 = new DoorwayP1();
    DoorwayP2 doorwayP2 = new DoorwayP2();
    Player1 player1 = new Player1(30, 40);
    Player2 player2 = new Player2(30, 40);
    
    boolean isPlayer1Dead = false;
    boolean isPlayer2Dead = false;
    boolean isPlayer1TouchingDoor = false;
    boolean isPlayer2TouchingDoor = false;
    
    /**
     * Constructor for objects of class GameLevel.
     * 
     */
    public GameLevel(int width, int height, int cellSize)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, cellSize); 
    }
    
}
