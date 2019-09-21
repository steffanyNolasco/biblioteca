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
public class PedidoLibro {
    private int idPedidoLibro;
    private Editoriales edit;
    private Libro lib;
    private int cantidadLibro;
    private String fechaPedidoLibro;
    private int estadoPedidoLibro;

    public PedidoLibro() {
    }

    public PedidoLibro(int idPedidoLibro, Editoriales edit, Libro lib, int cantidadLibro, String fechaPedidoLibro, int estadoPedidoLibro) {
        this.idPedidoLibro = idPedidoLibro;
        this.edit = edit;
        this.lib = lib;
        this.cantidadLibro = cantidadLibro;
        this.fechaPedidoLibro = fechaPedidoLibro;
        this.estadoPedidoLibro = estadoPedidoLibro;
    }
    public PedidoLibro(Editoriales edit, Libro lib, int cantidadLibro, String fechaPedidoLibro, int estadoPedidoLibro) {
        this.edit = edit;
        this.lib = lib;
        this.cantidadLibro = cantidadLibro;
        this.fechaPedidoLibro = fechaPedidoLibro;
        this.estadoPedidoLibro = estadoPedidoLibro;
    }
    public PedidoLibro(int idPedidoLibro) {
        this.idPedidoLibro = idPedidoLibro;
    }

    public int getIdPedidoLibro() {
        return idPedidoLibro;
    }

    public void setIdPedidoLibro(int idPedidoLibro) {
        this.idPedidoLibro = idPedidoLibro;
    }

    public Editoriales getEdit() {
        return edit;
    }

    public void setEdit(Editoriales edit) {
        this.edit = edit;
    }

    public Libro getLib() {
        return lib;
    }

    public void setLib(Libro lib) {
        this.lib = lib;
    }

    public int getCantidadLibro() {
        return cantidadLibro;
    }

    public void setCantidadLibro(int cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }

    public String getFechaPedidoLibro() {
        return fechaPedidoLibro;
    }

    public void setFechaPedidoLibro(String fechaPedidoLibro) {
        this.fechaPedidoLibro = fechaPedidoLibro;
    }

    public int getEstadoPedidoLibro() {
        return estadoPedidoLibro;
    }

    public void setEstadoPedidoLibro(int estadoPedidoLibro) {
        this.estadoPedidoLibro = estadoPedidoLibro;
    }
    
}
