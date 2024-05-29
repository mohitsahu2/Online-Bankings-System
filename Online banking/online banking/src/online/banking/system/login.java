package online.banking.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;   // Global declare
    JTextField textField1;                                    // here we fill text

    JPasswordField textPassword1;  // with this we fill password
    JButton button1,button2;


    login(){
        super("Online Banking System");

        ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image p2 = p1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon p3 = new ImageIcon(p2);
        JLabel image = new JLabel(p3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon p111 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image p222 = p111.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon p333 = new ImageIcon(p222);
        JLabel image3 = new JLabel(p333);
        image3.setBounds(650,350,100,100);
        add(image3);


        label1 = new JLabel("WELCOME TO ASIA BANK");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde",Font.BOLD,34));
        label1.setBounds(200,125,450,40);
        add(label1);

        label2 = new JLabel("CARD NUMBER: ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setBounds(150,190,375,30);
        add(label2);

        textField1 = new JTextField(15);
        textField1.setBounds(330,190,375,30);
        textField1.setFont(new Font("Arial",Font.BOLD,20));
        add(textField1);



        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        label3.setBounds(150,250,375,30);
        add(label3);

        textPassword1 = new JPasswordField(10);
        textPassword1.setBounds(330,250,375,30);
        textPassword1.setFont(new Font("Arial",Font.BOLD,20));
        add(textPassword1);


        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,15));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(330,310,100,35);
        button1.addActionListener(this);
        add(button1);

        button2 =new JButton("SIGN UP");
        button2.setFont(new Font("Arial",Font.BOLD,15));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(500,310,100,35);
        button2.addActionListener(this);
        add(button2);




        ImageIcon p11 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
        Image p22 = p11.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon p33 = new ImageIcon(p22);
        JLabel image2 = new JLabel(p33);
        image2.setBounds(0,0,850,480);
        add(image2);






        setSize(850,480);
        setLocation(450,200);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if(e.getSource()== button1){


                connect c = new connect();
                String card_number = textField1.getText();
                String pin = textPassword1.getText();
                String q = "select * from login where card_number = '"+card_number+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if(resultSet.next()){
                    setVisible(false);

                    new main_Class(pin);

                }


            }else if(e.getSource()==button2){

                new signup();
                setVisible(false);

            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args){

        new login();
    }
}
