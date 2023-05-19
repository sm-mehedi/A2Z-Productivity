package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
public class LogIn extends JFrame implements ActionListener {
JPanel  panel2, panel3;
JButton b1,b2;
JTextField t1;
JLabel label1, label2, label3,label4,label5,label6;
ImageIcon bg1,bg2;

JPasswordField t2;
JCheckBox showPasswordCheckbox;


public LogIn() {
    this.setTitle("A2Z Productivity");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 800);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 240, 800);
    panel2.setVisible(true);

    bg1 = new ImageIcon("Elements/A12.jpg");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 240, 800);
    label1.setLayout(null);
    panel2.add(label1);



    panel3 = new JPanel();
    panel3.setLayout(null);
    panel3.setBackground(new Color(0, 9, 83));
    panel3.setBounds(230, 220, 580, 300);
    panel3.setVisible(true);

    bg2 = new ImageIcon("Elements/A2Z (1).png");
    label2 = new JLabel(bg2);
    label2.setVisible(true);
    label2.setBounds(435, 15, 185, 270);
    label2.setLayout(null);
    panel3.add(label2);

    label3 = new JLabel("USERNAME");
	label3.setFont(new Font("Playfair Display",Font.ITALIC,25));
	label3.setForeground(Color.ORANGE);
	label3.setBounds(280,470,150,25);
    label3.setVisible(true);
	panel3.add(label3);

    t1 = new JTextField();
	t1.setBounds(440,465,300,37);
    t1.setForeground(Color.DARK_GRAY);
    t1.setFont(new Font("sheriff",Font.ITALIC,21));
	panel3.add(t1);

    label4 = new JLabel("PASSWORD");
	label4.setFont(new Font("Playfair Display",Font.ITALIC,25));
	label4.setForeground(Color.ORANGE);
	label4.setBounds(276,540,150,25);
    label4.setVisible(true);
	panel3.add(label4);
    
    t2 = new JPasswordField();
	t2.setBounds(437,535,300,37);
    t2.setForeground(Color.DARK_GRAY);
    t2.setFont(new Font("sheriff",Font.ITALIC,21));
	panel3.add(t2);
    

    label5 = new JLabel("Hi,there!!");
    label5.setBounds(290,339,300,33);
    label5.setFont(new Font("sheriff",Font.BOLD,39));
    label5.setVisible(true);
    label5.setForeground(new Color(255, 69, 0));
    panel3.add(label5);

    label6 = new JLabel("Productivity is the key to success....");
    label6.setFont(new Font("Ariel",Font.ITALIC,18));
    label6.setForeground(Color.WHITE);
    label6.setBounds(290,390,350,33);
    label6.setVisible(true);
    panel3.add(label6);


    b1 = new JButton("LOGIN!");
    b1.setBounds(276,650,120,50);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setBackground(Color.ORANGE);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel3.add(b1);

    b2 = new JButton("SignUp");
    b2.setBounds(620,650,120,50);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setBackground(Color.ORANGE);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    panel3.add(b2);
    this.add(panel2);
    this.add(panel3);
    this.setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource() == b1)
            {
                String username = t1.getText();
                String password = t2.getText();
                if(username.isEmpty()||password.isEmpty())
                {
                     JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",JOptionPane.WARNING_MESSAGE);
                }
                
                else
                {
                    try 
                    {
                        File file = new File("D:\\A2Z Productivity\\Data\\user_login.txt");
                        if (!file.exists()) 
                        {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);
    
    
    
                        pw.println("___A2Z_______USER SIGN IN DATA__________");
        
                        pw.println("Username   : " + username);
                        pw.println("Password : " + password);
                        pw.println("--------------------------------------------");
                        pw.close();
                    }
                    catch (Exception ex) 
                    {
                        System.out.print(ex);
                    }
                    JOptionPane.showMessageDialog(null,"Sign in Successful!");
                    
                     page p12=new page();
                    this.setVisible(false);
                    p12.setVisible(true);
                    
                }
            }
			else if(ae.getSource()==b2)
			{
				SignupForm x = new SignupForm();
                this.setVisible(false);
                x.setVisible(true);
			}

}
			

}