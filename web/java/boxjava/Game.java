import javax.swing.*;

class Game
{
    public static void main(String[] args) 
    {
        Box b=new Box();
        JFrame f=new JFrame("box");
        f.add(b);
        f.setVisible(true);
        f.setSize(500,500);
    }
}

