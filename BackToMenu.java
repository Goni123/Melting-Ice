import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToMenu extends Butoes
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        backtomenubutton();
        butaoefect();
    }    
    public void backtomenubutton(){
        MouseInfo mouse = Greenfoot.getMouseInfo();  //obtem a informação do rato
        if(mouse!=null) { //se a informação do rato não for nula(fora do screen)
            int clicou = mouse.getButton();    // obtem a informação do botao do rato que foi clicado
            if(Greenfoot.mouseClicked(this) && clicou==1) {  //clicou ==1 (botão esquerdo apenas)
                Greenfoot.setWorld(new Title()); //instanciação do novo mundo
                getWorld().removeObjects(getWorld().getObjects(null)); //remove todos os objetos do mundo 
            }
        }
    }
}
