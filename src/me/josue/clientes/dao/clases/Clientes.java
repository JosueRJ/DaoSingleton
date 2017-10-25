package me.josue.clientes.dao.clases;

/**
 *
 * @author Virus
 */
public class Clientes {
    private String dni;
    private String nombres;
    private String apPaterno;
    private String apMaterno;

    public Clientes() {
        this.dni = "";
        this.nombres = "";
        this.apPaterno = "";
        this.apMaterno = "";
    }

    public Clientes(String dni, String nombres, String apPaterno, String apMaterno) {
        this.dni = dni;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public Clientes(String toString) {
        // atributo tipo strike
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    
}

