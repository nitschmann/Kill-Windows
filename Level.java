import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level  extends Actor
{
    public Level() {
        String text = "Level: 1";
        GreenfootImage img = new GreenfootImage(text.length()*20, 30);
        java.awt.Color color = new java.awt.Color(255, 255, 255);
        img.setColor(color);
        img.drawString(text, 2, 20);
        setImage(img);
    }
    
    public void setLevel(int num) {
        String text = "Level: ";
        text += num;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text, 2, 20);
    }    
}
