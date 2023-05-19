package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class Bag extends JFrame implements ActionListener{

    JPanel panel2;

    JButton b1,b2,b3,b4,b5,b6;
    
    JTextField t1, t2;
    JLabel label1, label2,label3,label4,label5;
    ImageIcon bg1,bg2,bg3,bg4,bg5,bg6;
    public Bag(){

        this.setTitle("BackPack");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 600, 700);
        panel2.setBackground(Color.BLACK);
        panel2.setVisible(true);

    bg2 = new ImageIcon("Elements/Skill (1).png");
    label2 = new JLabel(bg2);
    label2.setVisible(true);
    label2.setBounds(0, 0, 600, 300);
    label2.setLayout(null);
   

    bg4 = new ImageIcon("Elements/213.jpg");
    b1 = new JButton(bg4);
    b1.setBounds(0,300,200,400);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setVisible(true);
   

    bg5 = new ImageIcon("Elements/m1.jpg");
    b2 = new JButton(bg5);
    b2.setBounds(200,300,200,400);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setVisible(true);

    bg6 = new ImageIcon("Elements/amm.jpg");
    b6 = new JButton(bg6);
    b6.setBounds(400,300,195,400);
    b6.setFont(new Font("Arial", Font.BOLD, 16));
    b6.setVisible(true);
    



    
   

    this.add(panel2);
    panel2.add(label2);
    panel2.add(b1);
    panel2.add(b2);
    panel2.add(b6);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b6.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b1)
			{
	         pFrame  g = new pFrame();
             this.setVisible(false);
             g.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
                pFrame n = new pFrame();
                this.setVisible(false);
                n.setVisible(true);
			}
           
            else if(ae.getSource()==b6){
                pFrame x = new pFrame();
               this.setVisible(false);
               x.setVisible(true);
            }
          

}



}
    


     