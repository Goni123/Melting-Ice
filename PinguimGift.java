import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinguimGift here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinguimGift extends Actor
{
    GifImage myGif = new GifImage("pinguim game over.gif"); //instanciação do gif
    /**
     * Act - do whatever the PinguimGift wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(myGif.getCurrentImage()); //colocar o gif 
    }    
}
