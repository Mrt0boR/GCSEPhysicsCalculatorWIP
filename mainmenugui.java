package Mainmenu;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;






 public class mainmenugui {
    public static void main(String args[]) {
    rungui init = new rungui();
    init.rungui();
    
    }
}

class rungui {
    public void rungui() {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.setSize(500, 500);   
            frame.setVisible(true);

    }
}




