package _03_RequestMethodsServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

@WebServlet("/RequestMethodsServlet")
public class RequestMethodsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Locale locale=req.getLocale();
        int local=req.getLocalPort();
        int serverPort=req.getServerPort();
        String remoteAddr= req.getRemoteAddr();
        ServletContext context=req.getServletContext();
        String getHeader=req.getHeader("host");

        System.out.println(locale);
        System.out.println(local);
        System.out.println(serverPort);
        System.out.println(remoteAddr);
        System.out.println(context);
        System.out.println(getHeader);

        Enumeration<String> headerName= req.getHeaderNames();

        if(headerName.hasMoreElements()){

           String name=headerName.nextElement();
           String headerValue=req.getHeader(name);

            System.out.println(name + " " +headerValue);
        }
    }
}
