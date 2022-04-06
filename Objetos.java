        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        
    public class Objetos extends Actor
    {   
        public int hSpeed = Greenfoot.getRandomNumber(6) , wSpeed = Greenfoot.getRandomNumber(6)-5;
        public boolean caiuNoMar;
        private boolean detetaGarrafa=false;
        private boolean detetaLixo=false;;
        
        
        public void verifica(){  // caso o numero aleatorio gerado para o hSpeed seja 0, volta a gerar um novo. Para que o objeto não fique parado quando aparecer no mapa
        if(hSpeed == 0){
        int num =Greenfoot.getRandomNumber(6);
        hSpeed= num;
        }
        }
        
        
        public void movimento(){  // faz os objetos moverem-se no mapa 
        setLocation(getX() + wSpeed, getY()+ hSpeed);
        if(getX()<5){
        wSpeed = -wSpeed; 
        }
        
        if(getX() > getWorld().getWidth()-5){
        wSpeed = -wSpeed; 
        }
        }
        
        
        public void ressaltaNoPinguim()  // faz os objetos voltarem em direção ao ceu quando batem no pinguim
        {
        if (isTouching(Player1.class) && hSpeed > 0 && isTouching(Mar.class) == false)  // hSpeed > 0 para evitar que o objeto volte para baixo mesmo depois de tocar no pinguim
        {                                                                               // isTouching(Mar.class) == false para que o objeto não volte para cima quando já caiu no mar e o pinguim toca-lo
        hSpeed = -hSpeed; // o sentido em Y passa a ser negativo
        getWorldOfType(MyWorld.class).somaPontos(10);
        }
        
        if (isTouching(Player2.class) && hSpeed > 0 && isTouching(Mar.class) == false)
        {
        hSpeed = -hSpeed; // o sentido em Y passa a ser negativo
        getWorldOfType(MyWorld.class).somaPontos(10);
        }
        }
        
        
        public void caiNoMar(){  // atualiza o score, nivel do mar e barra do mar quando um objeto cai no mar
            if (isTouching(Mar.class))
            { 
                MyWorld myWorld = (MyWorld)getWorld();
                SeaLevelBar seaLevelBar = myWorld.getSeaLevelBar();
 
                if(caiuNoMar == false) // bool caiuNoMar é usado para que não se repita a soma do nivelDoMar
                {
                    getWorldOfType(MyWorld.class).somaPontos(-10);
                    seaLevelBar.vida--;
                    caiuNoMar = true;
                    hSpeed = 1;  // hSpeed = 1 para fazer efeito leve na agua
                    wSpeed = 0;  // wSpeed = 0 para que o objeto caia na vertical até o fundo do mar
                    MyWorld.nivelDoMar ++;
                }
        
            }
            else
                caiuNoMar = false;
        }
                
        
        public void elimina(){  // remove os objetos do mapa quando chegam ao fundo do mar e quando voltam para o ceu novamente
        if((getY()==0) || (getY() == getWorld().getHeight()-1))
        
        getWorld().removeObject(this);
        }
        
    }
    
