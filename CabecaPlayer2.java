import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CabecaPlayer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CabecaPlayer2 extends Actor
{
    /**
     * Act - do whatever the CabecaPlayer2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public CabecaPlayer2(){
        image = getImage();

        largura = image.getWidth(); //guarda o comprimento da imagem
        altura = image.getHeight(); //guarda a largura da imagem
    }
    
    private GreenfootImage image;
    public int largura ;
    public int altura;
    
    public void cabecaEfeito2(){
        if (Greenfoot.mouseMoved(this))  image.scale(largura+7,altura+7); //alteração das dimensões da imagem
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))  image.scale(largura,altura); //mantêm-se igual
    }
}
