package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Main {
    public static void connect() {

        Connection conn = null;

        try{
            String url = "jdbc:sqlite:src/main/resources/database/attendance management system.db";

            conn = DriverManager.getConnection(url);
            System.out.println("Connection to sqlite has been established");
        }
        catch (SQLException e){
            System.out.println("Error Connecting"+e.getMessage());
        }

    }
    public static void main(String[] args) {
        connect();
    }
}