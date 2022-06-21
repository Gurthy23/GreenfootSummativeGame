    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends GameLevel
{
    //Instantiating objects and variables 
    
    
    Gate gate = new Gate(20, 100);
    Gate gategate = new Gate(20, 100);
    LeverPlacehold leverPlacehold = new LeverPlacehold(30, 30);
    Lever2 lever2 = new Lever2(30, 30);
    
    public static int levelCurrent;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900 , 600, 1); 
        //sets current level to three
        levelCurrent = 3;
        //Adds player objects
        addObject(player1, 40, 525);

        addObject(player2, 102, 525);

        prepare();
    }

    
    //loads the level
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(leverPlacehold,784,216);
        addObject(lever2,50,154);

        addObject(gate,107,348);
        gate.setLocation(197,350);

        addObject(gategate,807,91);
        gategate.setLocation(807,78);

        Portal1 portal1 = new Portal1();
        addObject(portal1,429,360);

        Portal2 portal2 = new Portal2();
        addObject(portal2,556,33);

        Platform platform = new Platform(200, 40);
        addObject(platform,105,570);
        platform.setLocation(100,571);

        Pillar pillar = new Pillar(50, 600);
        addObject(pillar,463,319);
        pillar.setLocation(471,299);

        Platform platform2 = new Platform(200, 40);
        addObject(platform2,360,452);
        platform2.setLocation(349,471);

        Platform platform3 = new Platform(200, 40);
        addObject(platform3,128,420);
        platform3.setLocation(107,418);

        Platform platform4 = new Platform(200, 40);
        addObject(platform4,573,579);
        platform4.setLocation(595,581);

        Pillar pillar2 = new Pillar(50, 300);
        addObject(pillar2,705,150);
        pillar2.setLocation(705,150);

        Platform platform5 = new Platform(200, 40);
        addObject(platform5,800,474);
        platform5.setLocation(801,455);

        Platform platform6 = new Platform(250, 40);
        addObject(platform6,311,299);
        platform6.setLocation(322,301);

        Platform platform7 = new Platform(100, 20);
        addObject(platform7,840,349);
        platform7.setLocation(853,339);

        Platform platform8 = new Platform(100, 20);
        addObject(platform8,529,144);
        platform8.setLocation(546,152);

        Platform platform9 = new Platform(125, 23);
        addObject(platform9,646,245);
        platform9.setLocation(617,245);

        Platform platform10 = new Platform(100, 20);
        addObject(platform10,771,232);
        platform10.setLocation(779,241);

        Platform platform11 = new Platform(100, 20);
        addObject(platform11,864,134);
        platform11.setLocation(849,137);

        DoorwayP2 doorwayP2 = new DoorwayP2();
        addObject(doorwayP2,865,87);
        doorwayP2.setLocation(868,95);

        Platform platform12 = new Platform(250, 45);
        addObject(platform12,133,206);
        platform12.setLocation(126,192);

        Lethal lethal = new Lethal(80, 10);
        addObject(lethal,395,264);
        lethal.setLocation(408,277);

        Lethal lethal2 = new Lethal(30, 10);
        addObject(lethal2,260,269);
        lethal2.setLocation(278,276);

        Platform platform13 = new Platform(200, 35);
        addObject(platform13,355,112);
        platform13.setLocation(346,101);

        DoorwayP1 doorwayP1 = new DoorwayP1();
        addObject(doorwayP1,414,52);
        Lethal lethal3 = new Lethal(900, 20);
        addObject(lethal3,427,586);
        lethal3.setLocation(447,594);

        FastSpikes fastSpikes = new FastSpikes();
        addObject(fastSpikes,430,434);

        FastSpikes fastSpikes2 = new FastSpikes();
        addObject(fastSpikes2,397,434);

        FastSpikes fastSpikes3 = new FastSpikes();
        addObject(fastSpikes3,571,217);

        Spikes spikes = new Spikes();
        addObject(spikes,821,312);

        FastSpikes fastspikes4 = new FastSpikes();
        addObject(fastspikes4,854,312);

        FastSpikes fastSpikes4 = new FastSpikes();
        addObject(fastSpikes4,887,312);

        Spikes spikes2 = new Spikes();
        addObject(spikes2,512,545);

        Spikes spikes3 = new Spikes();
        addObject(spikes3,544,545);

        Spikes spikes4 = new Spikes();
        addObject(spikes4,576,545);

        Spikes spikes5 = new Spikes();
        addObject(spikes5,679,545);

        Spikes spikes6 = new Spikes();
        addObject(spikes6,609,545);

        Spikes spikes7 = new Spikes();
        addObject(spikes7,643,545);

        FastSpikes fastSpikes6 = new FastSpikes();
        addObject(fastSpikes6,24,382);

        FastSpikes fastSpikes7 = new FastSpikes();
        addObject(fastSpikes7,58,382);

        FastSpikes fastSpikes8 = new FastSpikes();
        addObject(fastSpikes8,91,382);

        Spikes spikes8 = new Spikes();
        addObject(spikes8,124,382);

        Spikes spikes9 = new Spikes();
        addObject(spikes9,161,382);

        Lethal lethal4 = new Lethal(30, 10);
        addObject(lethal4,19,165);

        Lethal lethal5 = new Lethal(30, 10);
        addObject(lethal5,113,166);

        Spikes spikes10 = new Spikes();
        addObject(spikes10,80,153);
        
        Collectable collectable = new Collectable();
        addObject(collectable,318,414);
        
        Collectable collectable2 = new Collectable();
        addObject(collectable2,880,405);
        
        FastSpikes fastSpikes9 = new FastSpikes();
        addObject(fastSpikes9,884,419);
        
        FastSpikes fastSpikes10 = new FastSpikes();
        addObject(fastSpikes10,850,418);
        
        Collectable collectable3 = new Collectable();
        addObject(collectable3,883,281);
        
        Collectable collectable4 = new Collectable();
        addObject(collectable4,746,209);
        
        Collectable collectable5 = new Collectable();
        addObject(collectable5,511,118);
        
        Collectable collectable6 = new Collectable();
        addObject(collectable6,110,100);
        
        Collectable collectable7 = new Collectable();
        addObject(collectable7,426,179);
        
        Collectable collectable8 = new Collectable();
        addObject(collectable8,25,331);
        
        Collectable collectable9 = new Collectable();
        addObject(collectable9,677,527);
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
            removeObject(gate);
        }
        
        //Checks if lever is on and removes gate 2
        if(lever2.lever2On)
        {
            removeObject(gategate);
        }

        //If players are dead sets death screen
        if(isPlayer1Dead || isPlayer2Dead)
        {

            Greenfoot.setWorld(new DeathScreen());

        }

        //If players make it to door then sets win screen and plays excellent sound
        if(isPlayer1TouchingDoor  == true && isPlayer1TouchingDoor == true)
        {
            Greenfoot.setWorld(new Level2());
            Greenfoot.playSound("Excellent.mp3");
        }

    }
}
