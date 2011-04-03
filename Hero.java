import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hero
 * 
 * @author Florian Kirchner
 * @version 1.0
 */
public class Hero  extends BattleArea
{
    //speed of a hero
    public int speed = 10; //change difficulty
    //shootCount
    private int shootCount = 0;
    //method act
    public void act() 
    {
        checkKeys();
        checkCollisions();
    }
    //check wich key is set
    private void checkKeys() {
        //right
        if(Greenfoot.isKeyDown("right")) {
            moveRight(speed);
        }
        //left
        if(Greenfoot.isKeyDown("left")) {
            moveLeft(speed);
        }
        //up
        if(Greenfoot.isKeyDown("up")) {
            moveUp(speed);
        }
        //down
        if(Greenfoot.isKeyDown("down")) {
            moveDown(speed);
        }
        //space
        if(Greenfoot.isKeyDown("space")) {
            shoot();
        }
        shootCount += 1; 
    }
    //healing
    private void shoot() {
        if (shootCount > 9) {
            getWorld().addObject(new Healer(), getX() + getImage().getWidth() / 2, getY());
            shootCount = 0;
        }
    }
    //checkCollisions (checks if Hero has collided with a Virus.class and stops the game)
    private void checkCollisions()
    {
        if(isCollided(Virus.class)) {
            remove(this);
            Greenfoot.stop();
        }
    }
}
