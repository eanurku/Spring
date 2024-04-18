package com.anurag;

import java.sql.*;

public class plainjdbc {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root1234");
        Statement stmt = conn.createStatement();

        ResultSet res = stmt.executeQuery("select * from student");
        while(res.next()){
            int id = res.getInt(1);
            String name=res.getString("name");
            String contact=res.getString("contact");
            System.out.println(id+" "+name+" "+contact);

        }
    }
}
