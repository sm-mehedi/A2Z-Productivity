package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class food extends JFrame implements ActionListener{
    JPanel p1,p2;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4,b5;
    ImageIcon i1,i2,i3;

    public food(){
        this.setTitle("A2Z Productivity");
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setResizable(false);
      
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
    
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 800, 800);
        p1.setBackground(new Color(250, 128, 0));
        p1.setVisible(true);
    
        i1 = new ImageIcon("Elements/food1.jpg");
        l1 = new JLabel(i1);
        l1.setVisible(true);
        l1.setBounds(0, 0, 240, 800);
        l1.setLayout(null);
        p1.add(l1);
        
     i1 = new ImageIcon("Elements/f12.jpg");
       b1 = new JButton(i1);
       b1.setBounds(285, 21, 450, 200);
       b1.setLayout(null);
       b1.setVisible(true);
        
       i2 = new ImageIcon("Elements/frty.jpg");
       b2 = new JButton(i2);
       b2.setBounds(285, 260, 450, 200);
       b2.setLayout(null);
       b2.setVisible(true);

       i3 = new ImageIcon("Elements/food4.jpg");
       b3 = new JButton(i3);
       b3.setBounds(285, 495, 450, 200);
       b3.setLayout(null);
       b3.setVisible(true);


      
    b4 = new JButton("Back");
    b4.setBounds(333,700,350,50);
    b4.setFont(new Font("Arial", Font.BOLD, 16));
    b4.setBackground(Color.ORANGE);
    b4.setForeground(Color.WHITE);
    b4.setVisible(true);
    
       
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        this.add(p1);
     
    b4.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(null);
    this.setVisible(true);






    }
    public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b1)
			{
	           FoodTemplate1 n = new  FoodTemplate1();
               this.setVisible(false);
               n.setVisible(true);
			}
           else if(ae.getSource()==b2)
			{
	           FoodTemplate2 n = new  FoodTemplate2();
               this.setVisible(false);
               n.setVisible(true);
			}
           else if(ae.getSource()==b3)
			{
	           FoodTemplate3 n = new  FoodTemplate3();
               this.setVisible(false);
               n.setVisible(true);
			}
            else if(ae.getSource()==b4)
			{
	           page n = new page();
               this.setVisible(false);
               n.setVisible(true);
			}
         



    
}
}