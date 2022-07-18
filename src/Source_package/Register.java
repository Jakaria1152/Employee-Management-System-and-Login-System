package Source_package;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Register implements ActionListener{ 

	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l9;
	JTextField al1,al2,al3,al4,al5,al6,al9;
	JButton b1,b2;
	public Register() {
		f = new JFrame("Register");
		f.setBackground(Color.white);
		f.setLayout(null);
		
	
		
		l1 = new JLabel("First Name: ");
		l1.setBounds(150,50,200,30);
		l1.setFont(new Font("serif", Font.BOLD,20));
		f.add(l1);
		
		al1 = new JTextField();
		al1.setBounds(320,50,200,30);
		f.add(al1);
		
		l2 = new JLabel("Sur Name: ");
		l2.setBounds(150,90,200,30);
		l2.setFont(new Font("serif", Font.BOLD,20));
		f.add(l2);
		
		
		al2 = new JTextField();
		al2.setBounds(320,90,200,30);
		f.add(al2);
		
		l3 = new JLabel("Username: ");
		l3.setBounds(150,130,200,30);
		l3.setFont(new Font("serif", Font.BOLD,20));
		f.add(l3);
						
		al3 = new JTextField();
		al3.setBounds(320,130,200,30);
		f.add(al3);
		
		l4 = new JLabel("Mobile Number: ");
		l4.setBounds(150,170,200,30);
		l4.setFont(new Font("serif", Font.BOLD,20));
		f.add(l4);
						
		al4 = new JTextField();
		al4.setBounds(320,170,200,30);
		f.add(al4);
		
		l5 = new JLabel("New Password:");
		l5.setBounds(150,210,200,30);
		l5.setFont(new Font("serif", Font.BOLD,20));
		f.add(l5);
						
		al5 = new JTextField();
		al5.setBounds(320,210,200,30);
		f.add(al5);
		
		l6 = new JLabel("Date of Birth: ");
		l6.setBounds(150,250,200,30);
		l6.setFont(new Font("serif", Font.BOLD,20));
		f.add(l6);
						
		al6 = new JTextField();
		al6.setBounds(320,250,200,30);
		f.add(al6);
		
		l9 = new JLabel("Gender: ");
		l9.setBounds(150,290,200,30);
		l9.setFont(new Font("serif", Font.BOLD,20));
		f.add(l9);
						
		al9 = new JTextField();
		al9.setBounds(320,290,200,30);
		f.add(al9);
		
		b1 = new JButton("Sign Up");
		b1.setBackground(Color.black);
	    b1.setForeground(Color.white);
	    b1.setBounds(150,380,150,40);
	   b1.addActionListener(this);
	    f.add(b1);
	    
	    b2 = new JButton("Cancel");
		b2.setBackground(Color.black);
	    b2.setForeground(Color.white);
	    b2.setBounds(350,380,150,40);
	    b2.addActionListener(this);
	    f.add(b2);
		
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(400,150);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String a = al1.getText();
			String b = al2.getText();
			String c = al3.getText();
			String d = al4.getText();
			String e = al5.getText();
			String ff = al6.getText();
			String g = al9.getText();
			try
			{
				Conn con= new Conn();
				String q = "INSERT INTO register VALUES('"+a+"', '"+b+"', '"+c+"', '"+d+"', '"+e+"', '"+ff+"','"+g+"')";
				con.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null, "Successfully Registered to your Information");
				f.setVisible(false);
				new login();
				
			}catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null, "Unable to Register your information, Please enter correct Information");
		}
	}else if(ae.getSource()==b2)
	{
		f.setVisible(false);
		new login();
	}
	}
	public static void main(String[] args) {
		new Register();

	}

}
