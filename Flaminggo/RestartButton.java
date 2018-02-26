import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartBotton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartButton extends Actor
{
    public RestartButton(){
    GreenfootImage myImage = getImage();
        myImage.scale(50,50);
}
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new Runningworld());
        // Add your action code here.
    }    
}
}
