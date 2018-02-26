import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoundButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundButton extends Actor
{
    //GreenfootSound myMusic = new GreenfootSound("Kinesis Extended.mp3");
    int x=0;
    public SoundButton()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(55,55);
        /**
         * Act - do whatever the SoundButton wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        //myMusic.playLoop();
    }

    public void act() 
    {
        if(x==0){
            if(Greenfoot.mouseClicked(this)){
                x=1;
                StartScreen.myMusic.stop();
                Runningworld.myMusic.stop();
  
            }
        }
        else{
            if(Greenfoot.mouseClicked(this)){
                x=0;
                StartScreen.myMusic.play();
                Runningworld.myMusic.play();
            }
        }
    } 
}