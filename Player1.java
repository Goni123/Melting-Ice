        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        public class Player1 extends Actor
        {
        private GreenfootImage[] imagesMovimentoDireita=new GreenfootImage[6]; //array para imagens da direita
        private GreenfootImage[] imagesMovimentoEsquerda=new GreenfootImage[6]; //array para imagens da esquerda
        int i = 0;
        boolean baterArmadilhas = false;
        boolean baterArmadilhas2 = false;
        boolean baterArmadilhas3 = false;
        public static int velocidade;
        
        public Player1(){
        setImage(ChoosePlayer.player1+"D0.png"); // Define a imagem inicial ao ser criado o player
        velocidade = 5; 
        
        for(int i =0;i<imagesMovimentoDireita.length;i++){ //colocação das imagens no array
        imagesMovimentoDireita[i]=new GreenfootImage(ChoosePlayer.player1+"D"+i+".png");
        }  
        
        for(int i =0;i<imagesMovimentoEsquerda.length;i++){
        imagesMovimentoEsquerda[i]=new GreenfootImage(ChoosePlayer.player1+"E"+i+".png");
        }
        }
        
        
        private void removeEfeitoRede(){
        
        if (MyWorld.contador.getValue() > Rede.tempoEfeitoRede1 && Rede.tempoEfeitoRede1 != 0 ) 
        {
        velocidade = 5;
        Rede.tempoEfeitoRede1 = 0; // coloca a 0 para que só execute a condição quando estiver com o tempo de efeito ativo,
        // caso contrário iria estar sempre a colocar a velocidade a 5 quando apanhasse uma reciclagem
        }
        }
        
        
        private void removeEfeitoReciclagem(){  // 
        
        if (MyWorld.contador.getValue() > Reciclagem.tempoEfeitoReciclagem1 && Reciclagem.tempoEfeitoReciclagem1 != 0) 
        {
        velocidade = 5; 
        Reciclagem.tempoEfeitoReciclagem1 = 0;// coloca a 0 para que só execute a condição quando estiver com o tempo de efeito ativo,
        // caso contrário iria estar sempre a colocar a velocidade a 5 quando apanhasse uma rede
        }
        }
        
        
        public void controlos(){
        // morreu==false nas condições, para que não seja permitido mover o pinguim depois de morrer e enquanto vai para o ceu
        
        if(Greenfoot.isKeyDown("A") && morreu==false){  
        setLocation(getX()-velocidade, getY());
        if (i==6) i=0;
        
        setImage(imagesMovimentoEsquerda[i]); //mudança de imagens consoante a direção que anda
        i++;
        }
        
        if(Greenfoot.isKeyDown("D") && morreu==false){
        setLocation(getX()+velocidade, getY());
        if (i==6) i=0;
        setImage(imagesMovimentoDireita[i]);
        i++;
        
        }
        }
        
        
        public void baterNasArmadilhas(){  // remove a vida do player1 quanto toca no petroleo e adiciona -20 pontos
        if((isTouching(Petroleo.class) && baterArmadilhas ==false)){ //se tocar no petroleo e a verificação estiver falsa(ainda não tocou)
        MyWorld myWorld = (MyWorld)getWorld(); //criação da variavel do tipo mundo
        HealthBar healthbar = myWorld.getHealthBar(); //chamada do metodo do mundo
        healthbar.vida--; //redução na vida
        getWorldOfType(MyWorld.class).somaPontos(-20); //adicionar -20 pontos
        baterArmadilhas = true; //atualização da variavel
        
        }
        else if (!isTouching(Petroleo.class)){ //caso nao tenha tocado, continua a false a variavel de verificação
        baterArmadilhas = false;
        }
        
        }
        
        
        public void baterNasArmadilhas2(){   // remove a vida do player1 quanto toca nos gases  e adiciona -20 pontos
        if((isTouching(Gases.class) && baterArmadilhas2 ==false)){
        MyWorld myWorld = (MyWorld)getWorld();
        HealthBar healthbar = myWorld.getHealthBar();
        healthbar.vida--;
        getWorldOfType(MyWorld.class).somaPontos(-20);
        baterArmadilhas2 = true;
        }
        else if (!isTouching(Gases.class)){
        baterArmadilhas2 = false;
        }
        
        }
        
        
        private boolean tocaNoMar()  // retorna true caso o pinguim esteja a tocar no mar (usado depois para fazê-lo subir juntamente com o nivel do mar)
        {
        boolean toca = false;
        if (isTouching(Mar.class)) toca = true;   
        return toca;
        }
        
        public GreenfootImage imagem;
        
        
        private void removePinguim(){   // remove o pinguim do mapa, fazendo-o ir em direção ao céu conforme vai aumentando a transparência até desparecer
        
        if ( morreu==true){
        setLocation(getX(), getY()-1);
        
        imagem = getImage();
        
        int transparenciaAtual = imagem.getTransparency(); // transparência que tem
        if (transparenciaAtual < 20) // se for muito transparente
        getWorld().removeObject(this); // elimina o objeto
        else
        imagem.setTransparency(transparenciaAtual - 2); 
        }
        }
        
       static boolean  morreu = false;
        
        private void morreu(){
        MyWorld myWorld = (MyWorld)getWorld();
        HealthBar healthbar = myWorld.getHealthBar();
        if ( healthbar.vida == 0) morreu = true; //mudança da variavel morreu para true, caso tenha morrido o penguim
        }
        
        
        private void localizaPinguim(){
        if (MyWorld.nivelDoMar <=2 && morreu==false) setLocation(getX(),585); // se o mar ainda não tiver chegado ao cimo do gelo, faz com que a localização do pinguim seja no gelo e não junto ao mar
        else    // morreu==false nas condições, para quando o pinguim morrer permitir fazer o efeito de ir para o ceu e não ficar sempre colado ao mar
        {
        if (tocaNoMar() == true && morreu==false) while (tocaNoMar() == true) setLocation(getX(), getY()-1); // faz o pinguim subir quando o mar sobe
        if (tocaNoMar() == false && morreu==false)  while (tocaNoMar() == false) setLocation(getX(), getY()+1);  // faz o pinguim descer quando o mar desce
        } 
        }
        
        
        public void act() 
        {
        morreu();
        
        removeEfeitoRede();
        removeEfeitoReciclagem();
        controlos();
        baterNasArmadilhas();
        baterNasArmadilhas2();
        localizaPinguim();
       
        removePinguim();
        }    
    
    }
