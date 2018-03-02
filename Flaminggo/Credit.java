import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends Actor
{
    /**
     * Act - do whatever the credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Credit(){
         GreenfootImage myImage = getImage();
         //myImage.scale(200,63);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("woodcrack.wav");
            World myWorld = getWorld();
            Crepage cre = new Crepage();
            myWorld.addObject(cre, 500,300);
        }  // Add your action code here.
    }    
}
