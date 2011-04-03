import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GatesWorld here.
 * 
 * @author Florian Kirchner
 * @version 1.0
 */
public class GatesWorld  extends World
{
    Score score;
    //Level level;
    
    public GatesWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        // Den Helden beschwören
        Hero Hero = new Hero();
        addObject(Hero, 50,300);
        
        Level level = new Level();
        addObject(level, 250, 50);
        
        score = new Score(0, level);
        addObject(score, 100, 50);
             
        
    }
    
    public void act()
    {
        spawnVirus();
    }
    private void spawnVirus()
    {
        if(Greenfoot.getRandomNumber(1000) > 980) {
            addObject(new Virus(score), 775, Greenfoot.getRandomNumber(560) + 20);
        }
    }
    
    public void addedToWorld(World world) {
        int level = score.level;
        
        String levelString = "Level: ";
        levelString += level;
        GreenfootImage img = new GreenfootImage(levelString.length() * 20, 30);
        java.awt.Color color = new java.awt.Color(255, 255, 255);
        img.setColor(color);
        img.drawString(levelString, 2, 20);
        //setImage(img);
    }
    
    
}
