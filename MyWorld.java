import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (yu) 
 * @version (nov 23)
 */
public class MyWorld extends World 
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     */

    public MyWorld()
    {

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        // Create the elepahnt object.
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);

        // Create the label
        
        //First parameter is string, Second is size of the font.

        // Score throughtout game.
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);

        // Create the banana.
        createBanana();
        // Create the apple.
        createApple();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Gamer Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /** 
     * increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    } 

    /**
     * Create a new banana at random location at top of the screen 
     */
    public void createBanana()
    {
        Banana banana = new Banana();
        banana.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x, y);
    }
    /**
     * Create a new apple at random location at top of the screen 
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}

