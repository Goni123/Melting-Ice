import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NomePlayer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NomePlayer2 extends Actor
{
    public static String nomeplayer2;
    public GreenfootImage img;
    private String text;
    /**
     * Act - do whatever the NomePlayer2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       NomePlayer2efect();
        if(Greenfoot.mouseClicked(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo(); //recebe a informação de onde o rato clic
            nomeplayer2=Greenfoot.ask("Username for Player2");
            getWorld().showText(nomeplayer2,687,500);
        }
    }    
     public  NomePlayer2()
    {
       GreenfootImage img = new GreenfootImage("𝘾𝙝𝙤𝙤𝙨𝙚 𝙮𝙤𝙪𝙧 𝙉𝙖𝙢𝙚", 30, Color.BLACK,null); 
       setImage(img);
       //para quando o jogo der reset nao guardar os valores nas variaveis
        nomeplayer2 =null;
       
        
    }
    public void NomePlayer2efect(){
      if (Greenfoot.mouseMoved(this)){
          GreenfootImage img = new GreenfootImage("𝘾𝙝𝙤𝙤𝙨𝙚 𝙮𝙤𝙪𝙧 𝙉𝙖𝙢𝙚", 30, Color.ORANGE, null); 
          setImage(img);
      }
    
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) 
        {
            GreenfootImage img = new GreenfootImage("𝘾𝙝𝙤𝙤𝙨𝙚 𝙮𝙤𝙪𝙧 𝙉𝙖𝙢𝙚", 30, Color.BLACK, null); 
            setImage(img); 
        }
    } 
}
