import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code for level
 */
public class RealLevel1 extends GameLevel
{
    boolean leverOn = false;
    Gate gate1 = new Gate(10,150);
    Player1 player1 = new Player1(30, 40);
    Player2 player2 = new Player2(30, 40);
    LeverPlacehold lever1 = new LeverPlacehold(30,30);
    Spikes spikes1 = new Spikes(30,30);
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

        Platform platform4 = new Platform(300, 30);
        addObject(platform4, 24,24);
        platform4.setLocation(400,400);

        addObject(gate1,600,30);
        gate1.setLocation(545,495);

        Platform platform5 = new Platform(100, 100);
        addObject(platform5,183,579);
        platform5.setLocation(850,565);
        
        Platform platform6 = new Platform(100, 30);
        addObject(platform6, 13,8);
        platform6.setLocation(675, 400);
        
        Pillar pillar1 = new Pillar(20, 100);
        addObject(pillar1,6,6);
        pillar1.setLocation(540,340);
        
        Button button1 = new Button(30,30);
        addObject(button1,121,121);
        button1.setLocation(675, 370);
        
        Pillar pillar2 = new Pillar(100, 200);
        addObject(pillar2,4,1);
        pillar2.setLocation(50,525);
        
        addObject(spikes1,1,1);
        spikes1.setLocation(275,370);

    }
  
    public void act()
    {
        if(lever1.leverOn)
        {
            removeObject(gate1);
        
            
        }
    }
}
