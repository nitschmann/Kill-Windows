import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Score 
 * 
 * @author Florian Kirchner, Florian Nitschmann
 * @version 1.0
 */
public class Score extends BattleArea
{
    
    //counter for the current score
    private int counter = 0;
    //score the reach the next level
    private int maxScore = 1;
    //the number of the current background image (world)
    private int currentBg;
    //variable for Level.class
    private Level levelCounter;
    //current level
    public int level = 1;
    
    //act method
    public void act () {
        if(counter < 0) {
            counter = 0;    
        }
        checkWin();
    }
    //score constructor (opens a new score)
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
    //update method (update the score count)
    public void update(int num) {
        counter += num;
        setImage(counter);   
    }
    //setImage method (sets a new 'image' [label on world] for the score)
    public void setImage(int number) {
        String score = "Punkte: ";
        score += number;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(score, 2, 20);
    }
    //method checkWin (called in act() an checks if maxScore is reached)
    public void checkWin() {
        if(counter == maxScore) {
            //create a new maxScore
            int newMaxScore = maxScore+5; //can be changed 
            maxScore = newMaxScore;
            
            //get a number for a random background image in another level
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
            //set a new level
            int newLevel = level+1;
            level = newLevel;
            
            levelCounter.setLevel(newLevel);
            
        }
        //called a the begin of the game
        else if(counter != maxScore && level == 1) {
            currentBg = 1;
            levelCounter.setLevel(1);
        }
    }
        
}
