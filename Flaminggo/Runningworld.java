import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runningworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runningworld extends World
{

    /**
     * Constructor for objects of class Runningworld.
     * 
     */
    public Runningworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(956, 551, 1,false);
       
        Flamin flami = new Flamin();
        
        addObject(flami, 500, 420);
        
       /*Sword[]swo = new Sword[5];
       for(int i = 0;i<swo.length;i++){
      swo[i] = new Sword();
      int SwordX = Greenfoot.getRandomNumber(getWidth());
      int SwordY = Greenfoot.getRandomNumber(getHeight());
      addObject (swo[i], SwordX, SwordY); */
      // Missile[]mis = new Missile[5];
      // for(int i = 0;i<mis.length;i++){
      //mis[i] = new Missile();
      //int MissileX = Greenfoot.getRandomNumber(getWidth());
      //int MissileY = Greenfoot.getRandomNumber(getHeight());
      //addObject (mis[i], MissileX, MissileY);
      RestartButton res = new RestartButton();
      addObject(res, 900, 525);
      
      HomeButton hom = new HomeButton();
      addObject(hom, 800, 525);
    }
    public void act()
{
    if(Greenfoot.getRandomNumber(10000)<10){
        addObject(new Missile(),Greenfoot.getRandomNumber(1024),0);
}
{
    if(Greenfoot.getRandomNumber(5000)<70){
        addObject(new Knife(),Greenfoot.getRandomNumber(1024),0);
}
    if(Greenfoot.getRandomNumber(2500)<10){
        addObject(new Sword(),Greenfoot.getRandomNumber(1024),0);
}
}
}
}