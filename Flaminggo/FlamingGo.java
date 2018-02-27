import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlamingGo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlamingGo extends Actor
{
    GreenfootImage[] rightImage = new GreenfootImage[36];
    int j = 1;
    
    public FlamingGo()
    {
        for(int i=0 ; i<36 ; i++){
            rightImage[i] = new GreenfootImage("Flamingo/Flamingo"+(i+1)+".png");
            rightImage[i].scale(175,285);
        }
    }
    /**
     * Act - do whatever the FlamingGo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(j == 36) j = 0;
        j++;
        setImage(rightImage[j-1]);
        
        sing();
    } 
    public void animation()
    {
      int health =1;
    }
    
    public void sing() 
    {
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.playSound("bird.mp3");
    }
}
}
