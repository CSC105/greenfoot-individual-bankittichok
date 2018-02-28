import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Actor
{
    /**
     * Act - do whatever the Knife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        GreenfootImage myImage = getImage();
        myImage.scale(100,95);// Add your action code here.

        setLocation(getX(),getY()+6);

        //gain();
    }    

    public void gain()
    {
        /*Actor Mushroom;
        Mushroom = getOneObjectAtOffset(0, 0, Mushroom.class);
        if(Mushroom !=null){    
        World Runningworld;
        World Myworld = getWorld();
        Myworld.removeObject(this);
        }    
        }*/

    }
}
