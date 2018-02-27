import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public static int score= 0;
    public Score(){
        setImage(new GreenfootImage("" , 50, Color.BLUE, Color.RED));
    }

    public void act() 
    {
        setImage(new GreenfootImage("Score: "+Score.score , 50, Color.YELLOW, Color.BLACK));
    }    
}