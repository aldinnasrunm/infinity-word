import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        // Add your action code here.
    }

    //make getter 

    public int getTop(){
        return (getX() - getImage().getHeight()/2)+20;
    }
    public int getBottom(){
        return (getX() + getImage().getHeight()/2)-20;
    }
    public int getLeft(){
        return getX() - getImage().getWidth()/2;
    }
    public int getRight(){
        return getX() + getImage().getWidth()/2;
    }
    public int getHeight(){
        return getImage().getHeight();
    }
    public int getWidth(){
        return getImage().getWidth();
    }


}
