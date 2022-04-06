import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Eco extends Bonus
{
   
    private boolean tocou ;
     public void act() 
    {
        movimento();
       
        pinguimApanha();
        removeEco();
        
         verifica();
        
    }    
  
     public void removeEco(){ // vai remover do mapa quando toca no mar ou no pinguim
        
        if (isTouching(Player1.class)|| isTouching(Player2.class)) 
        {  
            hSpeed = -1; //nova velocidade do objeto
     
           getWorld().removeObject(this); // elimina o objeto
       
      
        }
        
         else if (isTouching(Mar.class)) 
        {  
           
            imagem = getImage();
            int transparenciaAtual = imagem.getTransparency(); // transparência que tem
        if (transparenciaAtual < 20) // se for muito transparente
            getWorld().removeObject(this); // elimina o objeto
        else
            imagem.setTransparency(transparenciaAtual - 20); // aumenta transparência
        }       
    }
    
            private void pinguimApanha(){
                if (isTouching(Player1.class) || isTouching(Player2.class) )
                {
                    
                    if(tocou == false) // para garantir que não repete o efeito enquanto o objeto está a tocar no pinguim
                    {
                        
                        if (MyWorld.nivelDoMar > 0) MyWorld.nivelDoMar --;  // para garantir que não acumula números negativos no nivel do mar quando ainda está no nivel 0
                        getWorldOfType(MyWorld.class).somaPontos(20);
                    
                        tocou = true;
                    }
              
            }
                else
                    tocou = false; 
        }
    
    
    
 
    
}
