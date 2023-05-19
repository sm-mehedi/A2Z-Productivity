package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Template2 extends JFrame implements ActionListener {
    JPanel panel2;

    JButton b1,b2,b3,b4,b5,b6,b7;
    
    JTextField t1, t2;
    JLabel label1, label2,label3,label4,label5;
    ImageIcon bg1,bg2,bg3,bg4,bg5,bg6,bg7;
    public Template2(){
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

        bg2 = new ImageIcon("Elements/po.jpg");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(0, 0, 620, 300);
        label2.setLayout(null);
       

bg1 = new ImageIcon("Elements/11.jpg");
b1 = new JButton(bg1);
b1.setBounds(5,300,200,200);
b1.setFont(new Font("Arial", Font.BOLD, 16));
b1.setVisible(true);
panel2.add(b1);

bg2 = new ImageIcon("Elements/12.jpg");
b2 = new JButton(bg2);
b2.setBounds(205,300,200,200);
b2.setFont(new Font("Arial", Font.BOLD, 16));
b2.setVisible(true);
panel2.add(b2);

bg3 = new ImageIcon("Elements/13.jpg");
b3 = new JButton(bg3);
b3.setBounds(405,300,200,200);
b3.setFont(new Font("Arial", Font.BOLD, 16));
b3.setVisible(true);
panel2.add(b3);

bg4 = new ImageIcon("Elements/45.jpg");
b4 = new JButton(bg4);
b4.setBounds(5,500,200,200);
b4.setFont(new Font("Arial", Font.BOLD, 16));
b4.setVisible(true);
panel2.add(b4);

bg5 = new ImageIcon("Elements/kl.jpg");
b5 = new JButton(bg5);
b5.setBounds(205,500,200,200);
b5.setFont(new Font("Arial", Font.BOLD, 16));
b5.setVisible(true);
panel2.add(b5);

bg6 = new ImageIcon("Elements/poli.jpg");
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
         pFrame2 g = new pFrame2();
         this.setVisible(false);
         g.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            pFrame2 n = new pFrame2();
            this.setVisible(false);
            n.setVisible(true);
        }
        else if(ae.getSource()==b3){
            System.exit(0);

        }
        else if(ae.getSource()==b4){
           pFrame2 x = new pFrame2();
           this.setVisible(false);
           x.setVisible(true);
        }
        else if(ae.getSource()==b5){
            pFrame2 x = new pFrame2();
            this.setVisible(false);
            x.setVisible(true);
         }
         else if(ae.getSource()==b6){
            pFrame2 x = new pFrame2();
            this.setVisible(false);
            x.setVisible(true);
         }
         else if(ae.getSource()==b7){
            Merch x = new Merch();
            this.setVisible(false);
            x.setVisible(true);
         }




    }
}


