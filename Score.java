import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author Florian Kirchner
 * @version 1.0
 */
public class Score extends BattleArea
{
    
    /**
     * Allgemeines
     */
    private int counter = 0;
    private int maxScore = 1;
    private int currentBg;
    private Level levelCounter;
    
    public int level = 1;
    //Level rank;
    //private GreenfootImage levelImage;
    
    
    /**
     * Act
     */
    public void act () {
        checkWin();
    }
    
    
    /**
     * Score
     */
    
    public Score(int number, Level level) {
        levelCounter = level;
        String score = "Punkte: ";
        score += number;
        GreenfootImage img = new GreenfootImage(score.length() * 20, 30);
        java.awt.Color color = new java.awt.Color(255, 255, 255);
        img.setColor(color);
        img.drawString(score, 2, 20);
        setImage(img);
    }
    public void update(int num) {
        counter += num;
        setImage(counter);   
    }
    public void setImage(int number) {
        String score = "Punkte: ";
        score += number;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(score, 2, 20);
    }
    
    public void checkWin() {
        //check that score can never be under 0 (null)
        if (counter < 0) {
            counter = 0;    
        }
        
        else if(counter == maxScore) {
            
            int newMaxScore = maxScore+5;
            maxScore = newMaxScore;
      
            int newBg = Greenfoot.getRandomNumber(4) + 1;
            
            if(newBg == currentBg) {
                newBg = Greenfoot.getRandomNumber(4) + 1;
            }
            else if(newBg != currentBg){
                if(newBg == 1) {
                    getWorld().setBackground("xp.jpg");
                    currentBg = 1;
                }
                else if(newBg == 2) {
                    getWorld().setBackground("vista.jpg");    
                    currentBg = 2;
                }
                else if(newBg == 3) {
                    getWorld().setBackground("win_7.jpg");    
                    currentBg = 3;
                }
                else if(newBg == 4) {
                    getWorld().setBackground("mac.jpg");    
                    currentBg = 4;
                }    
            }
            
            int newLevel = level+1;
            level = newLevel;
            
            levelCounter.setLevel(newLevel);
            
        }
        else if(counter != maxScore && level == 1) {
            currentBg = 1;
            levelCounter.setLevel(1);
        }
    }
        
}
