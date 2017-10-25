package me.josue.clientes.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.josue.clientes.dao.clases.Clientes;
import me.josue.clientes.conexion.Conexion;
import me.josue.clientes.dao.interfaces.ClienteDAO;

/**
 *
 * @author Virus
 */
public class ClienteImplement implements ClienteDAO{    

    @Override
    public List<Clientes> listar() {
        
        try {
            //Obtenemos la conexion de la base de datos
            Connection connection = Conexion.getConnection();
            //creando una consulta
            Statement statement = connection.createStatement();
            //ejecutamos la consulta y recbimos los datos de la base de datos
            ResultSet rs = statement.executeQuery("SELECT * FROM Cliente");
            //Construimos la lista vacia de clientes
            List<Clientes> clientes = new ArrayList<>();
            //Iteramos sobre los resultados
            while(rs.next()){
                Clientes clientes1 = new Clientes();
                //construimos el objeto cliente1 con los datos recibidos
                
                clientes1.setDni(rs.getString("DNI"));
                clientes1.setNombres(rs.getString("Nombres"));
                clientes1.setApPaterno(rs.getString("apPaterno"));
                clientes1.setApMaterno(rs.getString("apMaterno"));
                //agregamos el objeto construido a la lista
                clientes.add(clientes1);
                
            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }

    @Override
    public void guardar(Clientes clientes) {
        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Cliente VALUES (?,?,?,?)");
            ps.setString(1, clientes.getDni());
            ps.setString(2, clientes.getNombres());
            ps.setString(3, clientes.getApPaterno());
            ps.setString(4, clientes.getApMaterno());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Clientes clientes) {
        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement ps = connection.prepareCall("UPDATE Cliente SET DNI=? WHERE DNI=?");
            ps.setString(1, clientes.getDni());
            ps.setString(2, clientes.getNombres());
            ps.setString(3, clientes.getApPaterno());
            ps.setString(4, clientes.getApMaterno());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void borrar(Clientes clientes) {
        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Cliente WHERE DNI=?,Nombres=?,apPaterno=?,apMaterno=?");
            ps.setString(1, clientes.getDni());
            ps.setString(2, clientes.getNombres());
            ps.setString(3, clientes.getApPaterno());
            ps.setString(4, clientes.getApMaterno());
            ps.executeUpdate();
                        
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
