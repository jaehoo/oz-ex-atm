package control.servlets;

import control.service.Cajero;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 21/05/12
 * Time: 12:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloServlet extends HttpServlet {

    private ApplicationContext applicationContext;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("POST============");


        applicationContext=WebApplicationContextUtils
                .getWebApplicationContext(getServletContext());


        Double monto= (Double)request.getAttribute("monto");
        String param=request.getParameter("monto");


        System.out.println("monto:"+monto);

        Cajero cajero=(Cajero) applicationContext.getBean("service.cajero");
        cajero.retiro(monto);


        System.out.println(" OK ===========================");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("GET ===============");

    }



}
