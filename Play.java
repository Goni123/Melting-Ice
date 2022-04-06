import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Play extends Butoes
{
  
    public void act() 
    {
        playbutton();
        butaoefect();
    }    
    public void playbutton(){
        if(Greenfoot.mouseClicked(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo(); //recebe a informação de onde o rato clicou
            ChoosePlayer PlayerSelection = new ChoosePlayer(); //inicalização do mundo principal
            Greenfoot.setWorld(PlayerSelection);
            
        } 
    }
 
}
