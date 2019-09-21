/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.modelo;
import java.sql.*;
import java.util.*;
import bo.entidades.Editoriales;
/**
 *
 * @author willi
 */
public class DaoEditoriales extends Conexion{
    PreparedStatement pre;
    ResultSet re;
    int res=0;
    Editoriales edit;
    public ArrayList<Editoriales> mostrar()throws SQLException,ClassNotFoundException{
        ArrayList<Editoriales> array = new ArrayList<>();
        String sql = "SELECT * FROM editorial";
        try {
            pre=super.getCon().prepareStatement(sql);
            re = pre.executeQuery();
            while(re.next()){
                edit = new Editoriales(re.getInt(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5));
                array.add(edit);
            }
        } catch (Exception e) {
        }finally{
            pre.close();
            re.close();
        }
        return array;
    }
}
