import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Virus
 * 
 * @author Florian Nitschmann
 * @version 1.0
 */
public class Virus  extends BattleArea
{
    
    GreenfootImage virus;
    //initialize variables for speed and counter (Score.class)
    int speed;
    Score counter;
    //constructor Virus
    public Virus(Score score) {
        counter = score;
        virus = getImage();
        virus.mirrorHorizontally();
        int level = counter.level;
        speed = level+2;
    }
    //method move (checks where virus is and starts actions)
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
    //method act    
    public void act() 
    {
        move();
    }    
}
