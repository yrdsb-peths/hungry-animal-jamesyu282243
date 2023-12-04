import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Yu 
 * @version Dec 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 50);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        
    }
    
    /**
     * the main world act loop
     */
    public void act()
    {
        // start the game if use presses space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
    }
}
