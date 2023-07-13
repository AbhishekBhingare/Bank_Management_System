
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{
    
    JButton hundered, Fhundered, OThousand, Tthousand, Fthousand, Tenthouand,  back;
    String pinnumber;
    FastCash(String pinnumber) {
       
        this.pinnumber = pinnumber;
      
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Select withdrawable Amount");
        text.setBounds(220,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        hundered = new JButton("100");
        hundered.setBounds(170,415,150,30);
        hundered.addActionListener(this);
        image.add(hundered);
        
        Fhundered = new JButton("500");
        Fhundered.setBounds(355,415,150,30);
        Fhundered.addActionListener(this);
        image.add(Fhundered);
        
        OThousand = new JButton("1000");
        OThousand.setBounds(170,450,150,30);
        OThousand.addActionListener(this);
        image.add(OThousand);
        
        Tthousand = new JButton("2000");
        Tthousand.setBounds(355,450,150,30);
        Tthousand.addActionListener(this);
        image.add(Tthousand);
        
        Fthousand = new JButton("5000");
        Fthousand.setBounds(170,485,150,30);
        Fthousand.addActionListener(this);
        image.add(Fthousand);
        
        Tenthouand = new JButton("10000");
        Tenthouand.setBounds(355,485,150,30);
        Tenthouand.addActionListener(this);
        image.add(Tenthouand);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
                
        
        setSize(900,900);
        setLocation(300,0);
        
        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        else{
            String amount = ((JButton )ae.getSource()).getText();
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        
                        balance+= Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance-= Integer.parseInt(rs.getString("amount"));
                        
                    }
                    
                }
                
                if (ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl',  '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog( null, "Rs "+ amount+ " Debited Successfully");
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                
                
            }catch(Exception e){
                System.out.println(e);
                
                
            }
        }
    }
    
    
    public static void main(String args[]) {
        new FastCash("");


    }
}
