import greenfoot.*;
/**
 * Write a description of class MoveWithArrows here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveWithArrows  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MoveWithArrows
     */
    Actor myActor = null;
    public MoveWithArrows(Actor a)
    {
        myActor = a;
    }
    
    public void MoveActorWithArrow (int speed)
    {
        if (Greenfoot.isKeyDown("right"))
        {
            myActor.setRotation(0);
            myActor.move(speed);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            myActor.setRotation(90);
            myActor.move(speed);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            myActor.setRotation(0);
            myActor.move(speed);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            myActor.setRotation(270);
            myActor.move(speed);
        }
}
}