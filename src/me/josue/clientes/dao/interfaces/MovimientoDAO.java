package me.josue.clientes.dao.interfaces;

import java.util.List;
import me.josue.clientes.dao.clases.Movimientos;

/**
 *
 * @author Virus
 */
public interface MovimientoDAO {
    public List<Movimientos> listar();
    public void guardar (Movimientos movimientos);
    public void modificar (Movimientos movimientos);
    public void borrar (Movimientos movimientos);
}
