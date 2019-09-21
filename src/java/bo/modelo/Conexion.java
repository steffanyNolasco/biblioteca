/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.modelo;
import java.sql.*;
/**
 *
 * @author willi
 */
public class Conexion {
    private String driver = "com.mysql.jdbc.Driver";
    private String usuario = "root";
    private String contra = "";
    private String url = "jdbc:mysql://localhost/bibliotecaOnline";
    
    public Connection getCon()throws SQLException,ClassNotFoundException{
        Class.forName(driver);
        return DriverManager.getConnection(url, usuario, contra);
    }
}
