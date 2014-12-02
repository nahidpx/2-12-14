import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.jndi.ldap.ManageReferralControl;


public class Calc extends JFrame {

	public Calc(){
		super("My Calc");
		setSize(400, 500);

		JButton btnZero = new JButton("0");
		JButton btnOne = new JButton("1");
		JButton btnTwo = new JButton("2");
		JButton btnThree = new JButton("3");
		JButton btnFour = new JButton("4");
		btnZero.setSize(20, 10);
		btnOne.setSize(20, 10);
		btnTwo.setSize(20, 10);
		btnThree.setSize(20, 10);
		btnFour.setSize(20, 10);
		
		Box b = Box.createVerticalBox();
		b.add(btnZero);
		b.add(btnOne);
		b.add(btnTwo);
		b.add(btnThree);
		b.add(btnFour);
		getContentPane().add(b);
		
		Box b2 = Box.createHorizontalBox();
		b2.add(btnZero);
		b2.add(btnOne);
		b2.add(btnTwo);
		b2.add(btnThree);
		b2.add(btnFour);
		getContentPane().add(b2);

		
        setLayout(new BoxLayout( getContentPane(), BoxLayout.LINE_AXIS));
		
		
		
	}

	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.setVisible(true);

		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
