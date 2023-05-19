package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mode3 extends JFrame implements ActionListener {
JPanel panel2;

JButton b1,b2,b3,b4,b5;

JTextField t1, t2;
JLabel label1, label2,label3,label4,label5;
ImageIcon bg1,bg2,bg3,bg4,bg5,bgx,bgy,bgz;


public Mode3() {
    this.setTitle("Mode - 3");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(750, 600);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBackground(new Color(70, 14,14));
    panel2.setBounds(0, 0, 750, 600);
    panel2.setVisible(true);
    this.add(panel2);

    bgx = new ImageIcon("Elements/ticket.png");
    label1 = new JLabel(bgx);
    label1.setVisible(true);
    label1.setBounds(0, 0, 150, 600);
    label1.setLayout(null);
    panel2.add(label1);

    
    bgy = new ImageIcon("Elements/course.png");
    label1 = new JLabel(bgy);
    label1.setVisible(true);
    label1.setBounds(150,0 , 150, 600);
    label1.setLayout(null);
    panel2.add(label1);

    
    bgz = new ImageIcon("Elements/newspaper.jpg");
    label1 = new JLabel(bgz);
    label1.setVisible(true);
    label1.setBounds(300, 0, 150, 600);
    label1.setLayout(null);
    panel2.add(label1);

    
    bg1 = new ImageIcon("Elements/istockphoto-818451238-612x612.jpg");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 150, 600);
    label1.setLayout(null);
    panel2.add(label1);

    label2 = new JLabel("3 IN 1");
    label2.setVisible(true);
    label2.setForeground(Color.white);
    label2.setFont(new Font("sheriff",Font.BOLD,30));
    label2.setBounds(550, 0, 200, 150);
    label2.setLayout(null);
    panel2.add(label2);
    
    bg1 = new ImageIcon("Elements/capture.png");
 
    b1 = new JButton(bg1);
    b1.setBounds(490,130,200,100);

    b1.setVisible(true);
    panel2.add(b1);


    bg2 = new ImageIcon("Elements/Udemy-Symbol.png");
    b2 = new JButton(bg2);
    b2.setBounds(490,260,200,100);
   
    b2.setVisible(true);
    panel2.add(b2);


    bg3 = new ImageIcon("Elements/news.png");
    b3 = new JButton(bg3);
    b3.setBounds(490,390,200,100);
    
    b3.setVisible(true);
    panel2.add(b3);

    bg4 = new ImageIcon("Elements/exit.png");
    b4 = new JButton(bg4);
    b4.setBounds(520,520,150,40);
   
    b3.setVisible(true);
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
            Transport n = new Transport();
            this.setVisible(false);
            n.setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
          News x = new News();
          this.setVisible(false);
          x.setVisible(true);
        }
        else if(ae.getSource()==b4)
        {
          page x = new page();
          this.setVisible(false);
          x.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
          Udemy x = new Udemy();
          this.setVisible(false);
          x.setVisible(true);
        }
    
}

}

