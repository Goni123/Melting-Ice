import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)import java.util.concurrent.TimeUnit;

public class Rede extends Armadilhas
{
   
    private boolean detetaRede=false;
  
    
    public void act() 
    {
        movimento();
      player1Apanha();
       player2Apanha();
     
        remove();
         verifica();
       
         
    }    
    
     private GreenfootImage imagem;
            
     boolean tocou1;
     boolean tocou2;
           
     static long  tempoEfeitoRede1; 
     static long  tempoEfeitoRede2;
  
           
    private void player1Apanha(){ 
        if (isTouching(Player1.class)) //quando tocar no player1
        {    
            if(tocou1 == false) //verificar se já tocou
            {      
                hSpeed = -2; //nova velocidade do objeto (sobe lentamente até desaparecer)
                setImage("Message1.png"); //apresenta a mensagem de que a velocidade vai diminuir
                Player1.velocidade = 2;  // define a velocidade a 2 / lento
                tempoEfeitoRede1 = MyWorld.contador.getValue() + 10;  // adiciona 10 segundos ao efeito
                getWorldOfType(MyWorld.class).somaPontos(-10);    // adiciona -10 ao score
                tocou1 = true; //atualiza a variável de verificação
            }
               
        }
        else
            tocou1 = false; //caso nao toque, continua a false a variável
    }
                    
    private void player2Apanha(){
        if (isTouching(Player2.class))
        {
            if(tocou2 == false)
            {
               hSpeed = -2;
               setImage("Message1.png");
               Player2.velocidade = 2;
               tempoEfeitoRede2 = MyWorld.contador.getValue() + 10;    
               getWorldOfType(MyWorld.class).somaPontos(-10);
               tocou2 = true;
                            
            } 
        }
        else
            tocou2 = false;
    }
                 
}
 

