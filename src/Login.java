import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2;
    JTextField tf;
    JButton btn;
    JPasswordField p;
    JPanel panel;

    public Login() {
        label1 = new JLabel("Username:");
        tf = new JTextField();
        label2 = new JLabel("Password:");
        p = new JPasswordField();
        btn = new JButton("Login");
        panel = new JPanel(new GridLayout(3, 2));
        panel.add(label1);
        panel.add(tf);
        panel.add(label2);
        panel.add(p);
        panel.add(new JLabel()); // Placeholder for alignment
        panel.add(btn);
        add(panel);
        
        btn.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        pack(); // Auto size the frame
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String uname = tf.getText();
        String pass = new String(p.getPassword());
        if (uname.equals("Quiz") && pass.equals("1234")) {
            // Replace "your_username" and "your_password" with actual login credentials
            Quiz quiz = new Quiz();
            dispose(); // Close the login window
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
