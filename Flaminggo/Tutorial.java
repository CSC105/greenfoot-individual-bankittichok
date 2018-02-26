import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Actor
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tutorial()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(250,178);
    }
    
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
        World myWorld = getWorld();
        Tutorialtwo two = new Tutorialtwo();
        myWorld.addObject(two, 500,300);
    }  // Add your action code here.
    
    
    }    
}
