import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Flamin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamin extends Actor
{
    //public GreenfootImage rightImage;
    //public GreenfootImage leftImage;
    private int img;
    private int direction;
    GreenfootImage[] rightImage = new GreenfootImage[36];
    GreenfootImage[] leftImage = new GreenfootImage[36];

    public Flamin()   
    {

        GreenfootImage myImage = getImage();
        //myImage.scale(200 ,150);
        /*
        GreenfootImage myImage = getImage();
        myImage.scale(200 ,150);
        rightImage = getImage();
        leftImage = new GreenfootImage(rightImage);
        leftImage.mirrorHorizontally();
         */
        for(int i=0 ; i<36 ; i++){
            rightImage[i] = new GreenfootImage("Flamingo/Flamingo"+(i+1)+".png");
            leftImage[i] = new GreenfootImage("Flamingo/Flamingo"+(i+1)+".png");
            leftImage[i].scale(100,163);
            rightImage[i].scale(100,163);
            leftImage[i].mirrorHorizontally();
        }
        setImage(rightImage[0]);
    }

    public void act() {

        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+8,getY());
            img += 1;
            direction = 1;
            //setImage(rightImage);
        }
        if (Greenfoot.isKeyDown("Left"))
        { 
            setLocation(getX()-8,getY());
            img += 1;
            direction = -1;
            //setImage(leftImage);
        }

        if(img >= 36)img -= 36;
        if(img < 0)img +=36;
        if(direction == 1){setImage(rightImage[img]);}
        else{setImage(leftImage[img]);}
        checkWalk();
        //if(direction == 1){setImage(myImage[img]);}
        
        //else{myImage[img].mirrorHorizontally());}
        gain();
        death();
    }

    public void death()
    {
        Actor Slime= getOneObjectAtOffset(0,25,Slime.class);
        if(Slime !=null){
            World myWorld = getWorld();
            GameOver gameover= new GameOver();
            myWorld.addObject(gameover, 400,250);
            Greenfoot.playSound("gameover.wav");
            myWorld.removeObject(this);
            
            //Greenfoot.stop();
            StartScreen.myMusic.stop();
            Runningworld.myMusic.stop();
        }
    }

    public void gain()
    {
        Actor Mushroom;
        Mushroom = getOneObjectAtOffset(0, 0, Mushroom.class);
        if(Mushroom !=null){
            World Runningworld;
            World Myworld = getWorld();
            Score.score+=1;
            Greenfoot.playSound("correct.wav");
            Myworld.removeObject(Mushroom);
        }
        Actor Pinkbean;
        Pinkbean = getOneObjectAtOffset(0, 0, Pinkbean.class);
        if(Pinkbean !=null){
            World Runningworld;
            World Myworld = getWorld();
            Score.score+=5;
            Greenfoot.playSound("ting.wav");
            Myworld.removeObject(Pinkbean);
        }
        Actor Booster;
        Booster = getOneObjectAtOffset(0, 0, Booster.class);
        if(Booster !=null){
            World Runningworld;
            World Myworld = getWorld();
            Greenfoot.playSound("cir.wav");
            if(Greenfoot.isKeyDown("Left")){
                setLocation(getX()-100,getY());
            }
            if(Greenfoot.isKeyDown("Right")){
                setLocation(getX()+100,getY());
            } 
            Myworld.removeObject(Booster);
            
            Score.score--;
        }
        
    }

    public boolean atLeftWorldEdge() {
        // check for right edge

        // check for left edge
        if(getX() < getImage().getWidth()) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean atRightEdge(){
        if(getX() > getWorld().getWidth()-getImage().getWidth()) {
            return true;
        }
        else{
            return false;
        }
    }

    public void checkWalk(){
        if(atLeftWorldEdge()==true){
            setLocation(getX()+4,getY());
        }
        if(atRightEdge()==true){
            setLocation(getX()-4,getY());
        }
    }
}

    