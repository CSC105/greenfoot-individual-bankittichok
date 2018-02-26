import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
            leftImage[i].scale(150,150);
            rightImage[i].scale(150,150);
            leftImage[i].mirrorHorizontally();
        }
        setImage(rightImage[0]);
    }
    private int speed = 4;
    public void act() {
    
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+5,getY());
            img += 1;
            direction = 1;
            //setImage(rightImage);
        }
        if (Greenfoot.isKeyDown("Left"))
        { 
            setLocation(getX()-5,getY());
            img += 1;
            direction = -1;
            //setImage(leftImage);
        }
        
        if(img >= 36)img -= 36;
        if(img < 0)img +=36;
        if(direction == 1){setImage(rightImage[img]);}
        else{setImage(leftImage[img]);}
 
        //if(direction == 1){setImage(myImage[img]);}
        //else{myImage[img].mirrorHorizontally());}
        Death();
    }
    
    public void Death()
    {
        Actor sword= getOneObjectAtOffset(50,50,Sword.class);
        if(sword !=null){
            World myWorld = getWorld();
            GameOver gameover= new GameOver();
            myWorld.addObject(gameover, 400,250);
            myWorld.removeObject(this);
    }
}
}