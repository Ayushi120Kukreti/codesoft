import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Rules extends JFrame implements ActionListener
{
String name;
JButton start,back;
Rules(String name)
{
this.name=name;
getContentPane().setBackground(Color.WHITE);
JLabel heading=new JLabel("WELCOME"+name+"TO JAVA BLOW");
heading.setBounds(50,20,700,30);
heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
heading.setForeground(Color.BLUE);
add(heading);
JLabel rules=new JLabel();
rules.setBounds(20,90,700,350);
rules.setFont(new Font("Tahoma",Font.PLAIN,16));
//rules.setForeground(Color.BLUE);
rules.setText
(
"<htlm>"+
"1.Answer to the point"+"<br><br>"+
"2.learn basics of java "+"<br><br>"+
"3.do not copy its just a sample"+"<br><br>"+
"4.no related questions will be comming in exam"+"<br><br>"+
"LEARN WITH US AND EXPLORE LETS KILL AND SLOTTER THE EXAM TOGETHER  "+"<br><br>"+
"<html>"
);
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
start= new JButton("START");
start.setBounds(735,270,120,25);
start.setForeground(Color.WHITE);
//rules.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
start.setBackground(Color.BLACK);
//click botton implementation
start.addActionListener(this);
add(start);


setLayout(null);
setSize(800,650);
setLocation(300,150);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==start)
{
}
else
{
setVisible(false);
new Login();
}
}
public static void main(String args[]){
new Rules("USER");
}
}