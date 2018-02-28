import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tier5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tier5 extends Actor
{
    /**
     * Act - do whatever the Tier5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tier5()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(500,500);
    }

    public void act() 
    {
        if(Score.score >=395){
            World Runningworld;
            World Myworld = getWorld();
            Myworld.removeObject(this);
        }

        getImage().setTransparency(120);  
    }
}
