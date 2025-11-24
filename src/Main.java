import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Morse Code Generator");
        frame.setSize(400, 250);
        frame.setLayout(null);

        // Title at top center
        JLabel title = new JLabel("Morse Code Generator", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(0, 10, 400, 30);
        frame.add(title);

        // Label: Enter the text
        JLabel enterText = new JLabel("Enter the text:");
        enterText.setFont(new Font("Arial", Font.PLAIN, 16));
        enterText.setBounds(30, 60, 150, 25);
        frame.add(enterText);

        // Input box
        JTextField inputField = new JTextField();
        inputField.setBounds(30, 90, 330, 30);
        frame.add(inputField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
