package Main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JavaConnection {
     public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            createDatabase(conn);
            useDatabase(conn);
            createTableOrders(conn);
            createTableItems(conn);
            createTableUsers(conn);

            return conn;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
        
    }
    
    static void createDatabase(Connection conn) {
        try {
            PreparedStatement pst = conn.prepareStatement("create database if not exists anyenyas");
            pst.execute();
//            System.out.println("Database anyenyas is created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void useDatabase(Connection conn) {
        try {
            PreparedStatement pst = conn.prepareStatement("use anyenyas");
            pst.execute();
//            System.out.println("Using anyenyas");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void createTableOrders(Connection conn) {
        try {
            PreparedStatement pst = conn.prepareStatement("Create table if not exists orders ("
                    + "id int primary key auto_increment,"
                    + "buyers_name varchar(255) not null,"
                    + "item_name varchar(255) ,"
                    + "phone_number varchar(255) ,"
                    + "price varchar(255) not null,"
                    + "size varchar(255) not null  "
                    + ")");
            pst.execute();
           System.out.println("orders table is  created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void createTableUsers(Connection conn) {
        try {
            PreparedStatement pst = conn.prepareStatement("Create table if not exists users ("
                    + "id int primary key auto_increment,"
                    + "name varchar(255) not null,"
                    + "username varchar(255) ,"
                    + "password varchar(255)"
                    + ")");
            pst.execute();
           System.out.println("users table is  created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void createTableItems(Connection conn) {
        try {
            PreparedStatement pst = conn.prepareStatement("Create table if not exists items ("
                    + "id int primary key auto_increment,"
                    + "item_name varchar(255) ,"
                    + "price varchar(255) not null,"
                    + "size varchar(255) not null,"
                    + "image longBlob"
                    + ")");
            pst.execute();
           System.out.println("items table is  created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
