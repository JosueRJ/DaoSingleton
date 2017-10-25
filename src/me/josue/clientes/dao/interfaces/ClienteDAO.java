package me.josue.clientes.dao.interfaces;

import java.util.List;
import me.josue.clientes.dao.clases.Clientes;

/**
 *
 * @author Virus
 */
public interface ClienteDAO {
    public List<Clientes> listar();
    public void guardar (Clientes clientes);
    public void modificar (Clientes clientes);
    public void borrar (Clientes clientes);
}
