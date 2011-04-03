import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author Florian Kirchner
 * @version 1.0
 */
public class Hero  extends BattleArea
{
    /**
     * Allgemeines
     */
    public int speed = 10;
    private int shootCount = 0;
    
    
    /**
     * Act
     */
    public void act() 
    {
        checkKeys();
        checkCollisions();
    }
    
    
    /**
     * Tasteneingabe überprüfen
     */
    private void checkKeys() {
        if(Greenfoot.isKeyDown("right")) {
            moveRight(speed);
        }
        
        if(Greenfoot.isKeyDown("left")) {
            moveLeft(speed);
        }
        
        if(Greenfoot.isKeyDown("up")) {
            moveUp(speed);
        }
        
        if(Greenfoot.isKeyDown("down")) {
            moveDown(speed);
        }
        
        if(Greenfoot.isKeyDown("space")) {
            shoot();
        }
        shootCount += 1; 
    }
    
    
    /**
     * Heilen
     */
    private void shoot() {
        if (shootCount > 9) {
            getWorld().addObject(new Healer(), getX() + getImage().getWidth() / 2, getY());
            shootCount = 0;
        }
    }
    
    
    /**
     * Kollision überprüfen
     */
    private void checkCollisions()
    {
        if(isCollided(Virus.class)) {
            remove(this);
            Greenfoot.stop();
        }
    }
}
