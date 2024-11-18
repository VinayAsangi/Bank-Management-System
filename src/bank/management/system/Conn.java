package bank.management.system;

import java.sql.*;
public class Conn {

    Statement statement;

    public Conn(){//Please Rename it as Con

        Connection connection;

        try {
            connection= DriverManager.getConnection("Your Database URL","Username","PWD");
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}