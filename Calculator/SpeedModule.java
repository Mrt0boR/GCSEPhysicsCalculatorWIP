package Calculator;
import javax.swing.*;
import java.awwt.*;
import java.awt.event.*;

public class SpeedModule implements ActionListener {
    
    // textfields are made global variables to allow the button actionEvent method to pull their text
    JTextField distanceField = new JTextField(10);
    JTextField timeField = new JTextField(10);
    JTextField resultField = new JTextField(5);

    // constructor - good practice to include rather than loading up the main method
    public SpeedModule() {
        GUISetup();
    }

    public String calculate(String distanceString, String timeString) {
        double distance = Double.parseDouble(distanceString);
        double time = Double.parseDouble(timeString);
        double speed = distance/time;
        return Double.toString(speed);
    }

    public void GUISetup() {
        JFrame frame = new JFrame("Speed");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());

        //Jcomponents (incl gridbagcontraints)
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(distanceField, gbc);

        JLabel distanceLabel = new JLabel("Distance: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(distanceLabel, gbc);

        gbc.gridx = 1; 
        gbc.gridy = 1;
        panel.add(timeField, gbc);

        JLabel timeLabel = new JLabel("Time: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(timeLabel, gbc);

        //add button to perform calculation
        JButton calculateButton = new JButton("Calculate");
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(calculateButton, gbc);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent calculatePressed) {
                String distanceString = distanceField.getText();
                String timeString = timeField.getText();
                try{
                    String resultString = calculate(distanceString, timeString);
                    resultField.setText(resultString);
                } catch (NumberFormatException exeception) {
                resultField.setText("Invalid Input");
                }
            }
        });

        //add output field
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(resultField, gbc);

        JLabel resultLabel = new JLabel("Result: ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(resultLabel, gbc);

        JButton exitButton = new JButton("Exit");
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weighty = 0.1;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel.add(exitButton, gbc);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent exitPressed) {
                //Close the JFrame when the exit on JMenu item is clicked
                frame.dispose();
            }
        });

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new SpeedModule();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}