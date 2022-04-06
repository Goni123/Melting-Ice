import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CabecaPlayer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CabecaPlayer1 extends Actor
{
    public CabecaPlayer1(){
        image = getImage();

        largura = image.getWidth(); //guarda o comprimento da imagem
        altura = image.getHeight(); //guarda a largura da imagem
    }
    
    public void act() 
    {
        // Add your action code here.
    } 
    
    private GreenfootImage image;
    public int largura ;
    public int altura;
    
    public void cabecaEfeito1(){
        if (Greenfoot.mouseMoved(this))  image.scale(largura+7,altura+7); //alteração das dimensões da imagem
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))  image.scale(largura,altura); //mantêm-se igual
    }
    
}
