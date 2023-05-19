package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ticketp extends JFrame implements ActionListener {
JPanel  panel2;
JButton b1,b2;
JTextField t1;
JLabel label1, label2, label3,label4,label5,label6,priceLabel;
ImageIcon bg1,bg2;
private JRadioButton privateUniRadioButton, publicUniRadioButton;
private JComboBox<String> uniComboBox,uniComboBox1, roomComboBox,droomComboBox;

private JRadioButton doorSideRadioButton, driverSideRadioButton;



JPasswordField t2;
JCheckBox showPasswordCheckbox;


public Ticketp() {
    this.setTitle("A2Z Productivity");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 800);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 800, 800);
    panel2.setBackground(new Color(90,90,90));
    panel2.setVisible(true);

    privateUniRadioButton = new JRadioButton("Private University");
    privateUniRadioButton.setBounds(410, 250, 200, 50);
    privateUniRadioButton.setBackground(new Color(90,90,90));
    privateUniRadioButton.setForeground(Color.YELLOW);
    privateUniRadioButton.addActionListener(this);
    panel2.add(privateUniRadioButton);

    publicUniRadioButton = new JRadioButton("Public University");
    publicUniRadioButton.setBounds(610, 250, 200, 50);
    publicUniRadioButton.setBackground(new Color(90,90,90));
    publicUniRadioButton.setForeground(Color.YELLOW);
    publicUniRadioButton.addActionListener(this);
    publicUniRadioButton.addActionListener(this);
    panel2.add(publicUniRadioButton);

    uniComboBox = new JComboBox<String>(new String[] {"University of Dhaka", "University of Rajshahi", "Bangladesh Agricultural University"," Bangladesh University of Engineering & Technology","University of Chittagong","Jahangirnagar University","Islamic University, Bangladesh","Shahjalal University of Science & Technology","Khulna University","National University","Bangabandhu Sheikh Mujib Medical University,"});
    uniComboBox.setVisible(false);
    uniComboBox.setBackground(Color.YELLOW);
    uniComboBox.setBounds(410, 320, 350, 50);
    panel2.add(uniComboBox);

    uniComboBox1 = new JComboBox<String>(new String[] {"American International University-Bangladesh", "Independent University, Bangladesh", "Ahsanullah University of Science and Technology"," East West University","University of Asia Pacific","  International Islamic University Chittagong","Central Women's University","North South University"});
    uniComboBox1.setVisible(false);
    uniComboBox1.setBackground(Color.YELLOW);
    uniComboBox1.setBounds(410, 320, 350, 50);
    panel2.add(uniComboBox1);
    
    doorSideRadioButton = new JRadioButton("Door Side");
    doorSideRadioButton.setBounds(410, 400, 200, 50);
    doorSideRadioButton.setBackground(new Color(90,90,90));
    doorSideRadioButton.setForeground(Color.YELLOW);
    panel2.add(doorSideRadioButton);
    doorSideRadioButton.addActionListener(this);

    driverSideRadioButton = new JRadioButton("Driver Side");
    driverSideRadioButton.setBounds(610, 400, 200, 50);
    driverSideRadioButton.setBackground(new Color(90,90,90));
    driverSideRadioButton.setForeground(Color.YELLOW);
    panel2.add(driverSideRadioButton);
    driverSideRadioButton.addActionListener(this);

    roomComboBox = new JComboBox<String>(new String[] {
        "A-1", "A-2", "B-1", "B-2", "C-1", "C-2", "D-1", "D-2",
        "E-1", "E-2", "F-1", "F-2", "G-1", "G-2", "H-1", "H-2",
        "I-1", "I-2", "J-1", "J-2"
    });
    roomComboBox.setVisible(false);
    roomComboBox.setBackground(Color.YELLOW);
    roomComboBox.setBounds(410, 450, 350, 50);
    panel2.add(roomComboBox);

    droomComboBox = new JComboBox<String>(new String[] {
        "A-3", "A-4", "B-3", "B-4", "C-3", "C-4", "D-3", "D-4",
                    "E-3", "E-4", "F-3", "F-4", "G-3", "G-4", "H-3", "H-4",
                    "I-3", "I-4", "J-3", "J-4"
    });
    droomComboBox.setVisible(false);
    droomComboBox.setBackground(Color.YELLOW);
    droomComboBox.setBounds(410, 450, 350, 50);
    panel2.add(droomComboBox);



    bg1 = new ImageIcon("Elements/seatplan.png");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 400, 800);
    label1.setLayout(null);
    panel2.add(label1);

    label2 = new JLabel("Choose your seat");
    label2.setVisible(true);
    label2.setBounds(510, 15, 205, 270);
    label2.setFont(new Font("Segoe UI", Font.BOLD, 20));
    label2.setForeground(Color.yellow);
    label2.setLayout(null);
    panel2.add(label2);

    priceLabel = new JLabel();
    priceLabel.setVisible(true);
    priceLabel.setBounds(420, 300, 350, 500);
    priceLabel.setForeground(Color.red);
    priceLabel.setFont(new Font(getName(), ABORT, 50));
    priceLabel.setLayout(null);
    panel2.add(priceLabel);


    label3 = new JLabel("Available only for admission candidates from Dhaka");
    label3.setVisible(true);
    label3.setBounds(400, 70, 500, 270);
    label3.setFont(new Font("Segoe UI", Font.BOLD, 15));
    label3.setForeground(Color.yellow);
    label3.setLayout(null);
    panel2.add(label3);



    


    b1 = new JButton("Purchase");
    b1.setBounds(410,690,120,50);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setBackground(Color.ORANGE);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel2.add(b1);

    b2 = new JButton("Return");
    b2.setBounds(650,690,120,50);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setBackground(Color.ORANGE);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    panel2.add(b2);
    this.add(panel2);
   
    this.setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);
  

}
public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b1)
			{
	           Payment n = new Payment();
               this.setVisible(false);
               n.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Mode3 x = new Mode3();
                this.setVisible(false);
                x.setVisible(true);
			}
            
            
            if (ae.getSource() == privateUniRadioButton) {
                uniComboBox1.setVisible(true);
                
                priceLabel.setText("Price: 300 taka");
            } else if (ae.getSource() == publicUniRadioButton) {
                
                uniComboBox.setVisible(true);
                priceLabel.setText("Price: 600 taka");
            } else if (ae.getSource() == doorSideRadioButton) {
                
                roomComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
                    "A-1", "A-2", "B-1", "B-2", "C-1", "C-2", "D-1", "D-2",
                    "E-1", "E-2", "F-1", "F-2", "G-1", "G-2", "H-1", "H-2",
                    "I-1", "I-2", "J-1", "J-2"
                }));
                roomComboBox.setVisible(true);
            } 
            else if (ae.getSource() == driverSideRadioButton) {
                droomComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
                    "A-3", "A-4", "B-3", "B-4", "C-3", "C-4", "D-3", "D-4",
                    "E-3", "E-4", "F-3", "F-4", "G-3", "G-4", "H-3", "H-4",
                    "I-3", "I-4", "J-3", "J-4"
                }));
                droomComboBox.setVisible(true);
            } 
            for(int i = 0;i<100;i++){
                
                {if(ae.getSource() == doorSideRadioButton)
                driverSideRadioButton.setSelected(false);}
            }
           
        
            for(int i = 0;i<100;i++){
                
                {if(ae.getSource() == driverSideRadioButton)
                    doorSideRadioButton.setSelected(false);}
            }
            for(int i = 0;i<100;i++){
                
                if(ae.getSource() == publicUniRadioButton){
                    publicUniRadioButton.setSelected(false);
                }
            }
           
        
            for(int i = 0;i<100;i++){
                
                if(ae.getSource() == privateUniRadioButton){
                    privateUniRadioButton.setSelected(false);
                }
            }
        }

}
			

