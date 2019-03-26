import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mymenu implements ActionListener
{
	JTextField tf= new JTextField();
	JFrame jf=new JFrame("My Menu");
	JMenuBar mb;
	JMenu menu,sm;
	JMenuItem mi,exit;
	JRadioButtonMenuItem rb;
	JCheckBoxMenuItem cb;
 Mymenu()
 {
	jf.add(tf);
	mb=new JMenuBar();
	menu=new JMenu("FirstMenu");
	menu.setMnemonic(KeyEvent.VK_F);
	mb.add(menu);
	mi=new JMenuItem("A text-only menu item",KeyEvent.VK_T);
	mi.addActionListener(this);
	
	//Icon i1=new ImageIcon("C:/Users/Mahwash Inam/Desktop/image/i1.gif");
	//mi.setIcon(i1);
	
	KeyStroke i=KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.CTRL_MASK);
	mi.setAccelerator(i);
	menu.add(mi);
	
	menu.addSeparator();
	ButtonGroup group=new ButtonGroup();
	rb= new JRadioButtonMenuItem("A radio button menu item");
	rb.setSelected(true);
	rb.setMnemonic(KeyEvent.VK_R);
	//rb.setIcon(new ImageIcon("C:/Users/Mahwash Inam/Desktop/image/i1.gif"));
	group.add(rb);
	menu.add(rb);
	rb=new JRadioButtonMenuItem("Another");
	rb.setMnemonic(KeyEvent.VK_O);
	group.add(rb);
	//rb.setIcon(new ImageIcon("C:/Users/Mahwash Inam/Desktop/image/i1.gif"));
	menu.add(rb);
	
	//a group of checkbox	
	
	menu.addSeparator();
	cb=new JCheckBoxMenuItem("A checkbox menu item");
	cb.setMnemonic(KeyEvent.VK_C);
	//cb.setIcon(new ImageIcon("C:/Users/Mahwash Inam/Desktop/image/i1.gif"));
	menu.add(cb);
	cb= new JCheckBoxMenuItem("Another");
	cb.setMnemonic(KeyEvent.VK_H);
	//cb.setIcon(new ImageIcon("C:/Users/Mahwash Inam/Desktop/image/i1.gif"));
	menu.add(cb);
	
	//a submenu
	
	menu.addSeparator();
	sm=new JMenu("A Submenu");
	cb.setMnemonic(KeyEvent.VK_S);
	mi=new JMenuItem("An item in the submenu");
	mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
	sm.add(menu);
	mi= new JMenuItem("Another");
	sm.add(mi);
	menu.add(sm);
	
	exit=new JMenuItem("exit");
	exit.addActionListener(this);
	exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,ActionEvent.SHIFT_MASK));
	//exit.setIcon(new ImageIcon("C:/Users/Mahwash Inam/Desktop/image/i1.gif"));
	exit.setMnemonic(KeyEvent.VK_X);
	menu.add(exit);
	
	menu=new JMenu("Another Menu");
	menu.setMnemonic(KeyEvent.VK_N);
	mb.add(menu);
	jf.setJMenuBar(mb);
	jf.setSize(400,400);
	jf.setVisible(true);
}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getActionCommand().equals(exit))
		System.exit(0);
	if(e.getActionCommand().equals("A text-only menuitem"))
		{
		tf.setText("hello");
		}
	}
	
	public static void main(String s[])
	{
	 new Mymenu();
	 }
	} 