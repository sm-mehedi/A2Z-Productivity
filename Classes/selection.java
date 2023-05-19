package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class selection extends JFrame implements ActionListener {

JButton b1,b2;
JPanel panel2;
ImageIcon bg1,bg2;




public selection() {
    this.setTitle("Admin or User ?");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 800);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 800, 800);
    panel2.setVisible(true);

  

    bg1 = new ImageIcon("Elements/ADMIN (1).png");
    b1 = new JButton(bg1);
    b1.setBounds(0,0,400,800);
    b1.setVisible(true);
   

    
    bg2 = new ImageIcon("Elements/USER (1).png");
    b2 = new JButton(bg2);
    b2.setBounds(400,0,400,800);
    b2.setVisible(true);
   
    panel2.add(b1);
    panel2.add(b2);
    this.add(panel2);
    this.setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b2)
			{
	           LogIn n = new LogIn();
               this.setVisible(false);
               n.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
                AdminLogin n = new AdminLogin();
               this.setVisible(false);
               n.setVisible(true);
				
				
				
			}

}
			

}