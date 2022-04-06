import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ChoosePlayer extends World
{
    private GreenfootImage image;
    public static String player1 ;
    public static String player2 ;

   

    public ChoosePlayer()
    {    
        
        super(1000, 700, 1); 
        esc();
        prepare();
    }

    private void esc()
    {
        Esc esc = new Esc();
        addObject(esc,56,43);
    }

    
   
    private void prepare()
    {
        Amarelo1 amarelo1 = new Amarelo1();
        addObject(amarelo1,216,201);
        Rosa1 rosa1 = new Rosa1();
        addObject(rosa1,387,201);
        Verde1 verde1 = new Verde1();
        addObject(verde1,221,311);
        Vermelho1 vermelho1 = new Vermelho1();
        addObject(vermelho1,390,304);
        Amarelo2 amarelo2 = new Amarelo2();
        addObject(amarelo2,613,201);
        Rosa2 rosa2 = new Rosa2();
        addObject(rosa2,788,201);
        Verde2 verde2 = new Verde2();
        addObject(verde2,618,308);
        Vermelho2 vermelho2 = new Vermelho2();
        addObject(vermelho2,785,307);
        Ready ready = new Ready();
        addObject(ready,500,622);
        Musica musica = new Musica();
        addObject(musica,960,42);

        NomePlayer1 nomePlayer1 = new NomePlayer1();
        addObject(nomePlayer1,315,470);

        NomePlayer2 nomePlayer2 = new NomePlayer2();
        addObject(nomePlayer2,687,471);

        

        player1 =null;//para quando o jogo der reset nao guardar os valores nas variaveis
        player2=null;
        
    }

  
  
}
