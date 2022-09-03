
package chatting.application;

import java.awt.Color;
import javax.swing.*;

public class Server extends JFrame{

     Server() {
         
         setLayout(null);
         JPanel p1= new JPanel();
         p1.setBackground(new Color(7,94,84));
         p1.setBounds(0, 0, 450, 70);
         
         add(p1);
         
         setSize(450,700);
         setLocation(200, 50);
         setVisible(true);
         getContentPane().setBackground(Color.WHITE);
    }
    
    
    
    public static void main(String[] args) {
         new Server();
         
    }
    
    
}
