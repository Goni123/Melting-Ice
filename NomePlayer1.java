        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        
        public class NomePlayer1 extends Actor
        {
        public static String nomeplayer1;
        public GreenfootImage img;
        private String text;
        
        public void act() 
        {
        NomePlayer1efect();
        if(Greenfoot.mouseClicked(this)){
        MouseInfo mouse = Greenfoot.getMouseInfo(); //recebe a informaรงรฃo de onde o rato clic
        nomeplayer1=Greenfoot.ask("Username for Player1"); //pergunta o nome ao utilizador
        getWorld().showText(nomeplayer1,315,500);
        }
        }    
        
        
        public  NomePlayer1()
        {
        GreenfootImage img = new GreenfootImage("๐พ๐๐ค๐ค๐จ๐ ๐ฎ๐ค๐ช๐ง ๐๐๐ข๐", 30, Color.BLACK,null); 
        setImage(img);
        nomeplayer1 =null; //para quando o jogo der reset nao guardar os valores nas variaveis
        
            
        }
        public void NomePlayer1efect(){
        if (Greenfoot.mouseMoved(this)){
        GreenfootImage img = new GreenfootImage("๐พ๐๐ค๐ค๐จ๐ ๐ฎ๐ค๐ช๐ง ๐๐๐ข๐", 30, Color.ORANGE, null); 
        setImage(img);
        }
        
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) 
        {
        GreenfootImage img = new GreenfootImage("๐พ๐๐ค๐ค๐จ๐ ๐ฎ๐ค๐ช๐ง ๐๐๐ข๐", 30, Color.BLACK, null); 
        setImage(img); 
        }
        } 
        
    }