package Mainmenu;
import java.awt.*;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
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
            GridBagConstraints gbcmain = new GridBagConstraints();
            
            //Menu Label
            JLabel welcomemess = new JLabel("Welcome to Velocity");
            
            //Label styling
            welcomemess.setFont(new Font("Times New Roman", Font.BOLD, 16));
            welcomemess.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            //label placement
            gbcmain.gridx = 21;
            gbcmain.gridy = 37;
            panel.add(welcomemess,gbcmain);

            //Taskbar

            JMenuBar menubar = new JMenuBar();

            //New JMenu
            JMenu fileMenu = new JMenu("File");
            
            //new MenuItems
            JMenuItem exititem = new JMenuItem("Exit");
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




