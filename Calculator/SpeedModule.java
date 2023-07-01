package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpeedModule implements ActionListener {

    public SpeedModule() {
    }

    public static String calculate(String distanceString, String timeString) {
        double distance = Double.parseDouble(distanceString);
        double time = Double.parseDouble(timeString);
        double speed = distance/time;
        return Double.toString(speed);
    }

    public static void pageSwitch() {
        JTextField distanceField = new JTextField(10);
        JTextField timeField = new JTextField(10);
        JTextField resultField = new JTextField(5);
        JPanel speedPanel = new JPanel(new GridBagLayout());

        //Jcomponents (incl gridbagcontraints)
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        speedPanel.add(distanceField, gbc);

        JLabel distanceLabel = new JLabel("Distance: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        speedPanel.add(distanceLabel, gbc);

        gbc.gridx = 1; 
        gbc.gridy = 1;
        speedPanel.add(timeField, gbc);

        JLabel timeLabel = new JLabel("Time: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        speedPanel.add(timeLabel, gbc);

        //add button to perform calculation
        JButton calculateButton = new JButton("Calculate");
        gbc.gridx = 1;
        gbc.gridy = 2;
        speedPanel.add(calculateButton, gbc);
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
        speedPanel.add(resultField, gbc);

        JLabel resultLabel = new JLabel("Result: ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        speedPanel.add(resultLabel, gbc);

        JButton exitButton = new JButton("Exit");
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weighty = 0.1;
        gbc.anchor = GridBagConstraints.SOUTH;
        speedPanel.add(exitButton, gbc);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent exitPressed) {
                //Close the JFrame when the exit on JMenu item is clicked
                MainMenu.frame.remove(speedPanel);
                MainMenu.pageSwitch();
            }
        });

        MainMenu.frame.add(speedPanel);
        MainMenu.frame.setSize(300, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}