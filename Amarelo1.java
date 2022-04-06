import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane ;
import javax.swing.JInternalFrame;

public class Amarelo1 extends CabecaPlayer1
{
    
    public void act() 
    {
        clickSelect();
        cabecaEfeito1();
    } 
    
    public void clickSelect(){
    if(Greenfoot.mouseClicked(this)) {
    ChoosePlayer.player1 ="pinguim_amarelo/Amarelo_"; //guarda na variável o nome do
       
    }
    }
}
