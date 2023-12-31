package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hp
 */
public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fTextField, emailTextField, addressTextField, cityTextField, emailText, stateTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;

    SignupOne() {

        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000) + 1000);

        JLabel formno = new JLabel("APPLICATION FORM NO :" + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personald = new JLabel("Page 1 : Personal Details");
        personald.setFont(new Font("Raleway", Font.BOLD, 20));
        personald.setBounds(290, 80, 400, 30);
        add(personald);

        JLabel name = new JLabel("Name :-");
        name.setFont(new Font("Ralway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father Name :-");
        fname.setFont(new Font("raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fTextField = new JTextField();
        fTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        fTextField.setBounds(300, 190, 400, 30);
        add(fTextField);

        JLabel dob = new JLabel("Date of Birth :-");
        dob.setFont(new Font("raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        // NOT WORKING DATECHOOSER
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender :-");
        gender.setFont(new Font("raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(400, 290, 90, 30);
        female.setBackground(Color.white);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(500, 290, 60, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JLabel email = new JLabel("Email Address :-");
        email.setFont(new Font("rdaleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailText = new JTextField();
        emailText.setFont(new Font("Raleway", Font.BOLD, 17));
        emailText.setBounds(300, 340, 400, 30);
        add(emailText);

        JLabel marital = new JLabel("Marital Status");
        marital.setFont(new Font("Arial", Font.BOLD, 20));
        marital.setBounds(100, 380, 200, 30);
        add(marital);

//    JTextField maritalTextField = new JTextField ();
//    maritalTextField.setFont(new Font("Raleway", Font.BOLD, 17));
//    maritalTextField.setBounds(300,380,400,30);
//    add(maritalTextField);
        married = new JRadioButton("Married");
        married.setBounds(300, 380, 100, 30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("UnMarried");
        unmarried.setBounds(450, 380, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        JRadioButton others = new JRadioButton("Others");
        others.setBounds(630, 380, 100, 30);
        others.setBackground(Color.white);
        add(others);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);

        JLabel address = new JLabel("Address :-");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 420, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        addressTextField.setBounds(300, 420, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City :-");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 460, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        cityTextField.setBounds(300, 460, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State :-");
        state.setFont(new Font("raleway", Font.BOLD, 20));
        state.setBounds(100, 500, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        stateTextField.setBounds(300, 500, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code :-");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 540, 200, 30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        pincodeTextField.setBounds(300, 540, 400, 30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        }
        String email = emailText.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();

        try {
            if (name.equals("")) {
                //JOptionPane.showMessageDialog(null, "Name is Required");
                JOptionPane.showMessageDialog(null, "Name is Required");

            } else if (fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father name is Required");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null, "Date of birth Required");
            } else if (gender == null) {
                JOptionPane.showMessageDialog(null, "In Gender One Option Required");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email ID Required");
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(null, "Invalid Email ID");
            } else if (marital == null) {
                JOptionPane.showMessageDialog(null, "In Marital One Option Required ");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address Required");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "City is Required");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "State is Required");
            } else if (!pin.contains("1") && !pin.contains("2") && !pin.contains("3") && !pin.contains("4") && !pin.contains("5") && !pin.contains("6") && !pin.contains("7") && !pin.contains("8") && !pin.contains("9") && !pin.contains("0")) {
                JOptionPane.showMessageDialog(null, "Pincode Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup1 values ('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "','" + email + "', '" + marital + "', '" + address + "' , '" + city + "', '" + pin + "', '" + state + "')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);       
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {
        new SignupOne();
    }

}
