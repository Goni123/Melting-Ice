import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vermelho1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vermelho1 extends CabecaPlayer1
{
    
    public void act() 
    {
        clickChoose();
        cabecaEfeito1();
    }    
    
    public void clickChoose(){
    if(Greenfoot.mouseClicked(this)) ChoosePlayer.player1 ="pinguim_vermelho/Vermelho_";
           
    
    
    }
}
