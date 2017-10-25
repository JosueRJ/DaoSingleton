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
import me.josue.clientes.dao.clases.Movimientos;
import me.josue.clientes.dao.interfaces.MovimientoDAO;
import me.josue.clientes.conexion.Conexion;
/**
 *
 * @author Virus
 */
public class MovimientoImplement implements MovimientoDAO{

    @Override
    public List<Movimientos> listar() {
        try {
            //Obtenemos la conexion de la base de datos
            Connection connection = Conexion.getConnection();
            //creando una consulta
            Statement statement = connection.createStatement();
            //ejecutamos la consulta y recbimos los datos de la base de datos
            ResultSet rs = statement.executeQuery("SELECT * FROM Movimiento");
            //Construimos la lista vacia de movimientos
            List<Movimientos> movimientos = new ArrayList<>();
            //Iteramos sobre los resultados
            while(rs.next()){
                Movimientos movimientos1 = new Movimientos();
                //construimos el objeto movimientos1 con los datos recibidos
                movimientos1.setTipoMovimiento(rs.getString("idMovimiento"));
                movimientos1.setTipoMovimiento(rs.getString("TipoMovimiento"));
                movimientos1.setMonto(rs.getDouble("Monto"));
                //agregamos el objeto construido a la lista
                movimientos.add(movimientos1);    
            }
            return movimientos;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void guardar(Movimientos movimientos) {
        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Movimiento VALUES (?,?)");
            ps.setInt(1, movimientos.getIdMovimiento());
            ps.setString(2, movimientos.getTipoMovimiento());
            ps.setDouble(3, movimientos.getMonto());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Movimientos movimientos) {
        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement ps = connection.prepareCall("UPDATE Movimiento SET idMovimiento=? WHERE idMovimiento=?");
            ps.setInt(1, movimientos.getIdMovimiento());
            ps.setString(2, movimientos.getTipoMovimiento());
            ps.setDouble(3, movimientos.getMonto());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void borrar(Movimientos movimientos) {
        try {
            Connection connection = Conexion.getConnection();
            Statement statement=connection.createStatement();
            statement.executeUpdate("DELETE FROM Movimiento WHERE idMovimiento="+movimientos.getIdMovimiento());
            statement.executeUpdate("DELETE FROM Movimiento WHERE TipoMovimiento="+movimientos.getTipoMovimiento());
            statement.executeUpdate("DELETE FROM Movimiento WHERE Monto="+movimientos.getMonto());
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
