import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floco extends Actor
{
    /**
     * Act - do whatever the Floco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Floco(){
        
        GreenfootImage image = getImage(); //alteração das dimensões da imagem
        image.scale(image.getWidth() - 340, image.getHeight() - 340);
        setImage(image);
    
    }
    
    public void act() 
    {
        move();
        remove();
    }    
    
    public void remove(){
            if(this.getY()>getWorldOfType(GameOver.class).getHeight()-30){
                GreenfootImage imagem;
                imagem = getImage();
                int transparenciaAtual = imagem.getTransparency(); // transparência que tem
                if (transparenciaAtual < 20) // se for muito transparente
                    getWorld().removeObject(this); // elimina o objeto
                else
                    imagem.setTransparency(transparenciaAtual - 20);// aumenta transparência
            }
        }    
    
    public void move(){ //OVERLOADING
        setLocation(getX(),getY()+5);
    }
    
}

