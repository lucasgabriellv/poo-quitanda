package com.lucas.quitandaria.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
*@author – Lucasgabriellv
*/
public class ConnectionUtils 
{
    public static Connection obterConexao() throws ClassNotFoundException, 
            SQLException 
    {
        
        
        // 1) Declarar o driver JDBC de acordo com o Banco de dados usado
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection
            ("jdbc:mysql://localhost:3307/QUITANDARIA?useTimezone=true&serverTimezone=UTC",
                "root",
                "");
        return conn;
    }
}
