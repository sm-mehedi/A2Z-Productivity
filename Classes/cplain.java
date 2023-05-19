package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cplain extends JFrame implements ActionListener {
    JPanel panel2;
    JButton b1,b2,b3;
  
	JTextArea t1,t2;
    JLabel label1, label2;

    public cplain() {
        this.setTitle("Problem?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 500, 500);
        panel2.setBackground(new Color(64, 64, 64));
        panel2.setVisible(true);

        label2 = new JLabel("From");
        label2.setVisible(true);
        label2.setBounds(10, 10, 100, 50);
        label2.setForeground(Color.blue);
        label2.setBackground(new Color(64, 64, 64));
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setLayout(null);

        
        t1 = new JTextArea(); 
        t1.setBounds(10, 55, 400, 27);
        t1.setForeground(Color.DARK_GRAY);
        t1.setFont(new Font("sheriff", Font.ITALIC, 21));
       
        panel2.add(t1);

        label1 = new JLabel("Problem");
        label1.setVisible(true);
        label1.setBounds(10, 90, 100, 50);
        label1.setForeground(Color.blue);
        label1.setBackground(new Color(64, 64, 64));
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label1.setLayout(null);

        t2 = new JTextArea(); 
        t2.setBounds(10, 135, 450, 250);
        t2.setForeground(Color.DARK_GRAY);
        t2.setFont(new Font("sheriff", Font.ITALIC, 15));
        t2.setCaretPosition(0);
        panel2.add(t2);

        b1 = new JButton("Submit");
        b1.setBounds(10, 410, 120, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);
        b1.setVisible(true);
        panel2.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(340, 410, 120, 50);
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b2.setBackground(Color.red);
        b2.setForeground(Color.WHITE);
        b2.setVisible(true);
        panel2.add(b2);

        panel2.add(label2);
        panel2.add(label1);
        this.add(panel2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            
                t1.setText("");
                t2.setText("");
           
            JOptionPane.showMessageDialog(this, "Report Successful");
        } else if (ae.getSource() == b2) {
            page x = new page();
            this.setVisible(false);
            x.setVisible(true);
        }
    }
   
}
