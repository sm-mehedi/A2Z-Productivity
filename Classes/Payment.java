package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener{

    JPanel panel2;

    JButton b1,b2,b3;
    
    JTextField t1, t2;
    JLabel label1, label2,label3,label4,label5;
    ImageIcon bg1,bg2;

public Payment(){

    this.setTitle("Payment");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 800);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setResizable(false);
 

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 500, 800);
    panel2.setBackground(Color.ORANGE);
    panel2.setVisible(true);

    bg2 = new ImageIcon("Elements/ccard (1).jpg");
    label2 = new JLabel(bg2);
    label2.setVisible(true);
    label2.setBounds(10, 15, 454, 350);
    label2.setLayout(null);
    panel2.add(label2);
    
    label5 = new JLabel();
    label5.setVisible(true);
    label5.setBounds(90, 380, 300, 100);
    label5.setFont(new Font("Calbri",Font.BOLD,35));
    label5.setForeground(Color.red);
    label5.setLayout(null);
    panel2.add(label5);

    label3 = new JLabel("Card Number:");
	label3.setFont(new Font("Playfair Display",Font.ITALIC,25));
	label3.setForeground(Color.BLACK);
	label3.setBounds(10,450,350,25);
    label3.setVisible(true);
	panel2.add(label3);

    t1 = new JTextField();
	t1.setBounds(10,500,450,37);
    t1.setForeground(Color.DARK_GRAY);
    t1.setFont(new Font("sheriff",Font.ITALIC,21));
	panel2.add(t1);

    label4 = new JLabel("Amount:");
	label4.setFont(new Font("Playfair Display",Font.ITALIC,25));
	label4.setForeground(Color.BLACK);
	label4.setBounds(10,570,450,25);
    label4.setVisible(true);
	panel2.add(label4);
    
    t2 = new JTextField();
	t2.setBounds(10,620,450,37);
    t2.setForeground(Color.DARK_GRAY);
    t2.setFont(new Font("sheriff",Font.ITALIC,21));
	panel2.add(t2);

    b1 = new JButton("PAY");
    b1.setBounds(20,700,120,50);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setBackground(Color.BLUE);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel2.add(b1);

    b2 = new JButton("BACK");
    b2.setBounds(350,700,120,50);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setBackground(Color.RED);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    panel2.add(b2);

  




    this.add(panel2);
    b1.addActionListener(this);
    b2.addActionListener(this);






}
public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b1)
			{
                if (t1.getText().equals("") || t2.getText().equals("") 
                            ) {JOptionPane.showMessageDialog(null, " You need to give all information ", "Message",
                                -1);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Payment Complete", "Thank You", -1);
                         
                        t1.setText("");
                        t2.setText("");
                        
			}}
			else if(ae.getSource()==b2)
			{
				Ticketp n = new Ticketp();
                this.setVisible(false);
                n.setVisible(true);
			}

}



}

