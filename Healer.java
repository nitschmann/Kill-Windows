import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Healer
 * 
 * @author Florian Kirchner, Florian Nitschmann 
 * @version 1.0
 */
public class Healer  extends BattleArea
{
    
    private GreenfootImage healer;
    private BattleArea area;
    //speed
    private int speed = 20;
    //constructor Healer
    public Healer() {
        healer = getImage();
        healer.scale(15, 15);
    }
    //method move
    private void move() {
        if (atEdge()) {
            remove(this);
        }
        else {
            moveRight(speed);
        }
    }
    //method act
    public void act() {
        move();
    }
       
}
