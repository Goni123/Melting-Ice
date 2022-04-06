import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyInstruct here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyInstruct extends World
{

    /**
     * Constructor for objects of class MyInstruct.
     * 
     */
    public MyInstruct()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        esclocation();
        prepare();
    }

    public void esclocation(){

        Esc esc = new Esc();
        addObject(esc,364,158);
        esc.setLocation(66,54);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Musica musica = new Musica();
        addObject(musica,960,42);
    }
}
