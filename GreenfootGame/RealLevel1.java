import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for level
 */
public class RealLevel1 extends GameLevel
{
    boolean leverOn = false;
    
    Gate gate1 = new Gate(10,150);
    
    LeverPlacehold lever1 = new LeverPlacehold(30,30);
    Button button1 = new Button(30,30);
    InvisPlatHold invisPlat1 = new InvisPlatHold(100,25);
    Platform platform7 = new Platform(100,25);
    /**
     * Constructor for objects of class RealLevel1.
     * 
     */
    public RealLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        
        addObject(player1, 400, 550);
        
        
        addObject(player2, 500, 550);
    
        prepare();
        
    }
    
    private void prepare()
    {
        Lethal lethal1 = new Lethal(900,25);
        addObject(lethal1,20,20);
        lethal1.setLocation(450,600);

        Platform platform1 = new Platform(200, 30);
        addObject(platform1,183,579);
        platform1.setLocation(450,585);

        Platform platform2 = new Platform(150, 70);
        addObject(platform2,183,579);
        platform2.setLocation(170,565);

        Platform platform3 = new Platform(100, 30);
        addObject(platform3,183,579);
        platform3.setLocation(675,585);

        addObject(lever1,100,100);
        lever1.setLocation(150,515);

        Platform platform4 = new Platform(200, 30);
        addObject(platform4, 24,24);
        platform4.setLocation(450,400);

        addObject(gate1,600,30);
        gate1.setLocation(545,495);

        Platform platform5 = new Platform(100, 100);
        addObject(platform5,183,579);
        platform5.setLocation(850,565);

        Platform platform6 = new Platform(100, 30);
        addObject(platform6, 13,8);
        platform6.setLocation(675, 400);

        Pillar pillar1 = new Pillar(60, 120);
        addObject(pillar1,6,6);
        pillar1.setLocation(520,340);

        addObject(button1,121,121);
        button1.setLocation(675, 370);

        Pillar pillar2 = new Pillar(100, 200);
        addObject(pillar2,4,1);
        pillar2.setLocation(50,525);

        addObject(invisPlat1,1,1);
        invisPlat1.setLocation(300,400);

        Platform platform8 = new Platform(400,50);
        addObject(platform8,222,222);
        platform8.setLocation(200,200);

        DoorwayP1 door1 = new DoorwayP1();
        addObject(door1,50,222);
        door1.setLocation(50,140);

        DoorwayP2 door2 = new DoorwayP2();
        addObject(door2,50,50);
        door2.setLocation(125,140);

        Spikes spikes1 = new Spikes(30,30);
        addObject(spikes1,33,33);
        spikes1.setLocation(300,160);

        Pillar pillar3 = new Pillar(30,180);
        addObject(pillar3,84,313);
        pillar3.setLocation(450,500);

        Collectable collectable = new Collectable();
        addObject(collectable,44,281);
        Collectable collectable2 = new Collectable();
        addObject(collectable2,587,393);
        
        Collectable collectable3 = new Collectable();
        addObject(collectable3,299,154);
        Collectable collectable4 = new Collectable();
        addObject(collectable4,853,397);
    }
  
    public void act()
    {
        
        //Checks player score
        int totalScore = player1.score + player2.score;
        //Displays score
        showText("Score:" +totalScore, 50, 25);
        
        //if player is on lever, gate dissapears.
        if(lever1.leverOn)
        {
            removeObject(gate1);
        
            
        }
        //if player is on button, platform appears. If button is off platform dissapears again
        if(button1.buttonOn)
        {
            removeObject(invisPlat1);
            addObject(platform7,99,99);
            platform7.setLocation(300,400);
        }
        else
        {
            removeObject(platform7);
            addObject(invisPlat1,1,1);
            invisPlat1.setLocation(300,400);
        }
        //If players are dead sets death screen
        if(isPlayer1Dead || isPlayer2Dead)
        {
            
            Greenfoot.setWorld(new DeathScreen(1));
            
        }
        
        //If players make it to door then sets next level and plays excellent sound
        if(isPlayer1TouchingDoor  == true && isPlayer1TouchingDoor == true)
        {
            Greenfoot.setWorld(new Level2());
            Greenfoot.playSound("Excellent.mp3");
        }
        //Reset button
        if(Greenfoot.isKeyDown("r"))
        {
            Greenfoot.setWorld(new DeathScreen(1));
        }
    }
}
