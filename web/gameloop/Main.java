import javax.swing.*;

class Main
{
    public static void main(String[] args) {
        JFrame f= new JFrame("FPS control loop");
        Gamepanel g=new Gamepanel();
        g.startgame();
        f.add(g);
        f.setVisible(true);
        //f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setResizable(false);
    }
}