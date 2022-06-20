import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    public static int levelCurrent;
    Platform platformGate = new Platform(15, 130);
    LeverPlacehold leverPlacehold = new LeverPlacehold(50, 50);
    InvisPlatHold invisPlatHold = new InvisPlatHold(75, 20);
    Platform platform12 = new Platform(75, 20);
    Lever2 lever2 = new Lever2(50, 50);
    DoorwayP1 doorwayP1 = new DoorwayP1();
    DoorwayP2 doorwayP2 = new DoorwayP2();
    Player1 player1 = new Player1(30, 40);
    Player2 player2 = new Player2(30, 40);
    
    boolean isPlayer1Dead = false;
    boolean isPlayer2Dead = false;
    boolean isPlayer1TouchingDoor = false;
    boolean isPlayer2TouchingDoor = false;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
        
        
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900 , 600, 1); 
        levelCurrent = 2;
        
        addObject(player1, 40, 525);

        
        addObject(player2, 102, 525);

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Platform platform = new Platform(400, 30);
        addObject(platform,183,579);
        platform.setLocation(199,585);

        Platform platform2 = new Platform(100, 400);
        addObject(platform2,803,414);
        platform2.setLocation(583,406);

        Platform platform3 = new Platform(400, 30);
        addObject(platform3,178,336);
        platform3.setLocation(198,403);

        Platform platform4 = new Platform(75, 20);
        addObject(platform4,481,419);
        platform4.setLocation(500,510);

        Platform platform5 = new Platform(75, 20);
        addObject(platform5,456,435);
        platform5.setLocation(416,408);

        Platform platform7 = new Platform(75, 20);
        addObject(platform7,740,379);
        platform7.setLocation(840,425);

        Platform platform8 = new Platform(30, 800);
        addObject(platform8,730,311);
        platform8.setLocation(893,401);

        Platform platform9 = new Platform(75, 20);
        addObject(platform9,737,358);
        platform9.setLocation(669,505);

        Platform platform10 = new Platform(500, 30);
        addObject(platform10,753,471);
        platform10.setLocation(756,590);

        Platform platform11 = new Platform(350, 30);
        addObject(platform11,137,205);
        platform11.setLocation(174,265);

        addObject(platformGate, 353, 325);
        platformGate.setLocation(353, 325);

        addObject(leverPlacehold,838,518);
        leverPlacehold.setLocation(836,558);

        addObject(lever2,272,323);
        lever2.setLocation(310,371);

        DoorPlaceholder doorPlaceholder = new DoorPlaceholder(40, 80);
        addObject(doorPlaceholder,70,338);
        doorPlaceholder.setLocation(36,349);

        DoorPlaceholder doorPlaceholder2 = new DoorPlaceholder(40, 80);
        addObject(doorPlaceholder2,120,334);
        doorPlaceholder2.setLocation(87,349);

        addObject(invisPlatHold,744,258);
        invisPlatHold.setLocation(668,291);

        Platform platform13 = new Platform(75, 20);
        addObject(platform13,487,285);
        platform13.setLocation(497,302);

        platform11.setLocation(176,265);


        DoorwayP1 doorwayP1 = new DoorwayP1();
        addObject(doorwayP1,40,349);
        DoorwayP2 doorwayP2 = new DoorwayP2();
        addObject(doorwayP2,107,350);
    }

    public void act()
    {
        int totalScore = player1.score + player2.score;
        showText("Score:" +totalScore, 50, 25);
        
        if(leverPlacehold.leverOn)
        {
            removeObject(platformGate);
        
            
        }
        if(lever2.lever2On)
        {
            removeObject(invisPlatHold);
            addObject(platform12,744,258);
            platform12.setLocation(668,291);
        }
        
        
        if(isPlayer1Dead && isPlayer2Dead)
        {
            
            Greenfoot.setWorld(new DeathScreen());
            
        }
        
        
        if(isPlayer1TouchingDoor  == true && isPlayer1TouchingDoor == true)
        {
            Greenfoot.setWorld(new Level2());
            Greenfoot.playSound("Excellent.mp3");
        }
    
    }
}
