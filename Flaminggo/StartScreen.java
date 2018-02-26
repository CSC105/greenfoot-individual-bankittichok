import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(956, 551, 1);
       
        FlamingGo flam = new FlamingGo();
        
        addObject(flam, 200, 200);
        
         
        Start st = new Start();
        
        addObject(st, 650, 250);
        
         Maple ma = new Maple();
        
        addObject(ma, 800, 75);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Runningworld());
        }
}
}