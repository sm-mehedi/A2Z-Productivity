package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Next extends JFrame implements ActionListener{
JPanel p1;
JLabel l1,l2,l3,l4;
ImageIcon bg1,bg2,bg3;
JButton b1,b2;

public Next(){
    
    this.setTitle("A2Z Productivity");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    this.setSize(800, 800);
    this.setResizable(false);
    this.setVisible(true);
    this.setLayout(null);
    this.setLocationRelativeTo(null);

    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(0, 0, 800, 800);
    p1.setBackground(new Color(0, 9, 83));
    p1.setVisible(true);
    
    
    
    bg2 = new ImageIcon("Elements/images.png");
    l2 = new JLabel(bg2);
    l2.setVisible(true);
    l2.setBounds(290, 10, 190, 270);
    l2.setLayout(null);
    p1.add(l2);

    

    l1 = new JLabel("Your time is limited, So don't waste it living someone else's life.");
    l1.setBounds(100,220,800,200);
    l1.setFont(new Font("Aireal",Font.BOLD,20));
    l1.setForeground(Color.ORANGE);
    l1.setVisible(true);
    

    l3 = new JLabel("Ready,Set,Goooo!");
    l3.setBounds(170,300,760,200);
    l3.setFont(new Font("Aireal",Font.BOLD,50));
    l3.setForeground(Color.ORANGE);
    l3.setVisible(true);
    
    bg3 = new ImageIcon("Elements/bmc (1).png");
    b1 = new JButton(bg3);
    b1.setVisible(true);
    b1.setBounds(200, 550, 350, 100);
    b1.setBorderPainted(false);
    b1.setLayout(null);
    p1.add(b1);


    p1.add(l3);
    p1.add(l1);
    this.add(p1);
    this.setVisible(true);


   

    b2 = new JButton("Previous");
    b2.setBounds(160,680,450,50);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setBackground(Color.ORANGE);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    p1.add(b2);
    this.add(p1);
   
  
    b2.addActionListener(this);
    b1.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b2)
			{
	           First n = new First();
               this.setVisible(false);
               n.setVisible(true);
			}
			else if(ae.getSource()==b1)

			{
				Donation n = new Donation();
                this.setVisible(false);
                n.setVisible(true);
			}


}
}
