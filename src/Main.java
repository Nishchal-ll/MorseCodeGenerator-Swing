import javax.swing.*;
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

       frame.getContentPane().setBackground(Color.white);

       JLabel label = new JLabel();
       label.setText("Morse Code Translator");
       label.setHorizontalTextPosition(SwingConstants.CENTER);
       label.setForeground(Color.black);
       frame.add(label);
       label.setHorizontalAlignment(SwingConstants.CENTER);
       label.setVerticalAlignment(SwingConstants.TOP);
        label.setFont(new Font("Arial", Font.BOLD, 36));
    }
}
