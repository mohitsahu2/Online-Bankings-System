package online.banking.system;

import java.sql.*;

public class connect
{

    Connection connects;
    Statement statement;
    public connect(){

        try {

            connects = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebank","root","mysql@gmail.com");

            statement = connects.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
