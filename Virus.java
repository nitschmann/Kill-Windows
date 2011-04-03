import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author Florian Nitschmann
 * @version 1
 */
public class Virus  extends BattleArea
{
    /**
     * Allgemeines
     */
    GreenfootImage virus;
    int speed;
    Score counter;

    /**
     * Der Score
     */
    public Virus(Score score) {
        counter = score;
        virus = getImage();
        virus.mirrorHorizontally();
        int level = counter.level;
        speed = level+2;
    }
    
    
    /**
     * Bewegung
     */
    private void move () {
        if (atEdge()) {
        remove(this);
        counter.update(-1);
        }
        else if (isCollided(Healer.class)) {
            counter.update(1);
            Actor Healer = getOneIntersectingObject(Healer.class);
            remove(Healer);
            remove(this);
        }
        else {
            moveLeft(speed);
        }
    }
    
    
    public void act() 
    {
        move();
    }    
}
