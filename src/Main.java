import javax.swing.*;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Morse Code Generator");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());

        JLabel j1 = new JLabel("Enter the text");
        f.add(j1);
        JTextField t1 = new JTextField();
        f.add(t1);
        JButton  b1 = new JButton("Generate");
        f.add(b1);
    }
}
