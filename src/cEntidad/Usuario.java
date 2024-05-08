
package cEntidad;

import java.util.ArrayList;
import java.util.Date;


public class Usuario {
    private int id;
    private String tipoDocumento;
    private String numeroDocumento;
    private Date fechaEmisionDNI;
    private Date fechaNacimiento;
    private String mensajeError;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaEmisionDNI() {
        return fechaEmisionDNI;
    }

    public void setFechaEmisionDNI(Date fechaEmisionDNI) {
        this.fechaEmisionDNI = fechaEmisionDNI;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
    
    
    
}