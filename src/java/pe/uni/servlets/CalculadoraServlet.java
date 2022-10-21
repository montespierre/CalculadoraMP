/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.uni.service.CalculadoraService;

/**
 *
 * @author montespierreg
 */
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/CalculadoraServlet"})
public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        CalculadoraService servicio = new CalculadoraService();
               
        
        //entrada
        double n1 = Double.parseDouble(request.getParameter("n1"));
        double n2 = Double.parseDouble(request.getParameter("n2"));
        String listOperacion = request.getParameter("operacion");
        
        //proceso
        double resultado = servicio.calculandoOperac(n1, n2, listOperacion);
        
        //Salida
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //Salida
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Operacion: </h1>");
            out.println("<p>n1: " + n1 +"</p>");
            out.println("<p>n2: " + n2 +"</p>");
            out.println("<p>resultado: " + resultado + "</p>");


            out.println("<p><a href='index.html'>Nueva Operacion</a></p>");
            out.println("</body>");
            out.println("</html>");


            out.flush();
             
        
        
        
        

        //fin
    }
}













