import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleArea here.
 * 
 * @author Florian Kirchner
 * @version 1.0
 */
public class BattleArea extends Actor
{
    Score score;
    /**
     * Bewegung nach vorn
     */
    public void moveRight(int speed)
    {
        setLocation(getX() + speed, getY());
    }
    
    
    /**
     * Bewegung zurück
     */
    public void moveLeft(int speed)
    {
        setLocation(getX() - speed, getY());
    }
    
    
    /**
     * Bewegung nach Oben
     */
    public void moveUp(int speed)
    {
        setLocation(getX(), getY() - speed);
    }
    
    
    /**
     * Bewegung nach Unten
     */
    public void moveDown(int speed)
    {
        setLocation(getX(), getY() + speed);
    }
    
    
    /**
     * Am Rand der Welt...
     */
    public boolean atEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    /**
     * Zum Entfernen der Objekte
     */
    public void remove(Actor obj)
    {
        getWorld().removeObject(obj);
    }
    
    
    /**
     * Im Fall einer Kollision
     */
    public boolean isCollided(Class cls)
    {
        Actor enemy = getOneIntersectingObject(cls);
        if(enemy == null) {
            return false;
        }
        else {
            return true;
        }
    } 
    
    
}
