import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;

class Bill extends JFrame implements ActionListener
{
		JLabel ltotal,limage;
		double billtotal=0;
		JButton bexit;
		MobileDemo1 md;
		Bill(MobileDemo1 m)
		{
			md=m;
			ImageIcon i1=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Billbg.jpg");
			limage=new JLabel(i1);
			ltotal=new JLabel();
			ltotal.setFont(new Font("Castellar",Font.BOLD,45));
			ltotal.setForeground(Color.white);
			ImageIcon i=new ImageIcon("C:\\JAVA PROGRAMS\\PROJECT\\Exit.jpg");
			bexit=new JButton(i);
			bexit.addActionListener(this);
			
			billtotal=billtotal+m.op.total;
			billtotal=billtotal+m.op.op1.total;
			billtotal=billtotal+m.oop.total;
			billtotal=billtotal+m.mi.total;
			billtotal=billtotal+m.vi.total;
			billtotal=billtotal+m.sa.total;
			billtotal=billtotal+m.ip.total;
			
			ltotal.setBounds(155,300,1285,50);
			bexit.setBounds(590,480,100,50);
			limage.setBounds(0,0,1285,685);
			add(limage);
			limage.add(bexit);
			limage.add(ltotal);
			
			ltotal.setText("YOUR TOTAL CART VALUE IS "+ billtotal+"/-");
			
			
		}
		public void actionPerformed(ActionEvent e)
		{
			Thankyou ty=new Thankyou();
			ty.setLayout(null);
			ty.setTitle("THANKYOU");
			ty.setSize(1285,685);
			ty.setLocation(0,0);
			ty.setVisible(true);
			ty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
