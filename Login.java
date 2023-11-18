import javax.swing.*;
import java.awt.*;
public class Login extends JFrame 
{
Login()
{
getContentPane().setBackground(Color.WHITE); //colour of bottom frame
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("C:\Users\Dell\Desktop\quizapplication\quizz\start_login.jpeg"));
JLabel image=new JLabel(i1);
add(i1);

setSize(1200,500);  //increasing size of frame
setLocation(200,150);  //setting location on the center
setVisible(true);  //frame to be visible bydefault hidden
}
public static void main(String args[])
{
new Login();
}
}