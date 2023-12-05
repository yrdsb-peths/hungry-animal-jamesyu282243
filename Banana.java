import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for elephant.
 * 
 * @author (yu) 
 * @version (nov 23)
 */
public class Banana extends Actor
{
    int speed = 1;
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        // Remove banana and draw game over when apple gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
            
        }
    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
