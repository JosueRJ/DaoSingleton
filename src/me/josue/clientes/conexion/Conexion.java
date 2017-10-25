package me.josue.clientes.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Virus
 */
public class Conexion {
    private static Connection connection = null;
    
    //Constructor
    private Conexion(){}
    
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDCliente", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
