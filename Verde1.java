import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Verde1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Verde1 extends CabecaPlayer1
{
   
    public void act() 
    {
        clickChoose();
        cabecaEfeito1();
    }  
    
    public void clickChoose(){
    if(Greenfoot.mouseClicked(this)) ChoosePlayer.player1 ="pinguim_verde/Verde_";
   
    
    }
}
