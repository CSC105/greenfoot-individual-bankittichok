import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tier0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tier0 extends Actor
{
    /**
     * Act - do whatever the Tier0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tier0()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(500,500);
    }
    
    public void act() 
    {
        if(Score.score >=5){
            World Runningworld;
            World Myworld = getWorld();
            Myworld.removeObject(this);
        }

        getImage().setTransparency(120);
    }    
}
