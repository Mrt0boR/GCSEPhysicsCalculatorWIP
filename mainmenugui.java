package Mainmenu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;






 public class mainmenugui {
    public static void main(String args[]) {
    rungui init = new rungui();
    init.rungui();
    
    }
}

class rungui extends JFrame {
    public void rungui() {
            
            //frame and panel setup
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            Color backgroundcustomcolour = new Color(198,198,198);
            panel.setBackground(backgroundcustomcolour);
            //panel styling


            //layout setup -- constraints allows the gridx and y refs
            GridBagLayout mm = new GridBagLayout();
            GridBagConstraints welcomepanelgbc = new GridBagConstraints();
            
            //Menu Label
            JLabel welcomemess = new JLabel("Welcome to Velocity");
            
            //Label styling
            welcomemess.setFont(new Font("Times New Roman", Font.BOLD, 16));
            welcomemess.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            //label placement
            welcomepanelgbc.gridx = 0;
            welcomepanelgbc.gridy = 0;
            panel.add(welcomemess,welcomepanelgbc);

            //Enter button to take you to the Velocity app
            JButton enterv = new JButton("Enter Velocity", null);
            welcomepanelgbc.gridx = 0;
            welcomepanelgbc.gridy = 0;
            // need to find a way to make the button be horizontal to the panel, maybe im not using GBC properly?
            
            
            ActionListener appinit = new ActionListener() {
                
                public void actionPerformed(ActionEvent appinit) {
                    Mainmenu.Velocity.Velocity();
                
                }
            };
            
            enterv.addActionListener(appinit);
            panel.add(enterv);


            //Taskbar

            JMenuBar menubar = new JMenuBar();

            //New JMenu
            JMenu fileMenu = new JMenu("File");
            
            //new MenuItems and action listener for exit functionalitu from File/Exit
            JMenuItem exititem = new JMenuItem("Exit Velocity");
            exititem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent closegui) {
                    //Close the JFrame when the exit on JMenu item is clicked
                    System.exit(0);
                }
            });
 
            menubar.add(fileMenu);
            fileMenu.add(exititem);

            
            //frame and panel combination and JFrame parameters
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.setJMenuBar(menubar);
            frame.setSize(500, 500);   
            frame.setVisible(true);


    }
}




