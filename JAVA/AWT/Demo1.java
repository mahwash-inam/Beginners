import java.awt.*;

class Demo1
{
Frame f;
TextField tf;
Label l;
Button b;
Demo1(String s)
{
 f=new Frame();
 l=new Label("Enter the  number");
 l.setBounds(40,40,120,20);
 f.add(l);
 tf= new TextField();
 tf.setBounds(200,40,100,20);
 f.add(tf);
 b=new Button("Ok");
 b.setBounds(40,100,50,50);
 f.add(b);
 
 Toolkit t= f.getToolkit();
 Dimension ScreenSize=t.getScreenSize();
 int width= ScreenSize.width*8/10;
 int height= ScreenSize.height*8/10;
 f.setBounds(width/8, height/8, width, height);
 f.setBounds(400,200,600,400);
 
 f.setLayout(null);
 f.setSize(400,400);
 f.setVisible(true);
 }
 public static void main(String args[])
 {
  new Demo1("Calculator");
  }
  }