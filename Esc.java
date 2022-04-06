import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Esc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Esc extends Butoes
{
    /**
     * Act - do whatever the Esc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        tocou();
        butaoefect();
    } 
    
    public void tocou(){
        MouseInfo mouse = Greenfoot.getMouseInfo();  //obtem a informação do rato
        if(mouse!=null) {
            int clicou = mouse.getButton();    // obtem a informação do botao do rato que foi clicado
            if(Greenfoot.mouseClicked(this) && clicou==1) { 
                Greenfoot.setWorld(new Title());
                getWorld().removeObjects(getWorld().getObjects(null)); 
            }
        }
    }
}
