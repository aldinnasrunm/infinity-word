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
    scrollingWorld world = (scrollingWorld) getWorld();
    private int fSpeed = 0;
    private int acceleration = 1;
    private int speed = 4;

    public void act()
    {
        GreenfootImage img = getImage();
        img.scale(48,48);
        setImage(img);
        
        scrollingWorld world = (scrollingWorld) getWorld(); 
        if(Greenfoot.isKeyDown("left")){
            scrollingWorld.counter.setValue(scrollingWorld.actorMovement);
            if(scrollingWorld.actorMovement > -400){
                scrollingWorld.actorMovement -= speed;
                if(getX() >= img.getWidth()/2 + 40 ){
                    move(-speed);
                    
                }else{
                        if(scrollingWorld.actorMovement > -400){
                        scrollingWorld.movement = speed;
                        world.scrollGround(speed);
                        world.paralaxBackground(speed);    
                        }else{
                            scrollingWorld.movement = 0;  
                            world.scrollGround(0);
                            world.paralaxBackground(0);
                        }
                }
            }
        }else if(Greenfoot.isKeyDown("right")){
            scrollingWorld.counter.setValue(scrollingWorld.actorMovement);
            if(scrollingWorld.actorMovement < 400){
                scrollingWorld.actorMovement += speed;
                if(getX() <= (world.getWidth() - img.getWidth()/2-40)){
                    move(speed);
                    }else{
                        if(scrollingWorld.actorMovement < 400){
                            scrollingWorld.movement = -speed;  
                            world.scrollGround(-speed);
                            world.paralaxBackground(-speed);
                        }else{
                            scrollingWorld.movement = 0;  
                            world.scrollGround(0);
                            world.paralaxBackground(0);
                        }
                    }
            }
        }else{
                scrollingWorld.movement = 0;
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY()> world.getHeight()/2){
                setLocation(getX(), getY()-speed*2);
            }
            
        }
        chekFall();
        }

        public void chekFall(){
            if(onGround()){
                fSpeed = 0;
            }else{
                makeGrafity();
            }
        }


        public boolean onGround(){
            // Actor below = getOneObjectAtOffset(0, getImage().getHeight()/2 -4, Ground.class);
            boolean below = isTouching(GroundLong.class);
            return below;
        }

 
        void makeGrafity(){
            setLocation(getX(), getY() + fSpeed);
            fSpeed = fSpeed + acceleration;
        }

    }

