        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        public class Mar extends Actor
        {
        private GreenfootImage[] images=new GreenfootImage[22];
        private int conta = 0;
        
        public Mar()
        {
        for(int i =0;i<images.length;i++){ //guardar as imagens num array
        images[i]=new GreenfootImage("Mar/Mar"+i+".png");
        }
        
        }
        
        public void act() 
        {
        
        setImage(images[MyWorld.nivelDoMar]); //mudança de imagem do mar,relativamente ao nivel do mudar que é o indice do array
        
        }    
    }
