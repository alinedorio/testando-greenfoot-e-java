import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        aranha aranha = new aranha();
        addObject(aranha,15,200);
        cobra cobra = new cobra();
        addObject(cobra,20,285);
        mosca mosca = new mosca();
        addObject(mosca,18,110);
        mosca mosca2 = new mosca();
        addObject(mosca2,23,29);
        mosca mosca3 = new mosca();
        addObject(mosca3,517,51);
        mosca mosca4 = new mosca();
        addObject(mosca4,583,125);
        mosca2.setLocation(213,45);
        mosca.setLocation(362,177);
        mosca2.setLocation(81,45);
        mosca.setLocation(223,55);
        aranha.setLocation(294,192);
        mosca2.setLocation(71,130);
        mosca.setLocation(161,13);
        mosca3.setLocation(397,64);
        mosca4.setLocation(541,201);
        cobra.setLocation(133,359);
        mosca4.setLocation(535,217);
        removeObject(mosca4);
        removeObject(mosca3);
        removeObject(mosca);
    }
}
