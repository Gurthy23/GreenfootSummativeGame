import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    boolean leverOn = false;
    boolean lever2On = false;
    Platform platformGate = new Platform(15, 130);

    InvisPlatHold invisPlatHold = new InvisPlatHold(75, 20);
    Platform platform12 = new Platform(75, 20);

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
        
        
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900 , 600, 1); 

        Player1 player1 = new Player1(30, 40);
        addObject(player1, 40, 525);

        Player2 player2 = new Player2(30, 40);
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

        LeverPlacehold leverPlacehold = new LeverPlacehold(50, 50);
        addObject(leverPlacehold,838,518);
        leverPlacehold.setLocation(836,558);

        Lever2 lever2 = new Lever2(50, 50);
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

       
    }
    public void act()
    {
        leverOn = LeverPlacehold.leverOn;
        lever2On = Lever2.lever2On;
        if(leverOn)
        {
            removeObject(platformGate);
            addObject(platform12,744,258);
            platform12.setLocation(668,291);
            
        }
        if(lever2On)
        {
            removeObject(invisPlatHold);
            addObject(platform12,744,258);
            platform12.setLocation(668,291);
        }
    }
}
