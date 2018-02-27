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
    Actor Tier;
    boolean rewardAdded = true;
    public void act() 
    {
        
      /*  if(Score.score >=15 && rewardAdded ==true){
        
        World Runningworld;
            World Myworld = getWorld();
            Score.score+=5;
            Greenfoot.playSound("ting.wav");
            Myworld.removeObject(Tier);
            rewardAdded = false;// Add your action code here.
    }    */
    getImage().setTransparency(100);
}
}