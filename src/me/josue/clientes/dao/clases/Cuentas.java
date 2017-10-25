package me.josue.clientes.dao.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Virus
 */
public class Cuentas {
    private int idCuenta;
    private String codigo;
    private String cliente;
    private String tipo;
    private List<Movimientos> movimientos;

    public Cuentas() {
        this.idCuenta = 0;
        this.codigo = "";
        this.cliente = "";
        this.tipo = "";
        this.movimientos = new ArrayList<>();
    }

    public Cuentas(int idCuenta, String codigo, String cliente, String tipo, List<Movimientos> movimientos) {
        this.idCuenta = idCuenta;
        this.codigo = codigo;
        this.cliente = cliente;
        this.tipo = tipo;
        this.movimientos = movimientos;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Movimientos> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }
    
    
}
