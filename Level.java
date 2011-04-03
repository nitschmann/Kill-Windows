import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level
 * 
 * @author Florian Nitschmann 
 * @version 1.0
 */
public class Level  extends Actor
{
    //constructor level (creates a image for level count)
    public Level() {
        String text = "Level: 1";
        GreenfootImage img = new GreenfootImage(text.length()*20, 30);
        java.awt.Color color = new java.awt.Color(255, 255, 255);
        img.setColor(color);
        img.drawString(text, 2, 20);
        setImage(img);
    }
    //method setLevel (sets a new level)
    public void setLevel(int num) {
        String text = "Level: ";
        text += num;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text, 2, 20);
    }    
}
