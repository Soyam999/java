import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Box extends JPanel {
    private Rectangle[] boxes = new Rectangle[1000];
    Random random=new Random();
    Box() {
        super();
        for (int i = 0; i < boxes.length; i++) {
            boxes[i]= new Rectangle(random.nextInt(500),random.nextInt(500),10,10);
        }
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        for (int i = 0; i < boxes.length; i++) 
        {
            g.fillRect(boxes[i].x, boxes[i].y, 10, 10);
        
        }
    }
}
