import javax.swing.*;
import java.awt.*;
public class Gamepanel extends JPanel implements Runnable{
    Thread thread;
    Enemy enemy=new Enemy();
    Gamepanel()
    {
        super();
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.BLACK);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        enemy.paintComponent(g);
    }
    public void startgame()
    {
        thread=new Thread(this);
        thread.start();
    }
    public void update()
    {
        enemy.update();
    }
    @Override
    public void run() 
    {
        double drawInterval=1000000000/60;
        double deltatime=0;
        long lastpassedtime=System.nanoTime();
        long currenttime=0;
        while (thread !=null)
        {
           currenttime=System.nanoTime();
           deltatime+=(currenttime-lastpassedtime)/drawInterval;
           lastpassedtime=currenttime;
           if(deltatime>=1)
           {
            update();
            repaint();
            deltatime--;
           }
        }
    }
}
