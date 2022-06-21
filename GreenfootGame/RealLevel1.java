import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RealLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RealLevel1 extends World
{
    boolean leverOn = false;
    boolean lever2On = false;
    boolean isPlayer1Dead = false;
    boolean isPlayer2Dead = false;
    boolean isPlayer1TouchingDoor = false;
    boolean isPlayer2TouchingDoor = false;
    
    public static int levelCurrent;
    
    Player1 player1 = new Player1(30, 40);
    Player2 player2 = new Player2(30, 40);
    Gate gate1 = new Gate(10, 100);
    LeverPlacehold lever1 = new LeverPlacehold(30,30);
    
    /**
     * Constructor for objects of class RealLevel1.
     * 
     */
    public RealLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        
        addObject(player1, 420, 550);
        addObject(player2, 470, 550);

        prepare();
        
    }
    private void prepare()
    {
        /*Lethal lethal1 = new Lethal(900,10);
        addObject(lethal1,20,20);
        lethal1.setLocation(450,585);*/
        
        Platform platform1 = new Platform(200, 30);
        addObject(platform1,183,579);
        platform1.setLocation(450,585);
        
        Platform platform2 = new Platform(200, 100);
        addObject(platform2,183,579);
        platform2.setLocation(100,570);
        
        Platform platform3 = new Platform(100, 30);
        addObject(platform3,183,579);
        platform3.setLocation(700,585);
        
        Lever2 lever1 = new Lever2(30,30);
        addObject(lever1,100,100);
        lever1.setLocation(50,505);
        
        Platform platform4 = new Platform(100, 100);
        addObject(platform4, 69,420);
        platform4.setLocation(850, 550);
        
        Gate gate1 = new Gate(10, 100);
        addObject(gate1,13,8);
        gate1.setLocation(545, 520);
        
        Platform platform5 = new Platform(200, 30);
        addObject(platform5, 6,6);
        platform5.setLocation(450, 475);
        
        
        
        
    }    
    public void act()
    {
        int totalScore = player1.score + player2.score;
        showText("Score:" +totalScore, 50, 25);
        if(lever1.leverOn)
        {
            removeObject(gate1);
        }
    }
    
}
