import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Registration extends Frame {
Label nameL, emailL, mobileL, regnoL, branchL;
TextField nameT, emailT, mobileT, regnoT;
Choice branch;
Button submit;
public Registration() {
setTitle("HACKATHON Registration Form");
setLayout(null);
nameL = new Label("Name:");
nameT = new TextField();
emailL = new Label("Email Id:");
emailT = new TextField();
mobileL = new Label("Phone:");
mobileT = new TextField();
regnoL = new Label("Regd No:");
regnoT = new TextField();
branchL = new Label("Department:");
branch = new Choice();
submit = new Button("Submit");
branch.add("SELECT YOUR BRANCH");
branch.add("CSE");
branch.add("IT");
branch.add("ECE");
branch.add("EEE");
branch.add("MECH");
branch.add("CIVIL");
branch.add("CHEM");
branch.add("DE");
nameL.setBounds(10,50,120,30);
emailL.setBounds(10,90,120,30);
mobileL.setBounds(10,130,120,30);
regnoL.setBounds(10,170,120,30);
branchL.setBounds(10,210,120,30);
nameT.setBounds(140,50,120,30);
emailT.setBounds(140,90,200,30);
mobileT.setBounds(140,130,120,30);
regnoT.setBounds(140,170,120,30);
branch.setBounds(140,210,200,30);

submit.setBounds(80,250,80,30);
add(nameL);
add(nameT);
add(emailL);
add(emailT);
add(mobileL);
add(mobileT);
add(regnoL);
add(regnoT);
add(branchL);
add(branch);
add(submit);
submit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(nameT.getText().toString().isEmpty()||emailT.getText().toString().isEmpty()||mobileT.getText().toString().isEmpty()||regnoT.getText().toString().isEmpty()||branch.getSelectedItem(
).toString().isEmpty()){
JOptionPane.showMessageDialog(null,"Please Fill all the Fields","ERROR",JOptionPane.ERROR_MESSAGE);
}else{
JFrame f = new JFrame();
JOptionPane.showMessageDialog(f,"Registration Completed");
dispose();
}
nameT.setText("");
emailT.setText("");
mobileT.setText("");
regnoT.setText("");
branch.select(0);
}
});
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
}
}
public class EventRegistrationForm{
public static void main(String[] args) {
Registration r =new Registration();
r.setVisible(true);
r.setSize(400, 400);
}
}
