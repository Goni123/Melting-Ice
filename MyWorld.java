        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        import java.lang.*;
        
        public class MyWorld extends World
        {
        SimpleTimer tempo = new SimpleTimer();
        static Counter  contador = new Counter();
        HealthBar healthbar = new HealthBar();
        HealthBar healthbar2 = new HealthBar();
        SeaLevelBar seaLevelBar = new SeaLevelBar();
        int start = 1;
        public  static int nivelDoMar;
        static public int score;
        public int indice;
        
        
        public MyWorld()
        {    
        super(1000, 700, 1);
        
        nivelDoMar = 0;
        
        healthBar();
        seaLevelBar();
        prepare();
        counter();
        tempo.mark();
        score=0; //igualar a zero, para quando der reset no programa score voltar ao inicio
        }
        
        
        private void acabaOJogo(){ //terminar o jogo
        if ((Player1.morreu==true && Player2.morreu == true) || nivelDoMar ==17)  {
        GameOver gameover = new GameOver(); //inicalização do mundo GameOver
        Greenfoot.setWorld(gameover);
        }
        }

        
        public void act(){
      
        indiceSpwan();
        
        if(Greenfoot.getRandomNumber(1000) <indice){
        Garrafa g = new Garrafa();
        addObject(g,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        if(Greenfoot.getRandomNumber(1000) <indice){
        Lixo l = new Lixo();
        addObject(l,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        if(Greenfoot.getRandomNumber(2500) <indice){
        Gases g = new Gases();
        addObject(g,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        if(Greenfoot.getRandomNumber(2500) <indice){
        Petroleo p = new Petroleo();
        addObject(p,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        if(Greenfoot.getRandomNumber(10000) <indice){
        Reciclagem rr = new Reciclagem();
        addObject(rr,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        if(Greenfoot.getRandomNumber(10000) <indice){
        Rede r = new Rede();
        addObject(r,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        if(Greenfoot.getRandomNumber(10000) <indice){
        Eco e = new Eco();
        addObject(e,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        if(Greenfoot.getRandomNumber(10000) <indice){
        Peixe px = new Peixe();
        addObject(px,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        if(Greenfoot.getRandomNumber(10000) <indice){
        Agua ag = new Agua();
        addObject(ag,Greenfoot.getRandomNumber(getWidth()-20)+10,20); // -20 para garantir que nao aparecem enimigos junto à parede da direita
        // +10 para garantir que nao aparecem junto à parede esquerda
        }
        
        
        if(start == 1){
        contador.setValue(tempo.millisElapsed()/1000); //retorna os milisecundos que passaram desde que o tempo começou a marcar, depois divides por 1000 para converter em segundos  
        }

         acabaOJogo();
        }
       
        
        private void prepare()
        {
        Mar mar = new Mar();
        addObject(mar,500,686);
        Player1 player1 = new Player1();
        addObject(player1,143,658);
        Player2 player2 = new Player2();
        addObject(player2,804,658); 
        }
        
        
        public void indiceSpwan(){
        int num = contador.getValue();
        if(num <=100){
        indice =4;
        }
        else if (num>100 && num <=200 ){
        indice =6;
        }
        else if(num>200 && num<=300){
        indice=8;
        }
        }
        
        
        public void healthBar()
        {
        addObject(healthbar,50,30);
        showText(NomePlayer1.nomeplayer1,50,30);
        addObject(healthbar2,getWidth()-50,30);
        showText(NomePlayer2.nomeplayer2,getWidth()-50,30);
        }
        
        
        public  HealthBar getHealthBar(){
        return healthbar;
        }
        
        
        public HealthBar getHealthBar2(){
        return healthbar2;
        }
        
           
        public void seaLevelBar(){
        addObject(seaLevelBar, (getWidth()/2)-80, 50);
        }
        
        
        public SeaLevelBar getSeaLevelBar(){
        return seaLevelBar;
        }
        
        
        private void counter()
        {
        addObject(contador,getWidth()/2,50);
        tempo.mark(); //tempo começa a marcar
        }
        
        
        public void somaPontos(int pts){
        score = score + pts; //atualização do score com o parametro que recebe
        showText("SCORE: "+ score, getWidth()/2, 95);
        }
    }
    
