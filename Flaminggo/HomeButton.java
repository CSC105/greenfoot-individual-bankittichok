import greenfoot.*;
/**
 * Write a description of class HomeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeButton  extends Actor
{
     public HomeButton(){
    GreenfootImage myImage = getImage();
        myImage.scale(50,50);
}
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new StartScreen());
    }    
}
}
