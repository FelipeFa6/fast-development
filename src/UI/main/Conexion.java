package UI.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
        Connection conn = null;
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/bdfastdevelopment";
        String USER = "root";
        String PASS = "";
        String ex = "";
        
    public Conexion() throws SQLException{
        
        conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
            if (conn != null) {
                System.out.println("Conectado.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Class Conexion :: Error in method Conexion() ");
            System.out.println("Error: "+e.toString());
        }
    }
    public Connection conectar() {
        return conn;
    }
    
    public void desconectar(){
        conn = null;
    }
}