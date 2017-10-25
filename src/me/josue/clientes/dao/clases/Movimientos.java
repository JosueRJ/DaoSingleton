package me.josue.clientes.dao.clases;

/**
 *
 * @author Virus
 */
public class Movimientos {
    private int idMovimiento;
    private String tipoMovimiento;
    private Double monto;
    private Clientes clientes;
    private Cuentas cuentas;

    public Movimientos() {
        this.idMovimiento = 0;
        this.tipoMovimiento = "";
        this.monto = 0.0;
        this.clientes = new Clientes();
        this.cuentas = new Cuentas();
    }

    public Movimientos(int idMovimiento, String tipoMovimiento, Double monto, Clientes clientes, Cuentas cuentas) {
        this.idMovimiento = idMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.clientes = clientes;
        this.cuentas = cuentas;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Cuentas getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
    
    
}
