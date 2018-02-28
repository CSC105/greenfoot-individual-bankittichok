import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tier extends Actor
{
    /**
     * Act - do whatever the Tier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Actor Tier;
    //boolean rewardAdded = true;
    public Tier()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(500,500);
    }

    public void act() 
    {
        if(Score.score >=35){
            World Runningworld;
            World Myworld = getWorld();
            Myworld.removeObject(this);
        }
        getImage().setTransparency(120);
    }
}