import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TryAgain extends Butoes
{
    
    public void act() 
    {
    trygainbutton();
    butaoefect();
    }    
    
    
    public void trygainbutton(){
    if(Greenfoot.mouseClicked(this)){
    MouseInfo mouse = Greenfoot.getMouseInfo(); //recebe a informação de onde o rato clicou
    MyWorld TryAgain = new MyWorld(); //inicalização do mundo principal
    Greenfoot.setWorld(TryAgain );
    } 
    }
    
}
