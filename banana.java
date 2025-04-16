import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class banana extends Actor
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int increase = 1;
    public void act()
    {
        // Add your action code here.
        
        move(-increase);
        if(getX() <= 0) 
        {
        resetBanana();
        }
        
        if(isTouching(HEro.class)) 
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetBanana() 
    {
        int num = Greenfoot.getRandomNumber(2); 
        if (num == 0) 
        {
            setLocation(600, 100);
            increase++;
        }
        else 
        {
            setLocation(600, 300);
            increase++;
        }
    }
}
