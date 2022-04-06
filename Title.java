        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        
        public class Title extends World
        {
        
        public Title()
        {    
        super(1000, 700, 1); 
        Greenfoot.setSpeed(50);
        play();
        instrutions();
        prepare();
        }
        
        
        public void act(){
        
        }
        
        
        private void play(){
        Play play = new Play();
        addObject(play,481,325);
        }
        
        
        private void instrutions()
        {
        Instructions instructions = new Instructions();
        addObject(instructions,481,455);
        }
        
        
    private void prepare()
    {
        Musica musica = new Musica();
        addObject(musica,960,42);
    }
    }
