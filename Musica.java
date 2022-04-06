import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Musica extends Butoes
{
    static GreenfootSound sounds=new GreenfootSound("Snowman.mp3"); //musica utilizada
    public static boolean musicOn = true; 
    
    public Musica(){
    
    sounds.playLoop(); //tocar a música em loop(repetir depois de terminar)
    sounds.setVolume(30); //volume
    if(musicOn == false ) { //se a musica nao estiver a tocar (mudaram a variavel musicOn)
    setImage("sound-off.png"); //muda de imagem para a do som desligado
    sounds.pause(); //pausa o som
    }
    }
    
    public void act() 
    {
    butaoefect();
    if(Greenfoot.mouseClicked(this)){
    if(sounds.isPlaying())
    { //desligar musica
    sounds.pause();
    setImage("sound-off.png");
    musicOn = false;
    }else
    { //ligar musica
    sounds.playLoop();
    setImage("sound-on.png");
    musicOn = true;
    }
    } 
    }
}    

