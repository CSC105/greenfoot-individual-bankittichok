import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(150,179);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("woodcrack.wav");
            World myWorld = getWorld();
            Enemyboard enb = new Enemyboard();
            myWorld.addObject(enb, 500,300);// Add your action code here.
    }    
}
}