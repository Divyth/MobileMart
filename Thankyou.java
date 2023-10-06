import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;

class Thankyou extends JFrame 
{
	JLabel lthankyou;
	Thankyou()
	{
		ImageIcon i=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Thankyoubg.jpg");
		lthankyou=new JLabel(i);
		add(lthankyou);
		lthankyou.setBounds(0,0,1285,685);
	}		
}