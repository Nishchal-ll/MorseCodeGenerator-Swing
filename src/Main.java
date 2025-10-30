import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setTitle("Morse Code Translator");
        frame.setLocation(550,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

       ImageIcon icon = new ImageIcon("icon.png");
       frame.setIconImage(icon.getImage());
       frame.getContentPane().setBackground(Color.black);

    }
}
