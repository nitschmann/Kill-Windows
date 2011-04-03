import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Healer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Healer  extends BattleArea
{
    /**
     * Allgemeines
     */
    private GreenfootImage healer;
    private BattleArea area;
    private int speed = 20;
    
    
    /**
     * Heiler Klasse
     */
    public Healer () {
        healer = getImage();
        healer.scale(15, 15);
    }
    
    
    /**
     * Bewegung
     */
    private void move() {
        if (atEdge()) {
            remove(this);
        }
        else {
            moveRight(speed);
        }
    }
    
    
    /**
     * Act
     */
    public void act() {
        move();
    }
       
}
