package _08_Mixed;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

@WebServlet("/requestMethod")
public class RequestMethod extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // localhost, internet siteleri için dünya genelinde yayınlanmadan önce kullanılan bir test etme yöntemidir.

        Locale locale=req.getLocale();
        int localPort=req.getLocalPort();
        int serverPort=req.getServerPort();
        String remoteAddr= req.getRemoteAddr();
        ServletContext servletContext=req.getServletContext();
        String header= req.getHeader("host");

        System.out.println("locale = [" + locale + "]");          //locale = [tr_TR]
        System.out.println("localPort = [" + localPort+ "]");     //localPort = [8080]
        System.out.println("serverPort = [" + serverPort+ "]");   //serverPort = [8080]
        System.out.println("remoteAddr = [" + remoteAddr+ "]");   //remoteAddr = [0:0:0:0:0:0:0:1]
        System.out.println("servletContext = [" + servletContext+ "]");  //servletContext = [org.apache.catalina.core.ApplicationContextFacade@2fa9c2ec]
        System.out.println("header = [" + header+ "]");   //header = [localhost:8080]

        Enumeration<String> headerNames=req.getHeaderNames();

        if(headerNames.hasMoreElements()){

            String key=headerNames.nextElement();
            String value=req.getHeader(key);

            System.out.println("key = [" + key + "], value = [" + value + "]");
        }
    }
}
