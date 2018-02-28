import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Totorialtwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorialtwo extends Actor
{

    public Tutorialtwo()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(800,400);
    }

    /**
     * Act - do whatever the Totorialtwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        /*if (Greenfoot.mouseClicked("this"));
        {
        Greenfoot.setWorld(new StartScreen());
        }*/

        if (Greenfoot.isKeyDown("space")){
            Greenfoot.playSound("blip.wav");
            getWorld().removeObject(this);
        }
    }
}
