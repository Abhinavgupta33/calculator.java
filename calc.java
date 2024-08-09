import java.awt.*;
import java.awt.event.*;

class abc implements ActionListener
{
int a,b,c;
String opt="";

Frame f;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bs,bd,be;
TextField t1;
abc()
{
f=new Frame("Login");
t1=new TextField();
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b0=new Button("0");
bp=new Button("+");
bm=new Button("*");
bs=new Button("-");
bd=new Button("/");
be=new Button("=");

f.setLayout(null);

t1.setBounds(30,50,180,20);
b1.setBounds(30,80,30,30);
b2.setBounds(80,80,30,30);
b3.setBounds(130,80,30,30);
b4.setBounds(180,80,30,30);
b5.setBounds(30,120,30,30);
b6.setBounds(80,120,30,30);
b7.setBounds(130,120,30,30);
b8.setBounds(180,120,30,30);
b9.setBounds(30,160,30,30);
b0.setBounds(80,160,30,30);
be.setBounds(130,160,80,30);
bp.setBounds(30,200,30,30);
bm.setBounds(80,200,30,30);
bs.setBounds(130,200,30,30);
bd.setBounds(180,200,30,30);

f.add(t1);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b0);
f.add(be);
f.add(bp);
f.add(bm);
f.add(bs);
f.add(bd);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bp.addActionListener(this);
bm.addActionListener(this);
bs.addActionListener(this);
bd.addActionListener(this);
be.addActionListener(this);

f.setSize(250,300);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s.equals("+"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="+";
}
else if(s.equals("-"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="-";
}
else if(s.equals("*"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="*";
}

else if(s.equals("/"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="/";
}
else if(s.equals("="))
{
b=Integer.parseInt(t1.getText());
if(opt.equals("+"))
{
c=a+b;
}
else if(opt.equals("-"))
{
c=a-b;
}
else if(opt.equals("*"))
{
c=a*b;
}
else if(opt.equals("/"))
{
c=a/b;
}

t1.setText(Integer.toString(c));
}
else  // means 0-9 digit
{
t1.setText( t1.getText()+s);
}
}
public static void main(String ar[])
{
abc  a1=new abc();
}
}
