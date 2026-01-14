package main;

import util.DBConnection;

public class TestConnection {
    public static void main(String[] args) {
        try {
            System.out.println(DBConnection.getConnection());
            System.out.println("Database Connected Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
