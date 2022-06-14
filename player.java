import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage img = getImage();
        img.scale(48,48);
        setImage(img);
        // Add your action code here.
        if(Greenfoot.isKeyDown("right"))
            setLocation(getX()+2, getY());
        else if(Greenfoot.isKeyDown("left"))
            setLocation(getX()-2, getY()); 
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY()-2);
        else if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY()+2); 
            
        if(Greenfoot.isKeyDown("space")){
           // shoot();
        }
    }
}
