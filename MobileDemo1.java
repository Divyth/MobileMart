import javax.swing.*;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;

class MobileDemo1 extends JFrame implements ActionListener
{

	JLabel l1,l2,l3,l4,limage;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,bimage1,bimage2,bimage3,bimage4,bimage5,bimage6,bimage7,bimage8,bimage9,bcart;
	Iphone ip;
	Mi mi;
	OnePlus op;
	Oppo oop;
	Vivo vi;
	Samsung sa;
	Bill bi;  
	
	MobileDemo1()
	{

			ImageIcon i=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Homeee.JPG");
			limage=new JLabel(i);
			
			l2=new JLabel("Shop By Brands");
			l2.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,28));
			
			ImageIcon a1=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Apple 1.jpg");
			b1=new JButton(a1);
			b1.addActionListener(this);
			
			ImageIcon a2=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Xiaomi 1.jpg");
			b2=new JButton(a2);
			b2.addActionListener(this);

			ImageIcon a3=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Oneplus 1.jpg");
			b3=new JButton(a3);
			b3.addActionListener(this);
			
			ImageIcon a4=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Oppo 1.jpg");
			b4=new JButton(a4);
			b4.addActionListener(this);
			
			ImageIcon a5=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Vivo 1.jpg");
			b5=new JButton(a5);
			b5.addActionListener(this);
			
			
			ImageIcon a6=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Samsung 1.jpg");
			b6=new JButton(a6);
			b6.addActionListener(this);
			
			ImageIcon ca=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Cart.jpg");
			bcart=new JButton(ca);
			bcart.addActionListener(this);
			
			limage.setBounds(0,0,1285,400);
			l2.setBounds(500,410,270,50);
			b1.setBounds(40,490,170,100);
			b2.setBounds(245,490,170,100);
			b3.setBounds(450,490,170,100);
			b4.setBounds(655,490,170,100);
			b5.setBounds(860,490,170,100);
			b6.setBounds(1065,490,170,100);
			bcart.setBounds(1185,420,50,50);
			
			add(limage);
			add(l2);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			add(bcart);
			
			ip=new Iphone(this);
			mi=new Mi(this);
			op=new OnePlus(this);
			oop=new Oppo(this);
			vi=new Vivo(this);
			sa=new Samsung(this);
			
	}
	public void actionPerformed(ActionEvent e)
    {
      
        
        if(e.getSource()==b1)
        {
            this.setVisible(false);
            ip.setLayout(null);
            ip.setTitle("Iphone");
            ip.setSize(1285,685);
            ip.setLocation(0,0);
            ip.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ip.setVisible(true);
                
        }
		else if(e.getSource()==b2)
        {
            this.setVisible(false);
            mi.setLayout(null);
            mi.setTitle("Mi");
            mi.setSize(1285,685);	
            mi.setLocation(0,0);
            mi.setDefaultCloseOperation(EXIT_ON_CLOSE);
            mi.setVisible(true);
        }
		
		else if(e.getSource()==b3)
        {
            this.setVisible(false);
            op.setLayout(null);
            op.setTitle("OnePlus");
            op.setSize(1285,685);
            op.setLocation(0,0);
            op.setDefaultCloseOperation(EXIT_ON_CLOSE);
            op.setVisible(true);
        }
		else if(e.getSource()==b4)
        {
            this.setVisible(false);
            oop.setLayout(null);
            oop.setTitle("Oppo");
            oop.setSize(1285,685);	
            oop.setLocation(0,0);
            oop.setDefaultCloseOperation(EXIT_ON_CLOSE);
            oop.setVisible(true);
        }
		else if(e.getSource()==b5)
        {
            this.setVisible(false);
            vi.setLayout(null);
            vi.setTitle("Vivo");
            vi.setSize(1285,685);	
            vi.setLocation(0,0);
            vi.setDefaultCloseOperation(EXIT_ON_CLOSE);
            vi.setVisible(true);
        }
		else if(e.getSource()==b6)
        {
            this.setVisible(false);
            sa.setLayout(null);
            sa.setTitle("Samsung");
            sa.setSize(1285,685);	
            sa.setLocation(0,0);
            sa.setDefaultCloseOperation(EXIT_ON_CLOSE);
            sa.setVisible(true);
        }
		else if(e.getSource()==bcart)
        {
            this.setVisible(false);
			bi=new Bill(this);
            bi.setLayout(null);
            bi.setTitle("Bill");
            bi.setSize(1285,685);	
            bi.setLocation(0,0);
            bi.setDefaultCloseOperation(EXIT_ON_CLOSE);
            bi.setVisible(true);
        }
		
    }
			
	public static void main (String args[])
	{
		MobileDemo1 md=new MobileDemo1();
		md.setLayout(null);
		md.setTitle("Mobile Ordering System");
		md.setSize(1285,685);
		md.setLocation(0,0);
		md.setVisible(true);
		md.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			
	}		
			
}

        