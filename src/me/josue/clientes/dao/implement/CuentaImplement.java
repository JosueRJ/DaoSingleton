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
import me.josue.clientes.dao.clases.Cuentas;
import me.josue.clientes.dao.interfaces.CuentaDAO;
import me.josue.clientes.conexion.Conexion;
/**
 *
 * @author Virus
 */
public class CuentaImplement implements CuentaDAO{

    @Override
    public List<Cuentas> listar() {
        try {
            //Obtenemos la conexion de la base de datos
            Connection connection = Conexion.getConnection();
            //creando una consulta
            Statement statement = connection.createStatement();
            //ejecutamos la consulta y recbimos los datos de la base de datos
            ResultSet rs = statement.executeQuery("SELECT * FROM Cuenta");
            //Construimos la lista vacia de cuentas
            List<Cuentas> cuentas = new ArrayList<>();
            //Iteramos sobre los resultados
            while(rs.next()){
                Cuentas cuentas1 = new Cuentas();
                //construimos el objeto puestos1 con los datos recibidos
                cuentas1.setCodigo(rs.getString("idCuenta"));
                cuentas1.setCodigo(rs.getString("Codigo"));
                cuentas1.setCliente(rs.getString("Cliente"));
                cuentas1.setTipo(rs.getString("Tipo"));
                //agregamos el objeto construido a la lista
                cuentas.add(cuentas1);    
            }
            return cuentas;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void guardar(Cuentas cuentas) {
        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Cuenta VALUES (?,?,?)");
            ps.setInt(1, cuentas.getIdCuenta());
            ps.setString(2, cuentas.getCodigo());
            ps.setString(3, cuentas.getCliente());
            ps.setString(4, cuentas.getTipo());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Cuentas cuentas) {
        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement ps = connection.prepareCall("UPDATE Cuenta SET idCuenta=? WHERE idCuenta=?");
            ps.setInt(1, cuentas.getIdCuenta());
            ps.setString(2, cuentas.getCodigo());
            ps.setString(3, cuentas.getTipo());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void borrar(Cuentas cuentas) {
        try {
            Connection connection = Conexion.getConnection();
            Statement statement=connection.createStatement();
            statement.executeUpdate("DELETE FROM Cuenta WHERE Codigo="+cuentas.getIdCuenta());
            statement.executeUpdate("DELETE FROM Cuenta WHERE Codigo="+cuentas.getCodigo());
            statement.executeUpdate("DELETE FROM Cuenta WHERE Cliente="+cuentas.getCliente());
            statement.executeUpdate("DELETE FROM Cuenta WHERE Tipo="+cuentas.getTipo());
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
