import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runningworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runningworld extends World
{
    public static GreenfootSound myMusic = new GreenfootSound("Kinesis Extended.mp3");

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
        //GreenfootSound myMusic = new GreenfootSound("Kinesis Extended.mp3");
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

        SoundButton sou = new SoundButton();
        addObject(sou, 700,525);

        Score sco = new Score();
        addObject(sco, 100,525);
        Score.score = 0;
        
        
        myMusic.play();
        myMusic.setVolume(0);
        
}
    public void act(){
        myMusic.setVolume(40);
        if(Greenfoot.getRandomNumber(5000)<10){
            addObject(new Pinkbean(),Greenfoot.getRandomNumber(956),0);
        }

        if(Greenfoot.getRandomNumber(500)<10){
            addObject(new Mushroom(),Greenfoot.getRandomNumber(956),0);
        }
        if(Greenfoot.getRandomNumber(2000)<10){
            addObject(new Slime(),Greenfoot.getRandomNumber(956),0);
        }
        if(Greenfoot.getRandomNumber(4000)<10){
            addObject(new Booster(),Greenfoot.getRandomNumber(956),0);
        }
        if(Score.score == 1000000){
            Reward rev = new Reward();
            
            addObject(rev, 473,250);
            
        }
   }
}