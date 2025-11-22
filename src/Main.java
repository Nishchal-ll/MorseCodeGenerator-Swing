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

        JTextField inputField = new JTextField();
        inputField.setBounds(50, 30, 200, 30);
        frame.add(inputField);
    }
}
