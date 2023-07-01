package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PreassureForceArea {

    JTextField distanceField = new JTextField(10);
    JTextField timeField = new JTextField(10);
    JTextField resultField = new JTextField(5);

    public PreassureForceArea() {
        GUISetup();
    }

    
    //      PREASSURE CALCULATION   //

    public String calculate(String forcestring, String areastring) {
        double forcestring = Double.parseDouble(forcestring);
        double areastring = Double.parseDouble(areastring);
        double pressure = forcestring/areastring;
        return Double.toString(pressure);
    }




    //      GUI SETUP FORMATTING    //
    public void GUISetup() {

        JFrame frame = new JFrame("Preassure");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel( new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //force label
        JLabel forcelabel = new JLabel("Force Value :");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(forcelabel, gbc);
        

        //area label
        JLabel arealabel = new JLabel("Area :");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(arealabel, gbc);



       
        

        //  CALCULATION BUTTON  //


        
        
        //output field



        //panel to frame, framesize and visibility
        frame.getContentPane().add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);




    }


public static void main(String[] args){
    new PreassureForceArea();
}










}

//git pull git add .  git commit git push