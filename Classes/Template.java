package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class Template extends JFrame implements ActionListener{
    JPanel panel2;

    JButton b1,b2,b3,b4,b5,b6,b7;
    
    JTextField t1, t2;
    JLabel label1, label2,label3,label4,label5;
    ImageIcon bg1,bg2,bg3,bg4,bg5,bg6,bg7;
    public Template(){
        this.setTitle("Shop");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(620, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 620, 800);
        panel2.setBackground(new Color(243,203,77,255));
        panel2.setVisible(true);

        bg2 = new ImageIcon("Elements/4296444 (1).jpg");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(0, 0, 620, 300);
        label2.setLayout(null);
       

bg1 = new ImageIcon("Elements/1.jpg");
b1 = new JButton(bg1);
b1.setBounds(5,300,200,200);
b1.setFont(new Font("Arial", Font.BOLD, 16));
b1.setVisible(true);
panel2.add(b1);

bg2 = new ImageIcon("Elements/2.jpg");
b2 = new JButton(bg2);
b2.setBounds(205,300,200,200);
b2.setFont(new Font("Arial", Font.BOLD, 16));
b2.setVisible(true);
panel2.add(b2);

bg3 = new ImageIcon("Elements/3.jpg");
b3 = new JButton(bg3);
b3.setBounds(405,300,200,200);
b3.setFont(new Font("Arial", Font.BOLD, 16));
b3.setVisible(true);
panel2.add(b3);

bg4 = new ImageIcon("Elements/3 (2).jpg");
b4 = new JButton(bg4);
b4.setBounds(5,500,200,200);
b4.setFont(new Font("Arial", Font.BOLD, 16));
b4.setVisible(true);
panel2.add(b4);

bg5 = new ImageIcon("Elements/5.jpg");
b5 = new JButton(bg5);
b5.setBounds(205,500,200,200);
b5.setFont(new Font("Arial", Font.BOLD, 16));
b5.setVisible(true);
panel2.add(b5);

bg6 = new ImageIcon("Elements/6.jpg");
b6 = new JButton(bg6);
b6.setBounds(405,500,200,200);
b6.setFont(new Font("Arial", Font.BOLD, 16));
b6.setVisible(true);
panel2.add(b6);


b7 = new JButton("Back");
b7.setBounds(230,720,150,40);
b7.setFont(new Font("Arial", Font.BOLD, 16));
b7.setBackground(Color.RED);
b7.setForeground(Color.white);
b7.setVisible(true);
panel2.add(b7);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);


panel2.add(label2);
this.add(panel2);
    


    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
         pFrame1 g = new pFrame1();
         this.setVisible(false);
         g.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            pFrame1 n = new pFrame1();
            this.setVisible(false);
            n.setVisible(true);
        }
        else if(ae.getSource()==b3){
            System.exit(0);

        }
        else if(ae.getSource()==b4){
           pFrame1 x = new pFrame1();
           this.setVisible(false);
           x.setVisible(true);
        }
        else if(ae.getSource()==b5){
            pFrame1 l = new pFrame1();
            this.setVisible(false);
            l.setVisible(true);
         }
         else if(ae.getSource()==b6){
            pFrame1 z = new pFrame1();
            this.setVisible(false);
            z.setVisible(true);
         }
         else if(ae.getSource()==b7){
            Merch x = new Merch();
            this.setVisible(false);
            x.setVisible(true);
         }




    }
}


