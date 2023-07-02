package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu implements ActionListener {

    public static JFrame frame = new JFrame("Calculator");
    // constructor - good practice to include rather than loading up the main method
    public MainMenu() {
        pageSwitch();
    }

    public static void pageSwitch() {
        JPanel panel = new JPanel(new GridBagLayout());
        Color backgroundcustomcolour = new Color(198,198,198);
        panel.setBackground(backgroundcustomcolour);
        //panel styling

        //Jcomponents (incl gridbagcontraints)
        GridBagConstraints gbc = new GridBagConstraints();

        //Menu Label
        JLabel welcomemess = new JLabel("Welcome to Velocity");

        //Label styling
        welcomemess.setFont(new Font("Times New Roman", Font.BOLD, 16));
        welcomemess.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //label placement
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weighty = 1;
        panel.add(welcomemess,gbc);

        //Taskbar
        JMenuBar menubar = new JMenuBar();

        //New JMenu
        JMenu fileMenu = new JMenu("File");

        //new MenuItems
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent exitPressed) {
                //Close the JFrame when the exit on JMenu item is clicked
                System.exit(0);
            }
        });

        menubar.add(fileMenu);
        fileMenu.add(exitItem);

        JButton speedModuleButton = new JButton("Speed");
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(speedModuleButton, gbc);
        
        speedModuleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent speedModulePressed) {
                //Close the JFrame when the exit on JMenu item is clicked
                frame.remove(panel);
                SpeedModule.pageSwitch();
            }
        });

        //frame and panel combination and JFrame parameters
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menubar);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new MainMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}