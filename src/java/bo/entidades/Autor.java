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
public class Autor {
    private int idAutor;
    private String nombreAutor;
    private String apellidoAutor;
    private String seudonimoAutor;
    private String nacionalidadAutor;

    public Autor() {
    }

    public Autor(int idAutor, String nombreAutor, String apellidoAutor, String seudonimoAutor, String nacionalidadAutor) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.seudonimoAutor = seudonimoAutor;
        this.nacionalidadAutor = nacionalidadAutor;
    }
    public Autor(String nombreAutor, String apellidoAutor, String seudonimoAutor, String nacionalidadAutor) {
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.seudonimoAutor = seudonimoAutor;
        this.nacionalidadAutor = nacionalidadAutor;
    }
    public Autor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getSeudonimoAutor() {
        return seudonimoAutor;
    }

    public void setSeudonimoAutor(String seudonimoAutor) {
        this.seudonimoAutor = seudonimoAutor;
    }

    public String getNacionalidadAutor() {
        return nacionalidadAutor;
    }

    public void setNacionalidadAutor(String nacionalidadAutor) {
        this.nacionalidadAutor = nacionalidadAutor;
    }
    
}
