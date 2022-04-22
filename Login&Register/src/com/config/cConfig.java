/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

import java.sql.*;
/**
 *
 * @author faisal
 */
public class cConfig {
    private static java.sql.Connection conn;

    public static java.sql.Connection getConn(){
        if (conn == null){
            try{
                String url = "jdbc:mysql://localhost:3306/tugasjdbc";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(getConn());
    }
}
