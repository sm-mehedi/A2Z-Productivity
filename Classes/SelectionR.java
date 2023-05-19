package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectionR extends JFrame implements ActionListener {
JPanel panel2;

JButton b1,b2,b3,b4,b5,b6;

JTextField t1, t2;
JLabel label1, label2,label3,label4,label5;
ImageIcon bg1,bg2,bg3,bg4,bg5,bg;


public SelectionR() {
    this.setTitle("rokomari");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(700, 500);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setVisible(true);

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 700, 500);
    panel2.setBackground(Color.black);
    panel2.setVisible(true);
    bg3 = new ImageIcon("Elements/rssup.jpg");
    b1 = new JButton(bg3);
    b1.setBounds(30,100,200,200);
    b1.setVisible(true);
    panel2.add(b1);

    bg1 = new ImageIcon("Elements/rbok.jpg");
    b2 = new JButton(bg1);
    b2.setVisible(true);
    b2.setBounds(250, 100, 200, 200);
    b2.setLayout(null);
    panel2.add(b2);

    bg2 = new ImageIcon("Elements/pr.jpg");
    b3 = new JButton(bg2);
    b3.setVisible(true);
    b3.setBounds(460, 100, 200, 200);
    b3.setLayout(null);
    panel2.add(b3);

    label5 = new JLabel("Hi,there!!");
    label5.setBounds(50,19,300,33);
    label5.setFont(new Font("sheriff",Font.BOLD,39));
    label5.setVisible(true);
    label5.setForeground(new Color(255, 69, 0));
    panel2.add(label5);

    label2 = new JLabel("A pen is mighter than a sword");
    label2.setVisible(true);
    label2.setForeground(Color.orange);
    label2.setBounds(30, 300, 450, 150);
    label2.setFont(new Font("Ariel",Font.ITALIC,30));
    label2.setLayout(null);
    panel2.add(label2);

    b4 = new JButton("EXIT");
    b4.setBounds(500,380,120,50);
    b4.setFont(new Font("Arial", Font.BOLD, 16));
    b4.setBackground(Color.red);
    b4.setForeground(Color.WHITE);
    b4.setVisible(true);
    panel2.add(b4);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
   
    this.add(panel2);}

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
         Templatepen n = new Templatepen();
         this.setVisible(false);
         n.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
          Book k = new Book();
            this.setVisible(false);
            k.setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
            Rtemplate k = new Rtemplate();
            this.setVisible(false);
            k.setVisible(true);
        }
        else if(ae.getSource()==b4)
        {
          page k = new page();
            this.setVisible(false);
            k.setVisible(true);
        }


       
        



    }
}




    
