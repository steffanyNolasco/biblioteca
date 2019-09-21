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
public class Libro {
    private int idLibro;
    private String nombreLibro;
    private String especialidadLibro;
    private int existenciasLibro;
    private int numeroPaginasLibro;
    private int anyoEdicionLibro;
    private double precioVentaLibro;
    private double precioPrestamoLibro;
    private Categoria cat;
    private Autor au;

    public Libro(int idLibro, String nombreLibro, String especialidadLibro, int existenciasLibro, int numeroPaginasLibro, int anyoEdicionLibro, double precioVentaLibro, double precioPrestamoLibro, Categoria cat, Autor au) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.especialidadLibro = especialidadLibro;
        this.existenciasLibro = existenciasLibro;
        this.numeroPaginasLibro = numeroPaginasLibro;
        this.anyoEdicionLibro = anyoEdicionLibro;
        this.precioVentaLibro = precioVentaLibro;
        this.precioPrestamoLibro = precioPrestamoLibro;
        this.cat = cat;
        this.au = au;
    }
    public Libro(String nombreLibro, String especialidadLibro, int existenciasLibro, int numeroPaginasLibro, int anyoEdicionLibro, double precioVentaLibro, double precioPrestamoLibro, Categoria cat, Autor au) {
        this.nombreLibro = nombreLibro;
        this.especialidadLibro = especialidadLibro;
        this.existenciasLibro = existenciasLibro;
        this.numeroPaginasLibro = numeroPaginasLibro;
        this.anyoEdicionLibro = anyoEdicionLibro;
        this.precioVentaLibro = precioVentaLibro;
        this.precioPrestamoLibro = precioPrestamoLibro;
        this.cat = cat;
        this.au = au;
    }
    public Libro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Libro() {
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getEspecialidadLibro() {
        return especialidadLibro;
    }

    public void setEspecialidadLibro(String especialidadLibro) {
        this.especialidadLibro = especialidadLibro;
    }

    public int getExistenciasLibro() {
        return existenciasLibro;
    }

    public void setExistenciasLibro(int existenciasLibro) {
        this.existenciasLibro = existenciasLibro;
    }

    public int getNumeroPaginasLibro() {
        return numeroPaginasLibro;
    }

    public void setNumeroPaginasLibro(int numeroPaginasLibro) {
        this.numeroPaginasLibro = numeroPaginasLibro;
    }

    public int getAnyoEdicionLibro() {
        return anyoEdicionLibro;
    }

    public void setAnyoEdicionLibro(int anyoEdicionLibro) {
        this.anyoEdicionLibro = anyoEdicionLibro;
    }

    public double getPrecioVentaLibro() {
        return precioVentaLibro;
    }

    public void setPrecioVentaLibro(double precioVentaLibro) {
        this.precioVentaLibro = precioVentaLibro;
    }

    public double getPrecioPrestamoLibro() {
        return precioPrestamoLibro;
    }

    public void setPrecioPrestamoLibro(double precioPrestamoLibro) {
        this.precioPrestamoLibro = precioPrestamoLibro;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public Autor getAu() {
        return au;
    }

    public void setAu(Autor au) {
        this.au = au;
    }
}
