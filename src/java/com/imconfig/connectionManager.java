/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author anurag.nana.deshmukh
 */
public class connectionManager {

     public Connection getConnection() {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL", "infarep", "infarep");
        } catch (Exception ex) {
        }
        return con;
    }

    public Statement getStatement(Connection con) {
        Statement stmt = null;
        try {
            stmt = con.createStatement();
        } catch (Exception ex) {
        }
        return stmt;

    }

    public ResultSet getResult(Statement stmt, String query) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(query);
        } catch (Exception ex) {
        }
        return rs;
    }
}
