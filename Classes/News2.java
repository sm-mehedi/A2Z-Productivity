package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class News2 extends JFrame implements ActionListener {
JPanel  panel2, panel3;
JButton b1,b2;
JTextField t1;
JLabel label1, label2, label3,label4,label5,label6;
ImageIcon bg1,bg2,bg3,bg4;

JPasswordField t2;
JCheckBox showPasswordCheckbox;


public News2() {
    this.setTitle("A2Z Productivity");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 950);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 800, 800);
    panel2.setVisible(true);
    panel2.setBackground(Color.DARK_GRAY);
   
    label6 = new JLabel("NEWS");
    label6.setFont(new Font("Ariel",Font.ITALIC,70));
    label6.setForeground(Color.ORANGE);
    label6.setBounds(50,20,350,73);
    label6.setVisible(true);
    panel2.add(label6);



    




    bg2 = new ImageIcon("Elements/news5.jpg");
    label2 = new JLabel(bg2);
    label2.setVisible(true);
    label2.setBounds(0, 150, 800, 300);
    label2.setLayout(null);
    panel2.add(label2);

    bg3 = new ImageIcon("Elements/news8.jpg");
    label3 = new JLabel(bg3);
	label3.setFont(new Font("Playfair Display",Font.ITALIC,25));
	label3.setForeground(Color.ORANGE);
	label3.setBounds(0,470,800,300);
    label3.setVisible(true);
	panel2.add(label3);


   

   



   bg4 = new ImageIcon("Elements/exit.png");
    b1 = new JButton(bg4);
    b1.setBounds(400,30,120,50);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setBackground(Color.RED);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel2.add(b1);

    this.add(panel2);
   
    this.setVisible(true);
  
    b1.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
		{
            
			 if(ae.getSource()==b1)
			{
				Mode3 x = new Mode3();
                this.setVisible(false);
                x.setVisible(true);
			}

}
			

}