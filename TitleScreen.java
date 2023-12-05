import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Yu 
 * @version Dec 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 50);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 200);

        prepare();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,389,142);
        elephant.setLocation(456,119);
        elephant.setLocation(468,112);
        elephant.setLocation(463,112);
        elephant.setLocation(446,94);
        elephant.setLocation(442,91);
        Label label = new Label("Press <space> to Start", 50);
        addObject(label,264,305);
        label.setLocation(458,293);
        label.setLocation(228,290);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 30);
        addObject(label2,237,232);
        label.setLocation(271,351);
        label2.setLocation(315,263);
        elephant.setLocation(482,81);
        label2.setLocation(327,302);
        label.setLocation(354,351);
        label.setLocation(234,333);
        Label label3 = new Label("Press <space> to Start", 30);
        addObject(label3,234,333);
        label.setLocation(398,362);
        label.setLocation(393,362);
        removeObject(label);
        label3.setLocation(377,355);
        label3.setLocation(377,354);
        label3.setLocation(356,351);
    }
}
