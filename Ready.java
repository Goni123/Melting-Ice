        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        import javax.swing.JOptionPane ; // classes para poder chamar a label para o utilizador introduzir o nome
        import javax.swing.JInternalFrame;
        
        public class Ready extends Butoes
        {
        public void act() 
        {
        readybutton();
        butaoefect();
        }   
        
        
        public void readybutton(){
        if(Greenfoot.mouseClicked(this)){
        if(ChoosePlayer.player1 == null || ChoosePlayer.player2 == null) //se o utilizador nao escolher um dos penguins
        {
        JOptionPane.showMessageDialog(new JInternalFrame(), "Choose a penguin for each player.","ATTENTION", JOptionPane.INFORMATION_MESSAGE);  
        }
        else if (ChoosePlayer.player1 == ChoosePlayer.player2) //se os dois pinguins forem iguais
        {
        JOptionPane.showMessageDialog(new JInternalFrame(), "You cannot choose the same penguin for both players. Choose the penguins again for both players","ATTENTION", JOptionPane.INFORMATION_MESSAGE);
        ChoosePlayer.player1 = null; //pede para voltar a escolher
        ChoosePlayer.player2 = null;
        }
        else if(NomePlayer1.nomeplayer1 == null || NomePlayer2.nomeplayer2 == null) // se o utilizador não escolher um dos nomes
        {
        JOptionPane.showMessageDialog(new JInternalFrame(), "Choose a name for your player.","ATTENTION", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (NomePlayer1.nomeplayer1 .equals( NomePlayer2.nomeplayer2)) // se o utilizador escolher dois nomes iguais
        {
        JOptionPane.showMessageDialog(new JInternalFrame(), "You cannot choose the same name for both players.","ATTENTION", JOptionPane.INFORMATION_MESSAGE);
        NomePlayer1.nomeplayer1 = null; 
        NomePlayer2.nomeplayer2 = null;
        getWorld().showText("",315,500);
         getWorld().showText("",687,500);
        }
        else 
        {
        MyWorld ready = new MyWorld(); //inicalização do mundo principal
        Greenfoot.setWorld(ready);     
        getWorld().addObject(new Player2(), 804,658);
        getWorld().addObject(new Player1(), 143,658);
        }   
        }
        }
        
      
    }
