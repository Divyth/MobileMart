import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;

class Vivo extends JFrame implements ActionListener
{
   
    JLabel l1;
    JButton b1;
	JCheckBox c1,c2,c3,c4;
	JComboBox cb1,cb2,cb3,cb4;
	String qty[]={" ","1","2","3","4"};
	double total;
    MobileDemo1 md;
	
    Vivo(MobileDemo1 m)
    {
        md=m;
		ImageIcon i=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Vivo1.jpg");
        l1=new JLabel(i);
        l1.setBounds(0,0,1285,400);
        add(l1);
		ImageIcon i1=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Previous.jpg");
		b1=new JButton(i1);
        b1.setBounds(550,550,100,50);
        add(b1);
        b1.addActionListener(this);
		c1=new JCheckBox("1");
		c2=new JCheckBox("2");
		c3=new JCheckBox("3");
		c4=new JCheckBox("4");
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		c1.setBounds(0,420,50,50);
		cb1.setBounds(80,420,170,50);
		c2.setBounds(340,420,50,50);
		cb2.setBounds(400,420,170,50);
		c3.setBounds(660,420,50,50);
		cb3.setBounds(720,420,170,50);
		c4.setBounds(980,420,50,50);
		cb4.setBounds(1040,420,170,50);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		
		
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
	   {
		   total=0;
		   String s;
		   int x;
		   if(c1.isSelected())
		   {
			  s=cb1.getSelectedItem().toString();
			  if(s.equals(" "))
			  {
				  x=0;
			  }
			  else
			  {
				  x=Integer.parseInt(s);
			  }
			  total=total+(11999*x);
		   }
		   if(c2.isSelected())
		   {
			  s=cb2.getSelectedItem().toString();
			  if(s.equals(" "))
			  {
				  x=0;
			  }
			  else
			  {
				  x=Integer.parseInt(s);
			  }
			  total=total+(37499*x);
		   }
		   if(c3.isSelected())
		   {
			  s=cb3.getSelectedItem().toString();
			  if(s.equals(" "))
			  {
				  x=0;
			  }
			  else
			  {
				  x=Integer.parseInt(s);
			  }
			  total=total+(78000*x);
		   }
		   if(c4.isSelected())
		   {
			  s=cb4.getSelectedItem().toString();
			  if(s.equals(" "))
			  {
				  x=0;
			  }
			  else
			  {
				  x=Integer.parseInt(s);
			  }
			  total=total+(149999*x);
		   }
           this.setVisible(false);
           md.setVisible(true);            
	   }
    }   
}

