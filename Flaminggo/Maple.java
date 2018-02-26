import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maple extends Actor
{
       public Maple()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(142, 142);
    }
    /**
     * Act - do whatever the Maple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
