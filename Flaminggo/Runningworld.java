import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runningworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runningworld extends World
{
    public static GreenfootSound myMusic = new GreenfootSound("mpthemetot.wav");

    /**
     * Constructor for objects of class Runningworld.
     * 
     */
    public Runningworld()
    {    
        //myWorld =
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(956, 551, 1,false);
        count = 0;

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
        myMusic.playLoop();

        setPaintOrder(Flamin.class);
        
    }
    boolean rewardAdded = false;
    private int count;
    public void act(){
        myMusic.setVolume(100);
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
         if(Greenfoot.getRandomNumber(7000)<10){
            addObject(new Toad(),Greenfoot.getRandomNumber(956),0);
        }
        
        if(Score.score  >= -10 && Score.score <=0 && rewardAdded ==false){

            Tier0 ti = new Tier0();

            addObject(ti, 473,250);

            rewardAdded = true;
            
            Greenfoot.playSound("reward.wav");
        }

        if(Score.score >= 10 && Score.score <=30 && rewardAdded ==true){

            Tier tie = new Tier();

            addObject(tie, 473,250);

            rewardAdded = false;
            
            Greenfoot.playSound("reward.wav");
        }

        if(Score.score >= 40 && Score.score <=70 && rewardAdded ==false){

            Tier2 tierr = new Tier2();

            addObject(tierr, 473,250);

            rewardAdded = true;
            
            Greenfoot.playSound("reward.wav");
        }

        if(Score.score >= 100 && Score.score <=130 && rewardAdded ==true){

            Tier3 tierrr = new Tier3();

            addObject(tierrr, 473,250);

            rewardAdded = false;

        }

        if(Score.score >= 160 && Score.score <=200 && rewardAdded ==false){

            Tier4 tierz = new Tier4();

            addObject(tierz, 473,250);

            rewardAdded = true;
            
            Greenfoot.playSound("reward.wav");
            
        }

        if(Score.score >= 250 && Score.score <=300 && rewardAdded ==true){

            Tier5 tiezz = new Tier5();

            addObject(tiezz, 473,250);

            rewardAdded = false;
            
            Greenfoot.playSound("reward.wav");
            
           
        }

        if(Score.score >= 400 && Score.score <=550 && rewardAdded ==false){

            Tier6 tierz = new Tier6();

            addObject(tierz, 473,250);

            rewardAdded = true;
            
            Greenfoot.playSound("reward.wav");
            
        }

        if(Score.score >= 700 && rewardAdded == true ){
            Reward rev = new Reward();

            addObject(rev, 473,250);

            rewardAdded = false;
            
            Greenfoot.playSound("reward.wav");
        
        }
        
    }
}
