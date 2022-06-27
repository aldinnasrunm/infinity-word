import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{
    /**
     * Act - do whatever the Tree0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage bg0 = new GreenfootImage("background/1.png");
    public void act()
    {
        // setImage(bg0);// Add your action code here.
    }


    public void setBG(GreenfootImage bg){
        setImage(bg);
        GreenfootImage imbBg = getImage();
        imbBg.scale(2000,400);
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
