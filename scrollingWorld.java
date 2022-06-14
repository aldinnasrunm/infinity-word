import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class scrollingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scrollingWorld extends World
{
    public static final int WIDE = 800; // world width (viewport)
    public static final int HIGH = 600; // world height (viewport)
     
    //Scroller scroller; // the object that performs the scrolling
    Actor scrollActor; // an actor to stay in view
    
    /**
     * Constructor for objects of class scrollingWorld.
     * 
     */

    private ArrayList<Ground> grounds = new ArrayList<Ground>();
    Ground first,last;

    public scrollingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    void prepare(){
        //addd new ground
        addObject(new Ground(),getWidth()/2, getHeight()-20);
        int x,y;
        Ground ground = new Ground();
        x = ground.getWidth()/2;
        y = getHeight()-ground.getHeight()/2;
        addObject(ground,x,y);
        grounds.add(ground);
        first = ground;

        ground = new Ground();
        addObject(ground, x+ground.getWidth(), y);
        grounds.add(ground);
        last = ground;




        
        addObject(new player(), 300, 200);
    }


    public void addGround(boolean addToRight){
        int _x, _y;

        Ground ground = new Ground();

        if(addToRight){
            _x = last.getX() + ground.getWidth();
            _y = last.getY();
            last = ground;
        }else{
            _x = first.getX()- ground.getWidth();
            _y = first.getY();
            first = ground;
        }

        addObject(ground, _x, _y);
        grounds.add(ground);
    }

    public void scrollGround(int dx){
        for(Ground ground : grounds){
            ground.move(dx);
        }


        if(first.getLeft() > 0){
            addGround(false);
        }
        if(last.getRight() < getWidth()){
            addGround(true);
        }
    }



}
