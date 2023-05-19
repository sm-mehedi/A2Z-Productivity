package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First extends JFrame implements ActionListener{
    JPanel p1,p2,p3;
    JButton b2,b1,b3,b4,b5;
    JLabel l1,l3;
    ImageIcon I1,I2,I4;

    public First(){
        this.setTitle("A2Z Productivity");
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(800,800);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        p1 = new JPanel();
        p1.setBounds(0, 0, 600, 800);
        p1.setLayout(null);
        p1.setVisible(true);

        


        p2 = new JPanel();
        p2.setBounds(600, 0, 200, 800);
        p2.setBackground(new Color(0,9, 83));
        p2.setLayout(null);
        p2.setVisible(true);


        I1 = new ImageIcon("Elements/2059304.jpg");
        l1 = new JLabel(I1);
        l1.setVisible(true);
        l1.setBounds(0, 0, 600, 800);
        l1.setLayout(null);

      
       

        b2 = new JButton("LogIn");
        b2.setBounds(30, 70, 120, 50);
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.WHITE);
        b2.setLayout(null);
        b2.setVisible(true);
        
        b1 = new JButton("About Us");
        b1.setBounds(30, 160, 120, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.WHITE);
        b1.setLayout(null);
        b1.setVisible(true);
        
        b3 = new JButton("Support us");
        b3.setBounds(30, 250, 120, 50);
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.WHITE);
        b3.setLayout(null);
        b3.setVisible(true);

        b4 = new JButton("EXIT");
        b4.setBounds(30, 700, 120, 50);
        b4.setFont(new Font("Arial", Font.BOLD, 16));
        b4.setBackground(Color.RED);
        b4.setForeground(Color.WHITE);
        b4.setLayout(null);
        b4.setVisible(true);
        
        b5 = new JButton("Merch");
        b5.setBounds(30, 340, 120, 50);
        b5.setFont(new Font("Arial", Font.BOLD, 16));
        b5.setBackground(Color.GREEN);
        b5.setForeground(Color.WHITE);
        b5.setLayout(null);
        b5.setVisible(true);


        
        
        p2.add(b2); 
        p2.add(b1);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p1.add(l1);
        this.add(p1);
        this.add(p2);
      
        b2.addActionListener(this);
        b1.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b2)
			{
                selection k = new selection();
               this.setVisible(false);
               k.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
                System.exit(0);
				
			}
            else if(ae.getSource()==b3)
			{
                Next n = new Next();
                this.setVisible(false);
                n.setVisible(true);
				
			}
            else if(ae.getSource()==b1)
			{
               Team x = new Team();
               this.setVisible(false);
               x.setVisible(true);
				
			}
            else if(ae.getSource()==b5)
			{
               Merch x = new Merch();
               this.setVisible(false);
               x.setVisible(true);
				
			}

}




    }






