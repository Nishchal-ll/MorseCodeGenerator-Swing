import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.*;

public static void main(){
    JFrame frame = new JFrame("Morse Code Converter");
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    JLabel inputLabel = new JLabel("Enter Text:");
    inputLabel.setBounds(20, 20, 100, 25);
    frame.add(inputLabel);

    JTextField inputField = new JTextField();
    inputField.setBounds(120, 20, 200, 25);
    frame.add(inputField);

    JButton convertButton = new JButton("Convert");
    convertButton.setBounds(120, 60, 100, 30);
    frame.add(convertButton);

    JLabel outputLabel = new JLabel("Morse Code:");
    outputLabel.setBounds(20, 100, 350, 25);
    frame.add(outputLabel);

    HashMap<Character, String> morseMap = new HashMap<>();
    morseMap.put('A', ".-"); morseMap.put('B', "-..."); morseMap.put('C', "-.-.");
    morseMap.put('D', "-.."); morseMap.put('E', "."); morseMap.put('F', "..-.");
    morseMap.put('G', "--."); morseMap.put('H', "...."); morseMap.put('I', "..");
    morseMap.put('J', ".---"); morseMap.put('K', "-.-"); morseMap.put('L', ".-..");
    morseMap.put('M', "--"); morseMap.put('N', "-."); morseMap.put('O', "---");
    morseMap.put('P', ".--."); morseMap.put('Q', "--.-"); morseMap.put('R', ".-.");
    morseMap.put('S', "..."); morseMap.put('T', "-"); morseMap.put('U', "..-");
    morseMap.put('V', "...-"); morseMap.put('W', ".--"); morseMap.put('X', "-..-");
    morseMap.put('Y', "-.--"); morseMap.put('Z', "--..");
    morseMap.put('0', "-----"); morseMap.put('1', ".----"); morseMap.put('2', "..---");
    morseMap.put('3', "...--"); morseMap.put('4', "....-"); morseMap.put('5', ".....");
    morseMap.put('6', "-...."); morseMap.put('7', "--..."); morseMap.put('8', "---..");
    morseMap.put('9', "----."); morseMap.put(' ', "/");

    convertButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String morse="";
String input=inputField.getText().toUpperCase();
            for(int i=0;i<input.length();i++){
                char c = input.charAt(i);
                if(morseMap.containsKey(c)){
                    morse=morse+morseMap.get(c)+"";
                }
                else{
                    morse=morse+"?";
                }
            }
            outputLabel.setText("Morse Code:"+ morse);
        }
    });

    frame.setVisible(true);
}