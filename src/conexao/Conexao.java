/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author emill
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        System.out.println("Conectado");
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.3:3306/cl200455";
        String usuario = "cl200455";
        String senha = "cl*02042004";
        Class.forName(driver);
       return DriverManager.getConnection(url, usuario, senha);
    }
}
