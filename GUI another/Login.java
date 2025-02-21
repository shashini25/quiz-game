

package quiz.application1;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
   
    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
      JLabel image = new JLabel(i1);
      image.setBounds(0, 0, 480, 500);
        add(image);
        setSize(800, 500);
        setLocation(200, 200);
    setVisible(true);    
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
