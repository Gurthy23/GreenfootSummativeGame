import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for the level 2 world
 */
public class Level2 extends GameLevel
{
    //Instantiating objects and variables 
    boolean leverOn = false;
    boolean lever2On = false;
    Gate Gategate = new Gate(15, 130);


    public static int levelCurrent;
    
    LeverPlacehold leverPlacehold = new LeverPlacehold(50, 50);

    InvisPlatHold invisPlatHold = new InvisPlatHold(75, 20);
    Platform platform12 = new Platform(75, 20);
    Lever2 lever2 = new Lever2(50, 50);
    
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
        
        
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900 , 600, 1); 
        levelCurrent = 2;
        //Adds player objects
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
        //Added platforms to world
        Platform platform = new Platform(400, 30);
        addObject(platform,183,579);
        platform.setLocation(199,585);

        

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

        Pillar pillar2 = new Pillar(30, 800);
        addObject(pillar2,730,311);
        pillar2.setLocation(893,401);

        Platform platform9 = new Platform(75, 20);
        addObject(platform9,737,358);
        platform9.setLocation(669,505);

        Platform platform10 = new Platform(500, 30);
        addObject(platform10,753,471);
        platform10.setLocation(756,590);

        Platform platform11 = new Platform(350, 30);
        addObject(platform11,137,205);
        platform11.setLocation(174,265);



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


        
        addObject(Gategate,353,325);

        Pillar pillar = new Pillar(110, 400);
        addObject(pillar,583,405);
        


        DoorwayP1 doorwayP1 = new DoorwayP1();
        addObject(doorwayP1,40,349);
        DoorwayP2 doorwayP2 = new DoorwayP2();
        addObject(doorwayP2,107,350);

    }

    public void act()
    {
        //Checks player scroe
        int totalScore = player1.score + player2.score;
        //Displays score
        showText("Score:" +totalScore, 50, 25);
        
        //Checks if lever is on and removes gate if it is
        if(leverPlacehold.leverOn)
        {
            removeObject(Gategate);
        
            
        }
        //Checks if lever is on and places platform
        if(lever2.lever2On)
        {
            removeObject(invisPlatHold);
            addObject(platform12,744,258);
            platform12.setLocation(668,291);
        }
        
        //If players are dead sets death screen
        if(isPlayer1Dead && isPlayer2Dead)
        {
            
            Greenfoot.setWorld(new DeathScreen());
            
        }
        
        //If players make it to door then sets next level and plays excellent sound
        if(isPlayer1TouchingDoor  == true && isPlayer1TouchingDoor == true)
        {
            Greenfoot.setWorld(new Level2());
            Greenfoot.playSound("Excellent.mp3");
        }
    
    }
}
