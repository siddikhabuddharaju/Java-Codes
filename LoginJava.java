import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class Login extends Frame{
TextField t1,t2;
Button b1,b2;
Label l1,l2,l3,l4;
Login(){
setLayout(null);
l1 = new Label("LOGIN");
l1.setFont(new Font("Times new Roman",Font.BOLD,30));
l1.setForeground(Color.BLUE);
l1.setBounds(130,30,300,30);
add(l1);
t1 = new TextField(60);
t2 = new TextField(60);
b1 = new Button("SignIn");
b2 = new Button("SignUp");
t1.setBounds(100,70,120,30);
t2.setBounds(100,110,120,30);
b1.setBounds(120,150,80,30);
b2.setBounds(120,180,80,30);
l2 = new Label("");
l2.setBounds(250,80,300,30);
l3 = new Label("UserName");
l3.setBounds(20,60,70,30);
add(l3);
l4 = new Label("Password");
l4.setBounds(20,100,70,30);
add(l4);
add(l2);
add(t1);
add(t2);
add(b1);
add(b2);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
boolean match = false;
String uname = t1.getText().toString();
String pwd = t2.getText().toString();
try{
FileReader fr = new FileReader("login.txt");
BufferedReader br = new BufferedReader(fr);
String str;
while((str=br.readLine())!=null){
if(str.equals(uname+"\t"+pwd)){
match = true;
break;
}
}
fr.close();
}catch(Exception e){}
if(match){
JFrame f = new JFrame();
JOptionPane.showMessageDialog(f,"Logined Successfully");
dispose();
}
else{
l2.setText("Invalid Username or Password!!");
}
}
});
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
SignUp s = new SignUp();
s.setTitle("SignUP");
s.setVisible(true);
s.setBounds(200,200,200,200);
}

});
}
}
class SignUp extends Frame{
TextField t1,t2;
Label l3,l4;
Button b1;
SignUp(){
setLayout(null);
t1 = new TextField(60);
t2 = new TextField(60);
b1 = new Button("Submit");
t1.setBounds(100,30,80,30);
t2.setBounds(100,70,80,30);
l3 = new Label("UserName");
l3.setBounds(20,30,70,30);
add(l3);
l4 = new Label("Password");
l4.setBounds(20,70,70,30);
add(l4);
b1.setBounds(100,110,80,30);
add(t1);
add(t2);
add(b1);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
try{
FileWriter fw = new FileWriter("login.txt",true);
fw.write(t1.getText()+"\t"+t2.getText()+"\n");
fw.close();
JFrame f = new JFrame();
JOptionPane.showMessageDialog(f,"Registration Completed");
dispose();
}catch(Exception e){}
}
});
}
}
public class LoginJava {
public static void main(String[] args){
Login l = new Login();
l.setBounds(400,200,400,300);
l.setVisible(true);
}
}
