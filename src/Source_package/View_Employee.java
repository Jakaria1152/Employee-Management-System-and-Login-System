package Source_package;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class View_Employee implements ActionListener {
	JFrame f;
	JTextField t;
	JLabel l1,l2;
	JButton b1,b2;
	
	public View_Employee() {
		f = new JFrame("View");
		f.setBackground(Color.green);
		f.setLayout(null);
		
		l1 = new JLabel();
		l1.setBounds(0,0,500,270);
		l1.setLayout(null);
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
		l1.setIcon(img);
		
		l2 = new JLabel("Employee ID");
		l2.setBounds(40, 50, 250, 50);
		l2.setVisible(true);
		Font F = new Font("serif", Font.BOLD,30);
		l2.setFont(F);
		l1.add(l2);
		f.add(l1);
		
		t = new JTextField();
		t.setBounds(240,60,220,30);
		l1.add(t);
		
		b1 = new JButton("Search");
		b1.setBounds(240, 150, 100, 30);
		b1.addActionListener(this);
		l1.add(b1);
		
		b2 = new JButton("Cancel");
		b2.setBounds(360,150,100,30);
		b2.addActionListener(this);
		l1.add(b2);
		
		
		f.setSize(500,270);
		f.setLocation(450,250);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			f.setVisible(false);
			Print_Data p = new Print_Data(t.getText());
		}
		else if(ae.getSource()==b2)
		{
			f.setVisible(false);
			new details();
			
		}
	}

	public static void main(String[] args) {
		View_Employee v = new View_Employee();

	}

}
