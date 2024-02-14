import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Signuppage implements ActionListener
{
JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1;
Connection con;
String na;

Signuppage()
{
con=null;
try{                                                   //database  connection
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1821");
}
catch(Exception e){
System.out.println(e);
}

f=new JFrame("Sign Up Page");

l1=new JLabel("STUDENT DETAILS");
l1.setFont(new Font("Times New Roman", Font.BOLD,28));
l2=new JLabel("Student Name:");
l3=new JLabel("Student ID:");

t1=new JTextField();
t2=new JTextField();

b1=new JButton("NEXT");
b1.addActionListener(this);
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);

l1.setBounds(200,20,400,40);
l2.setBounds(100,80,200,30);
l3.setBounds(100,130,200,30);

t1.setBounds(280,80,300,30);
t2.setBounds(280,130,300,30);

b1.setBounds(300,170,150,40);

f.add(l1);
f.add(l2);
f.add(l3);

f.add(t1);
f.add(t2);

f.add(b1);

f.setLayout(null);
f.setSize(650,400);
f.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1){
	Signinpage sipg =new Signinpage(na);
	f.setVisible(false); 
try
{
Statement st=con.createStatement();
String n=t1.getText();
String id=t2.getText();
String strcmd="insert into Stucourcereg values('"+n+"','"+id+"','"+null+"')";
int check=st.executeUpdate(strcmd);
if(check!=0)
System.out.println("Added Successfully");
else
System.out.println("Unable to add");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
