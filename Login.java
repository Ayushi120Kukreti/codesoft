
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class Login extends JFrame {

    //JButton rules, back;
    //JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
       

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizz/start_login.jpeg"));
        JLabel image = new JLabel(i1);  
       add(image);
         //setLayout(null);
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
}
    public static void main(String[] args) {
        new Login();
    }
}
