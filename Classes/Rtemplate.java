package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rtemplate extends JFrame implements ActionListener {
JPanel panel2;

JButton b1,b2,b3,b4,b5,b6;

JTextField t1, t2;
JLabel label1, label2,label3,label4,label5;
ImageIcon bg1,bg2,bg3,bg4,bg5,bg;


public Rtemplate() {
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
    

    label5 = new JLabel("Coming Soon");
    label5.setBounds(100,109,300,45);
    label5.setFont(new Font("sheriff",Font.BOLD,39));
    label5.setVisible(true);
    label5.setForeground(new Color(255, 69, 0));
    panel2.add(label5);

    b4 = new JButton("EXIT");
    b4.setBounds(500,380,120,50);
    b4.setFont(new Font("Arial", Font.BOLD, 16));
    b4.setBackground(Color.red);
    b4.setForeground(Color.WHITE);
    b4.setVisible(true);
    panel2.add(b4);
    b4.addActionListener(this);
   
    this.add(panel2);}

    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==b4)
        {
         SelectionR n = new SelectionR();
         this.setVisible(false);
         n.setVisible(true);
       
        



    }
}

}


    
