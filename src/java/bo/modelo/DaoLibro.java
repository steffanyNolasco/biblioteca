/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.modelo;

import bo.entidades.Libro;
import bo.entidades.Categoria;
import bo.entidades.Autor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author willi
 */
public class DaoLibro extends Conexion{
    PreparedStatement pre;
    ResultSet re;
    int res=0;
    Libro lib;
    Categoria cat;
    Autor aut;
    
    public ArrayList<Libro> mostrar()throws SQLException,ClassNotFoundException{
        ArrayList<Libro> array = new ArrayList<>();
        String sql = "SELECT * FROM libro,categoria,autor WHERE libro.idAutor=autor.idAutor AND libro.idCategoria=categoria.idCategoria;";
        try {
            pre=super.getCon().prepareStatement(sql);
            re = pre.executeQuery();
            while(re.next()){
                cat = new Categoria(re.getInt(12), re.getString(13));
                aut = new Autor(re.getInt(15), re.getString(16), re.getString(17), re.getString(18), re.getString(19));
                lib = new Libro(re.getInt(1), re.getString(2), re.getString(3), 
                        re.getInt(4), re.getInt(5), re.getInt(6), re.getDouble(7),
                        re.getDouble(8), cat, aut);
                array.add(lib);
            }
        } catch (Exception e) {
        }finally{
            pre.close();
            re.close();
        }
        return array;
    }
}
