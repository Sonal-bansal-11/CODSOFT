import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GradeCalculator implements ActionListener{               
Frame f1;                       
Label l1,l3,l6,l8;
TextField t1;
Button b1,b2,b3;
int count=0;
double percentage=0;
String grade=null;
double total=0;

GradeCalculator(){
f1=new Frame("Bank Application");
f1.setSize(700,550);
f1.setVisible(true);
f1.setLayout(null);

l3=new Label("*/GRADE-CALCULATOR/*");
l3.setFont(new Font("Times New Roman", Font.BOLD,28));
l3.setForeground(Color.BLACK);
l3.setBounds(50,80,500,80);
f1.add(l3);
l1=new Label("ENTER MARKS:");
l1.setBounds(60,182,80,30);
f1.add(l1);
t1=new TextField();
t1.setBounds(180,185,300,30);
f1.add(t1);
b1=new Button("TOTAL");
b1.setBounds(180,370,130,30);
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
f1.add(b1);
b2=new Button("PERCENT");
b2.setBounds(350,370,130,30);
b2.setBackground(Color.BLUE);
b2.setForeground(Color.WHITE);
b2.addActionListener(this);
f1.add(b2);
b3=new Button("GRADE");
b3.setBounds(180,420,300,30);
b3.setBackground(Color.BLUE);
b3.setForeground(Color.WHITE);
b3.addActionListener(this);
f1.add(b3);

l8=new Label("YOUR RESULT WILL DISPLAY HERE");
l8.setForeground(Color.ORANGE);
l8.setFont(new Font("Times New Roman", Font.BOLD,16));
l8.setBounds(60,330,550,30);
f1.add(l8);
}

public void actionPerformed(ActionEvent ae)
{
double marks=Double.parseDouble(t1.getText());
if(ae.getSource()==b1)
  { 
   count=count+1;
   total=total+marks;
   l8.setText("Total marks is"+total);
  }
if(ae.getSource()==b2)
  {
   percentage=(total/(count*100))*100;
   l8.setText("Percentage is"+percentage);
  }
if(ae.getSource()==b3)
 { 
 if(percentage>90)
 grade="A";
 else if((percentage>85)&&(percentage<90))
 grade="B";
 else if((percentage>80)&&(percentage<85))
 grade="C";
 else if((percentage>70)&&(percentage<80))
 grade="D";
 else if((percentage>60)&&(percentage<70))
 grade="E";
 else if((percentage>50)&&(percentage<60))
 grade="F";
 l8.setText("grade is"+grade);
 }
}

public static void main(String ar[])
 {
  GradeCalculator gc=new GradeCalculator();
 }
}