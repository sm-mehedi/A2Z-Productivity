package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class Merch extends JFrame implements ActionListener{

    JPanel panel2;

    JButton b1,b2,b3,b4;
    
    JTextField t1, t2;
    JLabel label1, label2,label3,label4,label5;
    ImageIcon bg1,bg2,bg3,bg4,bg5;
    public Merch(){

        this.setTitle("BUY BUY BUY");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
       
        panel2.setBounds(0, 0, 600, 700);
        panel2.setVisible(true);

    bg2 = new ImageIcon("Elements/MERCH.jpg");
    label2 = new JLabel(bg2);
    label2.setVisible(true);
    label2.setBounds(0, 0, 800, 800);
    label2.setLayout(null);
   

    bg4 = new ImageIcon("Elements/5447807 (1).jpg");
    b1 = new JButton(bg4);
    b1.setBounds(100,60,400,150);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setBackground(Color.BLUE);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
   

    bg5 = new ImageIcon("Elements/Bag (1).jpg"); 
    b2 = new JButton(bg5);
    b2.setBounds(100,240,400,150);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setBackground(Color.RED);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    
    bg3 = new ImageIcon("Elements/78p.jpg");
    b3 = new JButton(bg3);
    b3.setBounds(100,420,400,150);
    b3.setFont(new Font("Arial", Font.BOLD, 16));
    b3.setBackground(Color.RED);
    b3.setForeground(Color.WHITE);
    b3.setVisible(true);

    b4 = new JButton("BACK");
    b4.setBounds(160,600,250,25);
    b4.setFont(new Font("Arial", Font.BOLD, 16));
    b4.setBackground(Color.RED);
    b4.setForeground(Color.WHITE);
    b4.setVisible(true);

    
   

    this.add(panel2);
    panel2.add(label2);
    panel2.add(b1);
    panel2.add(b3);
    panel2.add(b2);
    panel2.add(b4);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b1)
			{
	         Template x = new Template();
             this.setVisible(false);
             x.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Bag n = new Bag();
                this.setVisible(false);
                n.setVisible(true);
			}
            else if(ae.getSource()==b3){
                Template2 x = new Template2();
             this.setVisible(false);
             x.setVisible(true);

            }
            else if(ae.getSource()==b4){
                First x = new First();
             this.setVisible(false);
             x.setVisible(true);

            }
            

}



}
    


     