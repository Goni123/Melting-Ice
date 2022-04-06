import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{
    public GreenfootImage img;
    

    public GameOver()
    {    
    
    super(1000, 700, 1); 
    prepare();
   
    }
    
    
    
    private void prepare()
    {
    PinguimGift pinguimGift = new PinguimGift();
    addObject(pinguimGift,505,384);
    // Player1 player1 = new Player1();
    // addObject(player1,154,236);
    // Player2 player2 = new Player2();
    // addObject(player2,840,240); 
    BackToMenu backtoMenu = new BackToMenu();
    addObject(backtoMenu,getWidth()/4*3,560);
    TryAgain tryAgain = new TryAgain();
    addObject(tryAgain,getWidth()/4,560);
    showText(NomePlayer1.nomeplayer1 + " & " + NomePlayer2.nomeplayer2, getWidth()/2, 40);
    showText("Your score: " + MyWorld.score, getWidth()/4, 80);
    showText("Your time: " + MyWorld.contador.getValue() , getWidth()/4*3, 80);
    Musica musica = new Musica();
    addObject(musica,960,42);
    }
    
    
    public void act(){
       
    if(Greenfoot.getRandomNumber(10)<2){
    int x = Greenfoot.getRandomNumber(getWidth());
    Floco floco = new Floco();
    addObject(floco, x, 20);
    
    if(floco.getY()==getHeight()-50){ //desaparecer os flocos quando caiem na parte inferior do mapa
    removeObject(floco);
    }
    
    }
    }
}
