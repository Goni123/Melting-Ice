        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
    public class Bonus extends Actor
    {
        public int hSpeed = Greenfoot.getRandomNumber(6);
        public GreenfootImage imagem;
        private boolean detetaPeixe = false;
        private boolean detetaAgua = false;
        public boolean tocou1;
        public boolean tocou2;
        
        public void act() 
        {
        // Add your action code here.
        } 
        
        
        public void verifica(){
        if(hSpeed == 0){
        int num =Greenfoot.getRandomNumber(6);
        hSpeed= num;
        }
        }
        
        
        public void movimento(){
        setLocation(getX(),getY()+hSpeed);
        }
        
        
        public void remove(){ // vai remover do mapa quando toca no mar ou no pinguim
        
        if (isTouching(Mar.class) || isTouching(Player1.class)|| isTouching(Player2.class)) 
        {  
        imagem = getImage();
        int transparenciaAtual = imagem.getTransparency(); // transparência que tem
        if (transparenciaAtual < 20) // se for muito transparente
        getWorld().removeObject(this); // elimina o objeto
        else
        imagem.setTransparency(transparenciaAtual - 20); // aumenta transparência
        }       
        }
        
        
        public void player1Apanha(){
        if (isTouching(Player1.class))
        {  
        MyWorld myWorld = (MyWorld)getWorld(); //instanciação do mundo(MyWorld)
        HealthBar healthbar = myWorld.getHealthBar(); //chamada do metodo getHealthBar
        
        if(detetaPeixe ==false){ //verifica se já tocou
        if(healthbar.vida < 10) healthbar.vida++; // aumenta a vida apenas se o nivel de vida for inferior a 10
        getWorldOfType(MyWorld.class).somaPontos(10); //soma 10 pontos
        detetaPeixe =true; //atualiza a variavel
        }
        
        if(detetaAgua ==false){
        if(healthbar.vida < 10) healthbar.vida++; // aumenta a vida apenas se o nivel de vida for inferior a 10
        getWorldOfType(MyWorld.class).somaPontos(10);
        detetaAgua =true;
        }
        
        }
        }
       
            
        public void player2Apanha(){
        if (isTouching(Player2.class))
        {
        MyWorld myWorld = (MyWorld)getWorld();
        HealthBar healthbar2 = myWorld.getHealthBar2();
        
        if(detetaPeixe ==false){
        if(healthbar2.vida < 10) healthbar2.vida++; // aumenta a vida apenas se o nivel de vida for inferior a 20   
        getWorldOfType(MyWorld.class).somaPontos(10);
        detetaPeixe =true;
        }
        
        if(detetaAgua ==false){
        if(healthbar2.vida < 10) healthbar2.vida++; // aumenta a vida apenas se o nivel de vida for inferior a 20
        getWorldOfType(MyWorld.class).somaPontos(10);
        detetaAgua =true;
        }
        }
        }
      
   }
