package online.banking.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.lang.Math;

public class signup extends JFrame implements ActionListener {



    JDateChooser calendar;

    JTextField fname,Lname,mobile1,email1,per,cor;                                                                  // Make sure always declare textfield global , because during action -method it create problems

    JRadioButton button1,button2,button3,button4;
    JButton next;

    Random ran = new Random();

    long digit4 =(ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(digit4);              // Getting problem here

    signup(){

        super("APPLICATION FORM");

        ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image p2 = p1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon p3 = new ImageIcon(p2);
        JLabel image = new JLabel(p3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1= new JLabel("APPLICATION NO."+ first);
        label1.setFont(new Font("Arial",Font.BOLD,30));
        label1.setBounds(250,20,550,40);
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setForeground(Color.gray);
        label2.setFont(new Font("Arial",Font.BOLD,22));
        label2.setBounds(400,120,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details " );
        label3.setFont(new Font("Arial",Font.BOLD,22));
        label3.setBounds(160,160,600,30);
        add(label3);

      JLabel  printname = new JLabel("First Name: ");
        printname.setFont(new Font("Arial",Font.BOLD,18));
        printname.setBounds(160,200,600,30);
        add(printname);

         fname = new JTextField();
        fname.setFont(new Font("Arial",Font.BOLD,15));
        fname.setBounds(400,200,280,25);
        add(fname);

        JLabel printLname = new JLabel("Last name: ");
        printLname.setFont(new Font("Arial",Font.BOLD,18));
        printLname.setBounds(160,240,600,30);
        add(printLname);

         Lname = new JTextField(6);
        Lname.setFont(new Font("Arial",Font.BOLD,15));
        Lname.setBounds(400,240,280,25);
        add(Lname);

       JLabel printgender = new JLabel("Gender: ");
        printgender.setFont(new Font("Arial",Font.BOLD,18));
        printgender.setBounds(160,280,600,30);
        add(printgender);

        button1 = new JRadioButton("Male");
        button1.setFont(new Font("Arial",Font.BOLD,10));
        button1.setBounds(400,280,65,25);
        add(button1);

        button2 = new JRadioButton("Female");
        button2.setFont(new Font("Arial",Font.BOLD,10));
        button2.setBounds(500,280,70,25);
        add(button2);


        ButtonGroup onebutton = new ButtonGroup();
        onebutton.add(button1);
        onebutton.add(button2);

        JLabel date = new JLabel("Date of Birth: ");
        date.setFont(new Font("Arial",Font.BOLD,18));
        date.setBounds(160,320,600,30);
        add(date);

        calendar= new JDateChooser();
        calendar.setForeground(new Color(105,104,104));
        calendar.setBounds(400,320,200,25);
        add(calendar);

        JLabel printmobile = new JLabel("Mobile No: ");
        printmobile.setFont(new Font("Arial",Font.BOLD,18));
        printmobile.setBounds(160,360,600,30);
        add(printmobile);

        mobile1 = new JTextField(6);
        mobile1.setFont(new Font("Arial",Font.BOLD,15));
        mobile1.setBounds(400,360,280,25);
        add(mobile1);

        JLabel printemail = new JLabel("Email Address: ");
        printemail.setFont(new Font("Arial",Font.BOLD,18));
        printemail.setBounds(160,400,600,30);
        add(printemail);

         email1 = new JTextField(6);
        email1.setFont(new Font("Arial",Font.BOLD,15));
        email1.setBounds(400,400,280,25);
        add(email1);

       JLabel marital = new JLabel("Marital Status: ");
       marital.setFont(new Font("Arial",Font.BOLD,18));
       marital.setBounds(160,440,600,30);
       add(marital);


         button3 = new JRadioButton("Married");
        button3.setFont(new Font("Arial",Font.BOLD,10));
        button3.setBounds(400,440,70,25);
        add(button3);


         button4 = new JRadioButton("Unmarried");
        button4.setFont(new Font("Arial",Font.BOLD,10));
        button4.setBounds(500,440,100,25);
        add(button4);

        ButtonGroup onebutton1 = new ButtonGroup();
        onebutton1.add(button3);
        onebutton1.add(button4);

       JLabel permanent = new JLabel("Permanent Address: ");
       permanent.setFont(new Font("Arial",Font.BOLD,18));
       permanent.setBounds(160,480,600,30);
       add(permanent);

         per = new JTextField(6);
        per.setFont(new Font("Arial",Font.BOLD,15));
        per.setBounds(400,480,280,25);
        add(per);


        JLabel coress = new JLabel("Coresspondence Address: ");
        coress.setFont(new Font("Arial",Font.BOLD,17));
        coress.setBounds(160,520,600,30);
        add(coress);

         cor = new JTextField(6);
        cor.setFont(new Font("Arial",Font.BOLD,15));
        cor.setBounds(400,520,280,25);
        add(cor);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);






        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,750);
        setLocation(360,40);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;

        String name = fname.getText();

        String lastname = Lname.getText();

        String dob = ((JTextField) calendar.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (button1.isSelected()) {
            gender = "Male";
        } else if (button2.isSelected()) {
            gender = "Female";
        }



        String mobile = mobile1.getText();
        String email = email1.getText();

        String marital = null;

        if (button3.isSelected()) {

            marital ="Married";
        }else if(button4.isSelected()) {
                 marital="Unmarried";
        }

        String permanent = per.getText();
        String corresspondence = cor.getText();


        try{

            if(fname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Your Details are mandatory fill it");
            }else{
                
                String q = "insert into Signup values('"+formno+"','"+name+"','"+lastname+"','"+dob+"','"+gender+"','"+mobile+"','"+email+"','"+marital+"','"+permanent+"','"+corresspondence+"')";
                connect con = new connect();
                con.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main (String[] args){
        new signup();
    }
}
