import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aranha extends Actor
{
    /**
     * Act - do whatever the aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            turn(-3);
        }
        
        if(Greenfoot.isKeyDown("right")){
            turn(3);
        }
        
        if(Greenfoot.isKeyDown("up")){
            move(3);
        }
        
        if(Greenfoot.isKeyDown("down")){
            move(-3);
        }
        
        mataMosca();
    }
    
    public void mataMosca(){
        Actor mosca = getOneIntersectingObject(mosca.class);
        
        if(mosca!=null){
            World myWorld = getWorld();
            YouWin youwin = new YouWin();
            myWorld.addObject(youwin, myWorld.getWidth()/2, myWorld.getHeight()/2);
            myWorld.removeObject(this);
            Greenfoot.stop();
        }
    }
}
