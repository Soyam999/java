import java.awt.*;
import javax.swing.*;

public class Login 
{
    public static void main(String[] args) 
    {
        JFrame F=new JFrame("login");
        JButton b1=new JButton("button1");
        JButton b2=new JButton("button2");
        JButton b3=new JButton("button3");
        JButton b4=new JButton("button4");
        F.add(b1);
        F.add(b2);
        F.add(b3);
        F.add(b4);
        F.setLayout(new FlowLayout(FlowLayout.LEFT,50,20));
        F.setSize(400,400);
        F.setVisible(true);
        
    }

}