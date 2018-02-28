import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toad extends Actor
{
    /**
     * Act - do whatever the Toad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         GreenfootImage myImage = getImage();
        myImage.scale(200,143);// Add your action code here.

        setLocation(getX(),getY()+1);// Add your action code here.
    }    
}
