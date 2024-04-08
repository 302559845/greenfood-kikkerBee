import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Label myScoreboard;
    private int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        score = 1;
        prepare();
    }
    public void eatBee()
    {
        myScoreboard.setValue("Score: "+score );
        score++;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,400,400);

        Bee bee2 = new Bee();
        addObject(bee2,400,200);

        Bee bee3 = new Bee();
        addObject(bee3,400,600);

        Bee bee4 = new Bee();
        addObject(bee4,600,400);
        Frog frog = new Frog();
        addObject(frog,189,411);
        
        myScoreboard = new Label("Score :0",40);
        addObject(myScoreboard, 400,100);
    }
}
