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
public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JTextField  ExisitingAccountTextField, AaddharNoTextField ,panNoTextField ;
    JButton next;
    JRadioButton ExisitingAccountButtonYes, ExisitingAccountButtonNo, SeniorNo, SeniorYes;
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    SignupTwo(String formno) {
        
        this.formno= formno;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
    
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religious");
        name.setFont(new Font("Ralway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion [] = { "Hindu", "Muslim","Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        //religion.setFont(new Font ("Raleway", Font.BOLD,17));
        add(religion);
        
        

        JLabel Category = new JLabel("Category");
        Category.setFont(new Font("raleway", Font.BOLD, 20));
        Category.setBounds(100, 190, 200, 30);
        add(Category);
        
        String valCategory[] = {"Genereal", "OBC", "SC", "ST", "OTHER"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

//        fTextField = new JTextField();
//        fTextField.setFont(new Font("Raleway", Font.BOLD, 17));
//        fTextField.setBounds(300, 190, 400, 30);
//        add(fTextField);

        JLabel Income = new JLabel("Income");
        Income.setFont(new Font("raleway", Font.BOLD, 20));
        Income.setBounds(100, 240, 200, 30);
        add(Income);

        
        String incomeCategory [] = {"NULL","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBackground(Color.white);
        income.setBounds(300,240,400,30);
        add(income);
        
        // NOT WORKING DATECHOOSER
        

        JLabel Educational = new JLabel("Educational");
        Educational.setFont(new Font("raleway", Font.BOLD, 20));
        Educational.setBounds(100, 290, 200, 30);
        add(Educational);
        
        JLabel Qualification = new JLabel("Qualification  :-");
        Qualification.setFont(new Font("rdaleway", Font.BOLD, 20));
        Qualification.setBounds(100, 315, 200, 30);
        add(Qualification);
        
        
        String Educationval [] = { "Post-Graduationn", "Graduate","12th", "10th","Other"};
        education = new JComboBox(Educationval);
        education.setBounds(300,315,200,30);
        education.setBackground(Color.white);
        add(education);
        
        JLabel Occupation = new JLabel("Occupation :-");
        Occupation.setFont(new Font("Arial", Font.BOLD, 20));
        Occupation.setBounds(100, 390, 200, 30);
        add(Occupation);
        
        
        String Occupationvalues [] = {"Salaried", "Self-Employed", "Bussiness", "Student","Retired","Other"};
        occupation = new JComboBox (Occupationvalues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        

        
        
        
        
       

 
//
//        emailText = new JTextField();
//        emailText.setFont(new Font("Raleway", Font.BOLD, 17));
//        emailText.setBounds(300, 340, 400, 30);
//        add(emailText);

 

//        emailText = new JTextField();
//        emailText.setFont(new Font("Raleway", Font.BOLD, 17));
//        emailText.setBounds(300, 340, 400, 30);
//        add(emailText);

 

//        emailText = new JTextField();
//        emailText.setFont(new Font("Raleway", Font.BOLD, 17));
//        emailText.setBounds(300, 340, 400, 30);
//        add(emailText);
//
// 
//
//        emailText = new JTextField();
//        emailText.setFont(new Font("Raleway", Font.BOLD, 17));
//        emailText.setBounds(300, 340, 400, 30);
//        add(emailText);

 

//        emailText = new JTextField();
//        emailText.setFont(new Font("Raleway", Font.BOLD, 17));
//        emailText.setBounds(300, 340, 400, 30);
//        add(emailText);



//    JTextField maritalTextField = new JTextField ();
//    maritalTextField.setFont(new Font("Raleway", Font.BOLD, 17));
//    maritalTextField.setBounds(300,380,400,30);
//    add(maritalTextField);


        JLabel panNo = new JLabel("PAN Number :-");
        panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        panNo.setBounds(100, 440, 200, 30);
        add(panNo);

        panNoTextField = new JTextField();
        panNoTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        panNoTextField.setBounds(300, 440, 400, 30);
        add(panNoTextField);

        JLabel Aaddhar = new JLabel("Aaddhar NO :-");
        Aaddhar.setFont(new Font("Raleway", Font.BOLD, 20));
        Aaddhar.setBounds(100, 490, 200, 30);
        add(Aaddhar);

        AaddharNoTextField = new JTextField();
        AaddharNoTextField.setFont(new Font("Raleway", Font.BOLD, 17));
        AaddharNoTextField.setBounds(300, 490, 400, 30);
        add(AaddharNoTextField);

        JLabel state = new JLabel("Senior Citizen :-");
        state.setFont(new Font("raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        SeniorYes = new JRadioButton("Yes");
        SeniorYes.setBounds(300, 540, 100, 30);
        SeniorYes.setBackground(Color.white);
        add(SeniorYes);

        SeniorNo = new JRadioButton("No");
        SeniorNo.setBounds(450, 540, 100, 30);
        SeniorNo.setBackground(Color.white);
        add(SeniorNo);


        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(SeniorYes);
        genderGroup.add(SeniorNo);



        JLabel ExisitingAcc = new JLabel("Exisiting Account  :-");
        ExisitingAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        ExisitingAcc.setBounds(100, 590, 200, 30);
        add(ExisitingAcc);

        
        ExisitingAccountButtonYes = new JRadioButton("Yes");
        ExisitingAccountButtonYes.setBounds(300, 590, 100, 30);
        ExisitingAccountButtonYes.setBackground(Color.white);
        add(ExisitingAccountButtonYes);

        ExisitingAccountButtonNo = new JRadioButton("No");
        ExisitingAccountButtonNo.setBounds(450, 590, 100, 30);
        ExisitingAccountButtonNo.setBackground(Color.white);
        add(ExisitingAccountButtonNo);


        ButtonGroup ExisitingAccountGroup = new ButtonGroup();
        ExisitingAccountGroup.add(ExisitingAccountButtonYes);
        ExisitingAccountGroup.add(ExisitingAccountButtonNo);

       
//        ExisitingAccountTextField = new JTextField();
//        ExisitingAccountTextField.setFont(new Font("Raleway", Font.BOLD, 17));
//        ExisitingAccountTextField.setBounds(300, 590, 400, 30);
//        add(ExisitingAccountTextField);
//          

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

    public void  actionPerformed(ActionEvent ae) {
        formno = "" + random;
        String Sreligion = (String) religion.getSelectedItem();
        String Scategory = (String) category.getSelectedItem();
        String Sincome = (String) income.getSelectedItem();
        String Seducation = (String) education.getSelectedItem();
        String Soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        
        String gender = null;

        if (SeniorYes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (SeniorNo.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (ExisitingAccountButtonYes.isSelected()) {
            existingaccount = "Yes";
        } else if (ExisitingAccountButtonNo.isSelected()) {
            existingaccount = "No";
        }
        String Saddhar = AaddharNoTextField.getText();
        String Span = panNoTextField.getText();
        
       
        try {
            Conn c = new Conn();    
            String query = "insert into signup2 values ('" + formno + "', '" + Sreligion + "', '" + Scategory + "', '" + Sincome + "', '" + Seducation + "','" + Soccupation + "', '" + Span + "', '" + Saddhar + "' , '" + seniorcitizen + "', '" + existingaccount + "')";
            c.s.executeUpdate(query);
            
            
//            Signup three object 
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
        

 //       try {
//            if (name.equals("")) {
//                //JOptionPane.showMessageDialog(null, "Name is Required");
//                JOptionPane.showMessageDialog(null, "Name is Required");
//
//            } else if (fname.equals("")) {
//                JOptionPane.showMessageDialog(null, "Father name is Required");
//            } else if (dob.equals("")) {
//                JOptionPane.showMessageDialog(null, "Date of birth Required");
//            } else if (gender == null) {
//                JOptionPane.showMessageDialog(null, "In Gender One Option Required");
//            } else if (email.equals("")) {
//                JOptionPane.showMessageDialog(null, "Email ID Required");
//            } else if (!email.contains("@")) {
//                JOptionPane.showMessageDialog(null, "Invalid Email ID");
//            } else if (marital == null) {
//                JOptionPane.showMessageDialog(null, "In Marital One Option Required ");
//            } else if (address.equals("")) {
//                JOptionPane.showMessageDialog(null, "Address Required");
//            } else if (city.equals("")) {
//                JOptionPane.showMessageDialog(null, "City is Required");
//            } else if (state.equals("")) {
//                JOptionPane.showMessageDialog(null, "State is Required");
//            } else if (!pin.contains("1") && !pin.contains("2") && !pin.contains("3") && !pin.contains("4") && !pin.contains("5") && !pin.contains("6") && !pin.contains("7") && !pin.contains("8") && !pin.contains("9") && !pin.contains("0")) {
//                JOptionPane.showMessageDialog(null, "Pincode Required");
//            } else {
//                Conn c = new Conn();
//                String query = "insert into signupTwo values ('" + formno + "', '" + Sreligion + "', '" + Scategory + "', '" + Sincome + "', '" + Seducation + "','" + Soccupation + "', '" + Span + "', '" + Saddhar + "' , '" + seniorcitizen + "', '" + existingaccount + "')";
//                c.s.executeUpdate(query);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }

    }

    public static void main(String args[]) {
        new SignupTwo("");
    }

}
