package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pFrame extends JFrame implements ActionListener {

    JPanel panel2;
    JButton b1,b2,b3,b4,b5,b6;
    JTextField t1, t2;
    JLabel label1, label2,label3,label4,label5, totalLabel, totalLabel2;
    ImageIcon bg1,bg2,bg3,bg4,bg5;
    JComboBox<String> itemComboBox, quantityComboBox;
    
    String[] items = {"Select", "Zest Orange", "Black Knight", "Sky walker"};
    String[] quantities = {"1", "2", "3", "4", "5"};
    int[] prices = {0, 2500, 2600, 2100};
    
    public pFrame(){

        this.setTitle("BUY");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null); 
        panel2.setBounds(0, 0, 600, 700);
   
        panel2.setVisible(true);
    
        bg2 = new ImageIcon("Elements/16285 (1).jpg");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(0, 0, 600, 300);
        label2.setLayout(null);

        bg1 = new ImageIcon("Elements/purchas.jpg");
        b1 = new JButton(bg1);
        b1.setBounds(0,300,390,400);
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setVisible(true);
        panel2.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(410,610,150,30);
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b2.setBackground(Color.red);
        b2.setForeground(Color.WHITE);
        b2.setVisible(true);
        panel2.add(b2);

        b3 = new JButton("Payment");
        b3.setBounds(410,570,150,30);
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.setVisible(true);
        panel2.add(b3);

        b2.addActionListener(this);
        b3.addActionListener(this);

        itemComboBox = new JComboBox<>(items);
        itemComboBox.setSelectedIndex(0);
        itemComboBox.setBackground(new Color(96, 96,96));
        itemComboBox.setForeground(Color.WHITE);
        itemComboBox.setBounds(400, 330, 150, 30);
        itemComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalPrice();
            }
        });
        panel2.add(itemComboBox);
        
        quantityComboBox = new JComboBox<>(quantities);
        quantityComboBox.setSelectedIndex(0);
        quantityComboBox.setBackground(new Color(96, 96,96));
        quantityComboBox.setForeground(Color.WHITE);
        quantityComboBox.setBounds(400, 380, 80, 30);
        quantityComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalPrice();
            }
        });
        panel2.add(quantityComboBox);
        
        totalLabel = new JLabel("Total Price: ৳" + prices[0]);
        totalLabel.setBounds(400, 410, 150, 30);
        panel2.add(totalLabel);
        
        totalLabel2 = new JLabel("After 25% off: ৳" + prices[0]);
        totalLabel2.setBounds(400, 430, 150, 30);
        totalLabel2.setForeground(Color.red);
        panel2.add(totalLabel2);

        panel2.add(label2);
        this.add(panel2);
    }
    public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b3)
			{
                Payment1 n = new Payment1();
                this.setVisible(false);
                n.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Merch n = new Merch();
                this.setVisible(false);
                n.setVisible(true);
			}

}

    
    private void updateTotalPrice() {
        int itemIndex = itemComboBox.getSelectedIndex();
        int quantity = Integer.parseInt((String) quantityComboBox.getSelectedItem());
        int totalPrice1 = prices[itemIndex] * quantity;
        double totalPrice = prices[itemIndex] * quantity*0.75;
        totalLabel.setText("Total Price: Tk" + totalPrice1);
        totalLabel2.setText("After 25% off: Tk" + totalPrice);
        
    }
}
