import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reward here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reward extends Actor
{
    public Reward()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(500,500);
    }

    /**
     * Act - do whatever the Reward wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().setTransparency(120);
        setLocation(getX(),getY());
        // Add your action code here.
    }    
}
