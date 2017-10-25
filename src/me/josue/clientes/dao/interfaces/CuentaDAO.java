package me.josue.clientes.dao.interfaces;

import java.util.List;
import me.josue.clientes.dao.clases.Cuentas;

/**
 *
 * @author Virus
 */
public interface CuentaDAO {
    public List<Cuentas> listar();
    public void guardar (Cuentas cuentas);
    public void modificar (Cuentas cuentas);
    public void borrar (Cuentas cuentas);
}
