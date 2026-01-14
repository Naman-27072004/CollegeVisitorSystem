package dao;

import model.Visitor;
import util.DBConnection;
import java.sql.*;
import java.util.Vector;

public class VisitorDAO {

    public static void addVisitor(Visitor v) throws Exception {
        Connection con = DBConnection.getConnection();
        String sql = "INSERT INTO visitor(name,mobile,purpose,host) VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, v.getName());
        ps.setString(2, v.getMobile());
        ps.setString(3, v.getPurpose());
        ps.setString(4, v.getHost());
        ps.executeUpdate();
        con.close();
    }

    public static void exitVisitor(int id) throws Exception {
        Connection con = DBConnection.getConnection();
        String sql = "UPDATE visitor SET exit_time=NOW() WHERE visitor_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }

    public static Vector<Vector<String>> getAllVisitors() throws Exception {
        Vector<Vector<String>> data = new Vector<>();
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM visitor");

        while (rs.next()) {
            Vector<String> row = new Vector<>();
            row.add(rs.getString("visitor_id"));
            row.add(rs.getString("name"));
            row.add(rs.getString("mobile"));
            row.add(rs.getString("purpose"));
            row.add(rs.getString("host"));
            row.add(String.valueOf(rs.getTimestamp("entry_time")));
            row.add(String.valueOf(rs.getTimestamp("exit_time")));
            data.add(row);
        }
        con.close();
        return data;
    }
}
