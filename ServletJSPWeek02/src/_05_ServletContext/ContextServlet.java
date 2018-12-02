package _05_ServletContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContext")
public class ContextServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //ServletContext parametreleri bütün proje kapsamında geçerlidir.

        ServletContext context=getServletContext();
        String rootPath=context.getInitParameter("rootPath");

        // init parametresini ServletConfig üzerinden çektiğimizde bu durumla
        // ilgili parametre Servlet e ait olmalıdır.
        // Aksi durumda null dönecektir.  Her Servlete ait bir ServletConfig objesi vardır. !!!!!

        ServletConfig config=getServletConfig();
        String role=config.getInitParameter("role");


        resp.getWriter().print(rootPath + " " +role);

        String txtPath= context.getRealPath("/a.txt");
        System.out.println(txtPath);                            ///Users/sevgigundogdu/IdeaProjects/ServletJSPWeek02/out/artifacts/ServletJSPWeek02_war_exploded/a.txt

        String contextPath=context.getContextPath();
        System.out.println(contextPath);

        String serverInfo=context.getServerInfo();
        System.out.println(serverInfo);

    }
}
