import java.awt.*;
class Calculator
{
Frame f;
TextField tf;
Calculator(String ar)
{	
 f=new Frame();
 tf= new TextField();
 tf.setBounds(30,50,500,50);
	f.add(tf);
 String str[]= {"MC", "MR", "MS", "M+", "M-", "<-", "CE", "C", "+/a_", "SQRT", "7", "8", "9", "/", "%", "4", "5", "6", "*", "1/x", "1", "2", "3", "-", "=","0", ".", "+"};
 Button b[]= new Button[28];
 for(int i=0; i<28; i++)
 {
    b[i]= new Button(str[i]);
	}
	int y=120;
	int n=0;
	for(int k=0; k<5; k++)
     {
		int x=30;
		for(int j=0; j<5; j++)
		{
		b[j+n].setBounds(x,y,80,40);
		x=x+100;
		}
		y=y+60;
		n=n+5;
		}	
		b[25].setBounds(30,420,180,40);
		b[26].setBounds(230,420,80,40);
		b[27].setBounds(330,420,80,40);
	for(int i=0; i<28; i++)
	{
	f.add(b[i]);
	}
	 f.setLayout(null);
	f.setSize(600,500);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
	new Calculator("CALCULATOR");
	}
}