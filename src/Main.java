import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setTitle("Morse Code Translator");
        frame.setLocation(550,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JLabel title = new JLabel("Morse Code Generator", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24)); // big & bold
        frame.add(title, BorderLayout.NORTH);


        JLabel enterText = new JLabel("Enter the text:");
        enterText.setFont(new Font("Arial", Font.PLAIN, 16));
        enterText.setBounds(30, 60, 150, 25);
        frame.add(enterText);

        // Input box
        JTextField inputField = new JTextField();
        inputField.setBounds(30, 90, 330, 30);
        frame.add(inputField);
    }
}
