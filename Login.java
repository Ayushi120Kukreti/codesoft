import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
JButton rules,back;
JTextField tfame;
Login()
{
getContentPane().setBackground(Color.WHITE); //colour of bottom frame
setLayout(null);
ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("quizz\start_login.jpg"));
JLabel image=new JLabel(i);
image.setBounds(0,0,600,500);
add(image);
JLabel heading=new JLabel("java blow");
heading.setBounds(810,150,300,25);
heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
heading.setForeground(Color.BLUE);
add(heading);
//colour class object
//heading.setForeground(new Color(30,144,254));
JLabel name=new JLabel("ENTER NAME");
name.setBounds(750,60,300,45);
name.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
name.setForeground(Color.BLACK);

add(name);
 tfame = new JTextField();
tfame.setBounds(735,200,300,25);
tfame.setFont(new Font("Times New Roman",Font.BOLD,20));
add(tfame);
//RULES
//JButton rules= new JButton("RULES");
rules= new JButton("RULES");
rules.setBounds(735,270,120,25);
rules.setForeground(Color.WHITE);
//rules.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
rules.setBackground(Color.BLACK);
//click botton implementation
rules.addActionListener(this);
add(rules);
//JButton back= new JButton("BACK");
back= new JButton("BACK");
back.setBounds(915,270,120,25);
back.setForeground(Color.WHITE);
//rules.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
back.setBackground(Color.BLACK);
//click botton implementation
back.addActionListener(this);
add(back);

setSize(1200,500);  //increasing size of frame
setLocation(200,150);  //setting location on the center
setVisible(true);  //frame to be visible bydefault hidden
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==rules)
{
String name=tfame.getText();
setVisible(false);
new Rules(name);
}
else if (ae.getSource()==back)
{
String name=tfame.getText();
setVisible(false);
}
}
public static void main(String args[])
{
new Login();

}
} 