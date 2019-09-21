/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.entidades;

/**
 *
 * @author willi
 */
public class Editoriales {
    private int idEditorial;
    private String nombreEditorial;
    private String telefonoEditorial;
    private String direccionEditorial;
    private String correoEditorial;

    public Editoriales() {
    }

    public Editoriales(String nombreEditorial, String telefonoEditorial, String direccionEditorial, String correoEditorial) {
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditorial = direccionEditorial;
        this.correoEditorial = correoEditorial;
    }
    public Editoriales(int idEditorial) {
        this.idEditorial = idEditorial;
    }
    public Editoriales(int idEditorial, String nombreEditorial, String telefonoEditorial, String direccionEditorial, String correoEditorial) {
        this.idEditorial = idEditorial;
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditorial = direccionEditorial;
        this.correoEditorial = correoEditorial;
    }

    public String getCorreoEditorial() {
        return correoEditorial;
    }

    public void setCorreoEditorial(String correoEditorial) {
        this.correoEditorial = correoEditorial;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }

    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }

    public String getDireccionEditorial() {
        return direccionEditorial;
    }

    public void setDireccionEditorial(String direccionEditorial) {
        this.direccionEditorial = direccionEditorial;
    }
    
}
