import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Signinpage implements ActionListener{
  JFrame f1;
  JLabel l1,l2,l3;
  JButton b1,b2;
  JComboBox cb;
  Signinpage(String name)
 {
   f1=new JFrame("Signed In Page");
   f1.setSize(800,700);
   f1.setVisible(true);
   f1.setLayout(null);

   l1=new JLabel("WELCOME TO YOUR PROFILE");
   l1.setFont(new Font("Times New Roman", Font.BOLD,26));
   l1.setForeground(Color.RED);
   l1.setBounds(150,50,400,70);
   f1.add(l1);

   l2=new JLabel(name);
   l2.setFont(new Font("Times New Roman", Font.BOLD,20));
   l2.setForeground(Color.BLUE);
   l2.setBounds(50,140,80,40);

   l3=new JLabel("Please Select Your Choice");
   l3.setFont(new Font("Times New Roman", Font.BOLD,22));
   l3.setForeground(Color.GREEN);
   l3.setBounds(60,200,500,50);
   f1.add(l3);
   
   String cources[]={"BAS303:MATHS 4","BVE301:UHV","BCS301:DS","BCS302:COA","BCS301:DSTL"};
   cb=new JComboBox(cources);
   cb.setBounds(500,300,150,30);
   f1.add(cb);

   b1=new JButton("Add Cources");
   b1.setBounds(60,280,250,50);
   b1.setBackground(Color.BLACK);
   b1.setForeground(Color.WHITE);
   b1.addActionListener(this);
   f1.add(b1);

   b2=new JButton("Remove Cources");
   b2.setBounds(60,350,250,50);
   b2.setBackground(Color.BLACK);
   b2.setForeground(Color.WHITE);
   b2.addActionListener(this);
   f1.add(b2);
 }

public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b1){
Addcource ac=new Addcource();}

else if(ae.getSource()==b2){
Removecource rc=new Removecource();}
}
}
