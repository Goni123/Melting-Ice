import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peixe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peixe extends Bonus
{
       
    public void act() 
    {
        movimento();
       
        player1Apanha();
        player2Apanha();
         remove();
         verifica();
        
    }    
    
    
            
            
           
}
