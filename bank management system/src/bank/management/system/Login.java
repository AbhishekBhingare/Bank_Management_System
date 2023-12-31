package bank.management.system;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton clear, signup, login;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login() {
        
        
        
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bankLogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new  JLabel("Card No :");
        cardno.setFont(new Font("Railway", Font.BOLD, 38));
        cardno.setBounds(120, 150, 400, 40);
        add(cardno);
        
        cardTextField = new JTextField(); 
        cardTextField.setBounds(320,160, 250, 30);
        cardTextField.setFont(new Font ("Arial", Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Railway", Font.BOLD, 38));
        pin.setBounds(120, 220,250, 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(320,225, 250, 30);
        pinTextField.setFont(new Font ("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        
        login = new JButton ("SIGN IN");
        login.setBounds(320,300, 100, 30);
        login.setBackground(Color.WHITE);   
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton ("CLEAR");
        clear.setBounds(470, 300, 100,30);
        clear.setBackground(Color.white);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton ("SIGN UP");
        signup.setBounds(320,350, 250,30);
        signup.setBackground(Color.white);
        signup.setForeground(Color.black);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        label.setBounds(80, 10, 100, 100);

    }
    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource()== login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' ";
            
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
        } 
        else if (ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
   }

    public static void main(String args[]) {
        new Login(); 
    }
}
