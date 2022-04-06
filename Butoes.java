import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butoes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butoes extends Actor
{
    public GreenfootImage image;
    public int largura ;
    public int altura;
    
    public Butoes(){
        image = getImage();

        largura = image.getWidth(); //guarda o comprimento da imagem
        altura = image.getHeight(); //guarda a largura da imagem
    }
    public void act() 
    {
        // Add your action code here.
    }  
    public void butaoefect(){ //efeito de aumentar o butão quando o rato passa por cima
        if (Greenfoot.mouseMoved(this))  image.scale(largura+7,altura+7); //alteração das dimensões da imagem
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))  image.scale(largura,altura); //mantêm-se igual as dimensões da imagem
    }
    
}
