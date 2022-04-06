import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HealthBar extends Actor
{
    int  vida=10 ; //vida do jogador
    int barraVidaWidth = 80; //comprimento da barra
    int barraVidaHeight = 20; //altura da barra
    int pixelsNaBarraVida = (int)barraVidaWidth/vida; //cast e  divisão da barra em partes
    
    
    public HealthBar(){
    update();
    
    }
    
    public void act() 
    {
    update();
    } 
    
    public void update(){
    setImage(new GreenfootImage(barraVidaWidth + 2 , barraVidaHeight +2));//criar a barra transparente 
    GreenfootImage myImage = getImage();
    myImage.setColor(Color.BLACK); //cor dos contornos
    myImage.drawRect(0,0,barraVidaWidth + 1,barraVidaHeight + 1); //desenho do retangulo para a barra de vida
    
    if (vida >=6) getImage().setColor(Color.GREEN); //mudança de cor , consoante a vida
    if (vida<6 && vida>3) getImage().setColor(Color.YELLOW);
    if (vida <=3) getImage().setColor(Color.RED);
    
    getImage().fillRect(1,1,vida * pixelsNaBarraVida,barraVidaHeight); //preenchimento da barra de vida com cor
    if(vida<=0){
    setImage("caveira1.png"); //quando o penguim chegar a 0 de vida "morre" e muda de imagem
    }
    }
}
