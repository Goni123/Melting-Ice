import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Amarelo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amarelo2 extends CabecaPlayer2
{
    public void act() 
    {
        clickChoose();
        cabecaEfeito2();
    }    
    
    public void clickChoose(){
    if(Greenfoot.mouseClicked(this)) ChoosePlayer.player2 ="pinguim_amarelo/Amarelo_";
           
    }
}
