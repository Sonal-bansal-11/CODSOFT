import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Courcereg implements ActionListener{                
Connection con=null;
Frame f1;                       
Label l1,l2,l3,l6;
TextField t1,t2;
Button b1,b3;

Courcereg(){
try{                                                   
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1821");
}
catch(Exception e){
System.out.println(e);
}

f1=new Frame("Cource Registration App");
f1.setSize(700,550);
f1.setVisible(true);
f1.setLayout(null);

l3=new Label("**Cource Registration App**");
l3.setFont(new Font("Times New Roman", Font.BOLD,28));
l3.setForeground(Color.BLACK);
l3.setBounds(50,80,500,80);
f1.add(l3);

l1=new Label("STUDENTNAME:");
l1.setBounds(60,182,80,80);
f1.add(l1);

l2=new Label("STUDENTID:");
l2.setBounds(60,262,80,28);
f1.add(l2);

t1=new TextField();
t1.setBounds(180,185,300,30);
f1.add(t1);

t2=new TextField();
t2.setBounds(180,265,300,30);
f1.add(t2);

b1=new Button("SIGN IN");
b1.setBounds(180,370,130,30);
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
f1.add(b1);

b3=new Button("SIGN UP");
b3.setBounds(180,420,130,30);
b3.setBackground(Color.BLUE);
b3.setForeground(Color.WHITE);
b3.addActionListener(this);
f1.add(b3);
}

public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b1){
try{
 String na=t1.getText();
 String id=t2.getText();
 Statement st=con.createStatement();
 String cmd="select * from Stucourcereg where STUDENTNAME='"+na+"'";
 ResultSet rs=st.executeQuery(cmd);
 while(rs.next()){
	if(rs.getString(1).equals(na) && rs.getString(2).equals(id)){
               Signinpage sip=new Signinpage(na);
	       f1.setVisible(false);}
  }
}
catch(Exception ex){
System.out.println(ex);
}
}
else if(ae.getSource()==b3){
	Signuppage sup=new Signuppage();
	f1.setVisible(false);}
}

public static void main(String ar[])
 {
  Courcereg app=new Courcereg();
 }
}