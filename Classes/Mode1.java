package Classes;
import java.awt.*;
import java.awt.event.*;
import java.time.Clock;

import javax.swing.*;

public class Mode1 extends JFrame implements ActionListener {
    JPanel panel2;

    JButton b1,b2,b3,b4,b5;
    
    JTextField t1, t2,t3;
    JLabel label1, label2,label3,label4,label5,label6;
    ImageIcon bg1,bg2,bg3,bg4,bg5,bg6,bg7,bx,nx;

    public Mode1(){
        this.setTitle("Mode1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 750, 500);
        panel2.setBackground(new Color(0,9, 83));
        panel2.setVisible(true);
        
        bg2 = new ImageIcon("Elements/dexox.jpg");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(400, 0, 350, 500);
        label2.setLayout(null);

       
       
        
        nx = new ImageIcon("Elements/clock.jpg");
        b1 = new JButton(nx);
        b1.setBounds(200,20,150,150);
        b1.setVisible(true);
        panel2.add(b1);
    
        bx = new ImageIcon("Elements/music.jpg");
        b2 = new JButton(bx);
        b2.setBounds(20,20,150,150);
        
        b2.setVisible(true);
        panel2.add(b2);

        bg6 = new ImageIcon("Elements/cs.jpg");
        b4 = new JButton(bg6);
        b4.setBounds(20,250,150,150);
        
        b4.setVisible(true);
        panel2.add(b4);

        bg7 = new ImageIcon("Elements/cs.jpg");
        b5 = new JButton(bg7);
        b5.setBounds(200,250,150,150);
        
        b5.setVisible(true);
        panel2.add(b5);


        b3 = new JButton("x");
        b3.setBounds(680,0,80,50);

        b3.setBackground(Color.black);
        b3.setFont(new Font("Calibri", Font.BOLD,50));
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
      
        b3.setVisible(true);
        panel2.add(b3);

        b1.addActionListener(this);
        b3.addActionListener(this);
        
        
    
        



        panel2.add(label2);
        
        this.add(panel2);

    }
    public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b3)
			{
                page n = new page();
                n.setVisible(true);
                this.setVisible(false);
			}
			else if(ae.getSource()==b1)
			{
                System.out.println(""); 
			}
           

}









    }