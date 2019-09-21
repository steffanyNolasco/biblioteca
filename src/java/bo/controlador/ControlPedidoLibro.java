/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.controlador;

import bo.entidades.Editoriales;
import bo.entidades.PedidoLibro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bo.modelo.*;
import bo.entidades.*;

/**
 *
 * @author willi
 */
public class ControlPedidoLibro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher res;
            int r = 0;
            DaoPedidoLibro daoPedLib = new DaoPedidoLibro();
            DaoEditoriales daoEdit = new DaoEditoriales();
            DaoLibro daoLib = new DaoLibro();
            PedidoLibro pedLib;
            //--------------------------------------------------
            if(request.getParameter("mostrar")!=null){
                try {
                    request.setAttribute("pedidoLibro", daoPedLib.mostrar());
                    request.setAttribute("editoriales", daoEdit.mostrar());
                    request.setAttribute("libros", daoLib.mostrar());
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            if(request.getParameter("guardar")!=null){
                try {
                    pedLib = new PedidoLibro(new Editoriales(Integer.parseInt(request.getParameter("idEdit")))
                            , new Libro(Integer.parseInt(request.getParameter("idLib"))), 
                            Integer.parseInt(request.getParameter("cantidadLibro")),
                            request.getParameter("fechaPedidoLibro") , 1);
                    r = daoPedLib.agregar(pedLib);
                    
                    request.setAttribute("pedidoLibro", daoPedLib.mostrar());
                    request.setAttribute("editoriales", daoEdit.mostrar());
                    request.setAttribute("libros", daoLib.mostrar());
                    if(r > 0)
                        request.setAttribute("r", "Registro agregado exitosamente");
                    else
                        request.setAttribute("r", "Error al agregar!!");
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            if(request.getParameter("modificar")!=null){
                try {
                    pedLib = new PedidoLibro(Integer.parseInt(request.getParameter("idPedLib")),
                            new Editoriales(Integer.parseInt(request.getParameter("idEdit")))
                            , new Libro(Integer.parseInt(request.getParameter("idLib"))), 
                            Integer.parseInt(request.getParameter("cantidadLibro")),
                            request.getParameter("fechaPedidoLibro") , 1);
                    r = daoPedLib.modificar(pedLib);
                    
                    request.setAttribute("pedidoLibro", daoPedLib.mostrar());
                    request.setAttribute("editoriales", daoEdit.mostrar());
                    request.setAttribute("libros", daoLib.mostrar());
                    if(r > 0)
                        request.setAttribute("r", "Registro agregado exitosamente");
                    else
                        request.setAttribute("r", "Error al agregar!!");
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            if(request.getParameter("eliminadoFisico")!=null){
                try {
                    pedLib = new PedidoLibro(Integer.parseInt(request.getParameter("idPedLib")));
                    r = daoPedLib.eliminadoFisico(pedLib);
                    
                    request.setAttribute("pedidoLibro", daoPedLib.mostrar());
                    request.setAttribute("editoriales", daoEdit.mostrar());
                    request.setAttribute("libros", daoLib.mostrar());
                    if(r > 0)
                        request.setAttribute("r", "Registro agregado exitosamente");
                    else
                        request.setAttribute("r", "Error al agregar!!");
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            if(request.getParameter("eliminadoLogico")!=null){
                try {
                    pedLib = new PedidoLibro(Integer.parseInt(request.getParameter("idPedLib")));
                    r = daoPedLib.eliminadoLogico(pedLib);
                    
                    request.setAttribute("pedidoLibro", daoPedLib.mostrar());
                    request.setAttribute("editoriales", daoEdit.mostrar());
                    request.setAttribute("libros", daoLib.mostrar());
                    if(r > 0)
                        request.setAttribute("r", "Registro agregado exitosamente");
                    else
                        request.setAttribute("r", "Error al agregar!!");
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            //--------------------------------------------------
            
            res = request.getRequestDispatcher("vistaPedidoLibro.jsp");
            res.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
