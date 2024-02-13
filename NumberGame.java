import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NumberGame implements ActionListener{               
Frame f1;                       
Label l1,l2,l3,l4,l5,l6,l8;
TextField t1;
Button b1;
int rand=(int) (Math.random()*100);
int count=0;

NumberGame(){
f1=new Frame("GuessNumber Application");
f1.setSize(700,550);
f1.setVisible(true);
f1.setLayout(null);

l3=new Label("//GUESS NUMBER GAME//");
l3.setFont(new Font("Times New Roman", Font.BOLD,28));
l3.setForeground(Color.BLACK);
l3.setBounds(50,80,500,80);
f1.add(l3);
l1=new Label("ENTER NO:");
l1.setBounds(60,182,80,30);
f1.add(l1);
l2=new Label("ATTEMPTS:");
l2.setBounds(60,262,80,35);
f1.add(l2);
l4=new Label("(b/w 1-100)");
l4.setBounds(60,190,85,20);
f1.add(l4);
t1=new TextField();
t1.setBounds(180,185,300,30);
f1.add(t1);
l5=new Label();
l5.setBounds(180,265,300,30);
f1.add(l5);
b1=new Button("GUESS");
b1.setBounds(180,370,130,30);
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
f1.add(b1);

l8=new Label("Output");
l8.setForeground(Color.ORANGE);
l8.setFont(new Font("Times New Roman", Font.BOLD,16));
l8.setBounds(60,330,550,30);
f1.add(l8);
}

public void actionPerformed(ActionEvent ae)
{
 int a=Integer.parseInt(t1.getText());
 count=count+1;
 if(a>rand)
  {
   l8.setText(a+"is too high");
  }
 else if(a<rand)
  {
   l8.setText(a+"is too low");
  }
 else
  {
   l8.setText("Correct you win!!");
  }
 l5.setText(count+"chances taken");
}

public static void main(String ar[])
 {
  NumberGame ng=new NumberGame();
 }
}
