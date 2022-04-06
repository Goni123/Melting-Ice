        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        public class Armadilhas extends Actor
        {
        public int hSpeed = Greenfoot.getRandomNumber(6);
        public GreenfootImage imagem;
        
        public void act() 
        {
        
        }   
        
        
        public void verifica(){ //verificação para a velocidade do objeto não ser 0 no sentido do eixo dos y
        if(hSpeed == 0){
        int num =Greenfoot.getRandomNumber(6);
        hSpeed= num;
        }
        }
        
        
        public void movimento(){
        setLocation(getX(),getY()+hSpeed); //movimento das armadilhas no sentido positivo do eixo dos y
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
        
    
    
    }
