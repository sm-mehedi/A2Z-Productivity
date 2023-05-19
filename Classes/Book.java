package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Book extends JFrame implements ActionListener {
JPanel panel2;

JButton b1,b2,b3,b4,b5,b6,b7;

JTextField t1, t2;
JLabel label1, label2,label3,label4,label5,label6,label7,label8,label9,label10;
ImageIcon bg1,bg2,bg3,bg4,bg5,bg6;


public Book() {
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
    panel2.setBackground(Color.BLACK);
    panel2.setVisible(true);
    

   

bg1 = new ImageIcon("Elements/TheGreatGatsby.jpg");
b1 = new JButton(bg1);
b1.setBounds(10,40,150,150);
b1.setFont(new Font("Arial", Font.BOLD, 16));
b1.setVisible(true);
panel2.add(b1);

bg2 = new ImageIcon("Elements/WarAndPeace.jpg");
b2 = new JButton(bg2);
b2.setBounds(200,40,150,150);
b2.setFont(new Font("Arial", Font.BOLD, 16));
b2.setVisible(true);
panel2.add(b2);
bg3 = new ImageIcon("Elements/TheOdyessey.jpg");
b3 = new JButton(bg3);
b3.setBounds(380,40,150,150);
b3.setFont(new Font("Arial", Font.BOLD, 16));
b3.setVisible(true);
panel2.add(b3);

bg4 = new ImageIcon("Elements/EkatorerDinguli.jpg");
b4 = new JButton(bg4);
b4.setBounds(10,250,150,150);
b4.setFont(new Font("Arial", Font.BOLD, 16));
b4.setVisible(true);
panel2.add(b4);

bg5 = new ImageIcon("Elements/PotherPachali.jpg");
b5 = new JButton(bg5);
b5.setBounds(200,250,150,150);
b5.setFont(new Font("Arial", Font.BOLD, 16));
b5.setVisible(true);
panel2.add(b5);

bg6 = new ImageIcon("Elements/ThoseDays.jpg");
b6= new JButton(bg6);
b6.setBounds(380,250,150,150);
b6.setFont(new Font("Arial", Font.BOLD, 16));
b6.setVisible(true);
panel2.add(b6);

b7 = new JButton("Back");
b7.setBounds(230,720,150,40);
b7.setFont(new Font("Arial", Font.BOLD, 16));
b7.setBackground(Color.RED);
b7.setForeground(Color.white);
b7.setVisible(true);


bg2 = new ImageIcon("Elements/BookBanner.jpg");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(540, 5, 150, 450);
        label2.setLayout(null);

        label4 = new JLabel("The Great Gatsby");
        label4.setVisible(true);
        label4.setForeground(Color.yellow);
        label4.setBounds(30, 180, 100, 50);
        label4.setLayout(null);

        label5 = new JLabel("The Odyssey");
        label5.setVisible(true);
        label5.setForeground(Color.yellow);
        label5.setBounds(410, 180, 100, 50);
        label5.setLayout(null);

        label6 = new JLabel("War and Peace");
        label6.setVisible(true);
        label6.setForeground(Color.yellow);
        label6.setBounds(230, 180, 100, 50);
        label6.setLayout(null);

        label7 = new JLabel("Ekatorer Dinguli");
        label7.setVisible(true);
        label7.setForeground(Color.yellow);
        label7.setBounds(35, 400, 100, 50);
        label7.setLayout(null);

        
        label8 = new JLabel("Pother Pachali");
        label8.setVisible(true);
        label8.setForeground(Color.yellow);
        label8.setBounds(235, 400, 100, 50);
        label8.setLayout(null);

        label9 = new JLabel("Those Days");
        label9.setVisible(true);
        label9.setForeground(Color.yellow);
        label9.setBounds(410, 400, 100, 50);
        label9.setLayout(null);

panel2.add(label2);
panel2.add(b7);
panel2.add(label4);
panel2.add(label5);
panel2.add(label6);
panel2.add(label7);
panel2.add(label8);
panel2.add(label9);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);

   
    this.add(panel2);}

    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==b4)
        {
         Payment4 n = new Payment4();
         this.setVisible(false);
         n.setVisible(true);
       
        



    }
    else if(ae.getSource()==b3)
    {
     Payment4 n = new Payment4();
     this.setVisible(false);
     n.setVisible(true);
   
    



}
else if(ae.getSource()==b2)
{
 Payment4 n = new Payment4();
 this.setVisible(false);
 n.setVisible(true);





}
else if(ae.getSource()==b1)
{
 Payment4 n = new Payment4();
 this.setVisible(false);
 n.setVisible(true);





}
else if(ae.getSource()==b5)
{
 Payment4 n = new Payment4();
 this.setVisible(false);
 n.setVisible(true);





}
else if(ae.getSource()==b6)
{
 Payment4 n = new Payment4();
 this.setVisible(false);
 n.setVisible(true);





}
else if(ae.getSource()==b7)
{
 Payment4 n = new Payment4();
 this.setVisible(false);
 n.setVisible(true);





}
}

}


    
