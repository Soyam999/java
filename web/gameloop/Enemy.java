import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
public class Enemy extends JPanel{
    Random random= new Random();
    int x=random.nextInt(500);
    int y=0;
    Image image;
    Enemy()
    {
        try
        {
            image= ImageIO.read(new File("./Asteroid.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
        
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawImage(image, x, y, 100,100 ,this);
    }
    public void update()
    {
        y=y+1;
    }
}
