package com.anurag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDemo {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        DriverManagerDataSource dataSource = (DriverManagerDataSource) context.getBean("dataSource");
        Connection conn = dataSource.getConnection();

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select * from student");

        while(rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("contact"));
        }





    }
}
