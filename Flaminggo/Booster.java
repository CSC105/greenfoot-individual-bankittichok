import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Booster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Booster extends Actor
{
    /**
     * Act - do whatever the Booster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage myImage = getImage();
        myImage.scale(125,138);// Add your action code here.

        setLocation(getX(),getY()+2);

        // Add your action code here.
    }
}
