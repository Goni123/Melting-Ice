import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SeaLevelBar extends Actor
{
    int vida = 17;
    int barraDoMarWidth = 20;
    int barraDoMarHeight = 70;
    int pixelsNaBarraDoMar = (int)barraDoMarHeight/vida;
    
    public SeaLevelBar(){
    update();
    }
    
    
    public void act() 
    {
    update();
    }
    
    
    public void update(){
    setImage(new GreenfootImage(barraDoMarWidth +2  , barraDoMarHeight +2 ));//criar a barra transparente 
    GreenfootImage myImage = getImage();
    
    if (MyWorld.nivelDoMar <=12) getImage().setColor(Color.WHITE);
    else getImage().setColor(Color.RED);
    
    getImage().fillRect(1,1,barraDoMarHeight,vida  * pixelsNaBarraDoMar );
    
    myImage.setColor(Color.BLACK);
    myImage.drawRect(0,0,barraDoMarWidth +1,barraDoMarHeight +1);
    }
}