import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Frog(){
        getImage().scale(100, 100);
    }
    public void act()
    {
        checkKeyboard();
        isHit();
    }
    public void isHit()
    {
        if(isTouching(Bee.class))
        {
            removeTouching(Bee.class);
            
            MyWorld w=(MyWorld)getWorld();
            Bee myBee= new Bee();
            w.eatBee();
            w.addObject(myBee,Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        }
    }
    public void checkKeyboard()
    {
             boolean key= Greenfoot.isKeyDown("right");
        if(key ==true)
        {
            setLocation(getX()+2,getY());
        }
        key= Greenfoot.isKeyDown("left");
        if(key ==true)
        {
            setLocation(getX()-2,getY());
        }
        key= Greenfoot.isKeyDown("up");
        if(key ==true)
        {
            setLocation(getX(),getY()-2);
        }
        key= Greenfoot.isKeyDown("down");
        if(key ==true)
        {
            setLocation(getX(),getY()+2);
        }
    }
}
