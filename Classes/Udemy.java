package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Udemy extends JFrame implements ActionListener {
    JPanel panel2;

    JButton b1,b2,b3,b4,b5,b6,b7;
    
    JTextField t1, t2;
    JLabel label1, label2,label3,label4,label5;
    ImageIcon bg1,bg2,bg3,bg4,bg5,bg6,bg7;
    public Udemy(){
        this.setTitle("Udemy");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(620, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 620, 800);
        panel2.setBackground(Color.white);
        panel2.setVisible(true);


        label3 = new JLabel("Redirecting to udemy...");
        label3.setVisible(true);
        label3.setBackground(Color.black);
        label3.setBounds(100, 300, 200, 200);
        label3.setLayout(null);
        panel2.add(label3);

        label5 = new JLabel("Mode3/Chrome/Udemy");
        label5.setFont(new Font("Playfair Display",Font.ITALIC,20));
        label5.setForeground(Color.BLACK);
        label5.setBounds(5,300,300,25);
        label5.setVisible(true);
        panel2.add(label5);

      

        bg2 = new ImageIcon("Elements/Chrome.png");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(0, 0, 620, 300);
        label2.setLayout(null);
       

bg1 = new ImageIcon("Elements/exit.png");
b1 = new JButton(bg1);
b1.setBounds(450,700,120,40);
b1.setFont(new Font("Arial", Font.BOLD, 16));
b1.setVisible(true);
panel2.add(b1);



    
b1.addActionListener(this);


panel2.add(label2);
this.add(panel2);


    }
     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
         Mode3 g = new Mode3();
         this.setVisible(false);
         g.setVisible(true);
        }
       



    }
}


