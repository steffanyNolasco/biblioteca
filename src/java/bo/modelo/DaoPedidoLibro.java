/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.modelo;

import bo.entidades.Editoriales;
import bo.entidades.Libro;
import bo.entidades.PedidoLibro;
import bo.entidades.Autor;
import bo.entidades.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author willi
 */
public class DaoPedidoLibro extends Conexion{
    PreparedStatement pre;
    ResultSet re;
    int res=0;
    Editoriales edit;
    PedidoLibro pedLib;
    Libro lib;
    Autor aut;
    Categoria cat;
    String sql = "";
    public ArrayList<PedidoLibro> mostrar()throws SQLException,ClassNotFoundException{
        ArrayList<PedidoLibro> array = new ArrayList<>();
        sql = "SELECT * FROM libro,categoria,autor,pedidolibro,editorial WHERE "
                + "libro.idAutor=autor.idAutor AND libro.idCategoria=categoria.idCategoria "
                + "AND pedidolibro.idEditorial=editorial.idEditorial AND "
                + "pedidolibro.idLibro=libro.idLibro AND editorial.estadoEditorial=1 AND "
                + "libro.estadoLibro=1 AND pedidolibro.estadoPedidoLibro=1;";
        try {
            pre=super.getCon().prepareStatement(sql);
            re = pre.executeQuery();
            while(re.next()){
                cat = new Categoria(re.getInt(12), re.getString(13));
                aut = new Autor(re.getInt(15), re.getString(16), re.getString(17), re.getString(18), re.getString(19));
                lib = new Libro(re.getInt(1), re.getString(2), re.getString(3), 
                        re.getInt(4), re.getInt(5), re.getInt(6), re.getDouble(7),
                        re.getDouble(8), cat, aut);
                edit= new Editoriales(re.getInt(27), re.getString(28), re.getString(29), re.getString(30), re.getString(31));
                pedLib = new PedidoLibro(re.getInt(21), edit, lib, re.getInt(24), re.getString(25), re.getInt(26));
                array.add(pedLib);
            }
        } catch (Exception e) {
        }finally{
            pre.close();
            re.close();
        }
        return array;
    }
    public ArrayList<PedidoLibro> mostrarRestablecer()throws SQLException,ClassNotFoundException{
        ArrayList<PedidoLibro> array = new ArrayList<>();
        sql = "SELECT * FROM libro,categoria,autor,pedidolibro,editorial WHERE "
                + "libro.idAutor=autor.idAutor AND libro.idCategoria=categoria.idCategoria "
                + "AND pedidolibro.idEditorial=editorial.idEditorial AND "
                + "pedidolibro.idLibro=libro.idLibro AND editorial.estadoEditorial=0 AND "
                + "libro.estadoLibro=0 AND pedidolibro.estadoPedidoLibro=0;";
        try {
            pre=super.getCon().prepareStatement(sql);
            re = pre.executeQuery();
            while(re.next()){
                cat = new Categoria(re.getInt(12), re.getString(13));
                aut = new Autor(re.getInt(15), re.getString(16), re.getString(17), re.getString(18), re.getString(19));
                lib = new Libro(re.getInt(1), re.getString(2), re.getString(3), 
                        re.getInt(4), re.getInt(5), re.getInt(6), re.getDouble(7),
                        re.getDouble(8), cat, aut);
                edit= new Editoriales(re.getInt(27), re.getString(28), re.getString(29), re.getString(30), re.getString(31));
                pedLib = new PedidoLibro(re.getInt(21), edit, lib, re.getInt(24), re.getString(25), re.getInt(26));
                array.add(pedLib);
            }
        } catch (Exception e) {
        }finally{
            pre.close();
            re.close();
        }
        return array;
    }
    public int agregar(PedidoLibro ped)throws SQLException,ClassNotFoundException{
        sql = "INSERT INTO pedidolibro (idEditorial, idLibro, cantidadLibro, fechaPedidoLibro) VALUES (?, ?, ?, ?);";
        pre=super.getCon().prepareStatement(sql);
        pre.setInt(1, ped.getEdit().getIdEditorial());
        pre.setInt(2, ped.getLib().getIdLibro());
        pre.setInt(3, ped.getCantidadLibro());
        pre.setString(4, ped.getFechaPedidoLibro());
        try {
            res = pre.executeUpdate();
        } catch (Exception e) {
        }finally{
            super.getCon().close();
            pre.close();
        }
        return res;
    }
    public int modificar(PedidoLibro ped)throws SQLException,ClassNotFoundException{
        sql = "UPDATE SET pedidolibro idEditorial=?, idLibro=?, cantidadLibro=?, fechaPedidoLibro=? WHERE idPedidoLibro=?;";
        pre=super.getCon().prepareStatement(sql);
        pre.setInt(1, ped.getEdit().getIdEditorial());
        pre.setInt(2, ped.getLib().getIdLibro());
        pre.setInt(3, ped.getCantidadLibro());
        pre.setString(4, ped.getFechaPedidoLibro());
        pre.setInt(5, ped.getIdPedidoLibro());
        try {
            res = pre.executeUpdate();
        } catch (Exception e) {
        }finally{
            super.getCon().close();
            pre.close();
        }
        return res;
    }
    public int eliminadoLogico(PedidoLibro ped)throws SQLException,ClassNotFoundException{
        sql = "UPDATE SET pedidolibro estadoPedidoLibro=0 WHERE idPedidoLibro=?;";
        pre.setInt(1, ped.getIdPedidoLibro());
        try {
            res = pre.executeUpdate();
        } catch (Exception e) {
        }finally{
            super.getCon().close();
            pre.close();
        }
        return res;
    }
    public int eliminadoFisico(PedidoLibro ped)throws SQLException,ClassNotFoundException{
        sql = "DELETE FROM pedidolibro WHERE idPedidoLibro=?;";
        pre.setInt(1, ped.getIdPedidoLibro());
        try {
            res = pre.executeUpdate();
        } catch (Exception e) {
        }finally{
            super.getCon().close();
            pre.close();
        }
        return res;
    }
    public int restablecer(PedidoLibro ped)throws SQLException,ClassNotFoundException{
        sql = "UPDATE SET pedidolibro estadoPedidoLibro=1 WHERE idPedidoLibro=?;";
        pre.setInt(1, ped.getIdPedidoLibro());
        try {
            res = pre.executeUpdate();
        } catch (Exception e) {
        }finally{
            super.getCon().close();
            pre.close();
        }
        return res;
    }
}
