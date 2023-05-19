package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Team extends JFrame implements ActionListener{

    JPanel panel2;

    JButton b1,b2,b3;
    
    JTextField t1, t2;
    JLabel label2;
    ImageIcon bg1,bg2;
    public Team(){

        this.setTitle("GO TEAM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(810, 830);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 810, 830);
        panel2.setBackground(Color.ORANGE);
        panel2.setVisible(true);
    
        bg2 = new ImageIcon("Elements/teamsada.png");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(0, 0, 800, 800);
        label2.setLayout(null);
        panel2.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(630,700,120,30);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.setVisible(true);
        panel2.add(b1);
        this.add(panel2);
        b1.addActionListener(this);
    }
    
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
        First n = new First();
        this.setVisible(false);
        n.setVisible(true);
    }
}
}