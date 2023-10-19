/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;


import DAO.DAOpalabra;
import Modelo.Consulta;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Erik
 */
public class MiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí iría la lógica para manejar la solicitud GET.
        // Por ahora, solo devolveremos una respuesta vacía.
        response.getWriter().write("");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí iría la lógica para manejar la solicitud POST.
        // Por ahora, solo devolveremos una respuesta vacía.
        response.getWriter().write("");
    }
}
