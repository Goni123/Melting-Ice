import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Reciclagem extends Bonus
{
   
     
     private boolean detetaReciclagem = false;
    
    
    public void act() 
    {
        movimento();
       
       player1Apanha();
       player2Apanha();
         remove();
         verifica();
        
    }    
    
    
            
            
            boolean tocou1;
             boolean tocou2;
             
             static long  tempoEfeitoReciclagem1; 
           static long  tempoEfeitoReciclagem2;
             
            public void player1Apanha(){ //OVERRIDING
                if (isTouching(Player1.class))
                {
                    if(tocou1 == false)
                    {
                        hSpeed=-2;
                         getWorldOfType(MyWorld.class).somaPontos(20);
                        
                        Player1.velocidade = 10; //aumenta a velocidade do jogador
                        tempoEfeitoReciclagem1 = MyWorld.contador.getValue() + 10; //efeito do bonus durante 10 segundos (adicionar 10 segundos ao tempo atual)
                            setImage("Message2.png");
                        
                       
                        tocou1 = true;
                    }    
            }
                 else
                     tocou1 = false; 
                    }
                    
            public void player2Apanha(){
                     if (isTouching(Player2.class))
                {
                  
                    if(tocou2 == false)
                    {
                          hSpeed=-2;
         
                        getWorldOfType(MyWorld.class).somaPontos(20);
                        Player2.velocidade = 10;
                         tempoEfeitoReciclagem2 = MyWorld.contador.getValue() + 10;
                        setImage("Message2.png");
                       
                        tocou2 = true;
                    }
               
            }
                else
                    tocou2 = false; 
        }
}
