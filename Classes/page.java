package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class page extends JFrame implements ActionListener {
JPanel panel2;

JButton b1,b2,b3,b4,b5,b6;

JTextField t1, t2;
JLabel label1, label2,label3,label4,label5;
ImageIcon bg1,bg2,bg3,bg4,bg5,bg;


public page() {
    this.setTitle("A2Z Productivity");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(800, 600);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 800, 600);
    panel2.setBackground(new Color(0, 9, 83));
    panel2.setVisible(true);
    
    
    bg1 = new ImageIcon("Elements/raf.png");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(400, 0, 400, 500);
    label1.setLayout(null);
    panel2.add(label1);
   

    bg1 = new ImageIcon("Elements/789a2z.png");
    label2 = new JLabel(bg1);
    label2.setVisible(true);
    label2.setBounds(130, 0, 150, 150);
    label2.setLayout(null);
    panel2.add(label2);


    bg = new ImageIcon("Elements/logout.jpg");
    b1 = new JButton(bg);
    b1.setBounds(530,520,120,25);
    b1.setVisible(true);
    panel2.add(b1);


    bg1 = new ImageIcon("Elements/poki.jpg");
    b2 = new JButton(bg1);
    b2.setVisible(true);
    b2.setBounds(10, 150, 150, 150);
    b2.setLayout(null);
    panel2.add(b2);

    
    bg2 = new ImageIcon("Elements/poki3.jpg");
    b3 = new JButton(bg2);
    b3.setVisible(true);
    b3.setBounds(210, 150, 150, 150);
    b3.setLayout(null);
    panel2.add(b3);

    
    bg3 = new ImageIcon("Elements/poki4.jpg");
    b4 = new JButton(bg3);
    b4.setVisible(true);
    b4.setBounds(10, 330, 150, 150);
    b4.setLayout(null);
    panel2.add(b4);

    
    bg4 = new ImageIcon("Elements/poki2.png");
    b5 = new JButton(bg4);
    b5.setVisible(true);
    b5.setBounds(210, 330, 150, 150);
    b5.setLayout(null);
    panel2.add(b5);

    b6 = new JButton("Report");
    b6.setVisible(true);
    b6.setBounds(10,520,120,25);
    b6.setFont(new Font("Arial", Font.BOLD, 16));
    b6.setBackground(Color.red);
    b6.setForeground(Color.white);
    b6.setLayout(null);
    panel2.add(b6);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
this.add(panel2);



}
public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
         Mode1 n = new Mode1();
         this.setVisible(false);
         n.setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
          rokomari k = new rokomari();
            this.setVisible(false);
            k.setVisible(true);
        }
        else if(ae.getSource()==b5){
          flogin n = new flogin();
          n.setVisible(true);
          this.setVisible(false);

        }
        else if(ae.getSource()==b4){
           Mode3 p = new Mode3();
            this.setVisible(false);
            p.setVisible(true);
        }
       

         else if(ae.getSource()==b6){
            cplain x = new cplain();
            this.setVisible(false);
            x.setVisible(true);
         }
         else if(ae.getSource()==b1){
          First x = new First();
          this.setVisible(false);
          x.setVisible(true);
       }
        



    }



}