import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enmyboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemyboard extends Actor
{
    /**
     * Act - do whatever the Enmyboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage myImage = getImage();
        myImage.scale(800,400);
        
        if (Greenfoot.isKeyDown("space")){
            Greenfoot.playSound("blip.wav");
            getWorld().removeObject(this);
        }// Add your action code here.
    }    
}
