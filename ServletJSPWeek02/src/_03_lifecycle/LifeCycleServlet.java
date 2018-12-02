package _03_lifecycle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

        System.out.println("LifeCycleServlet#init..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw=resp.getWriter();
        pw.print("LifeCycleServlet#doGet");

        System.out.println("LifeCycleServlet#doGet is called..");
        System.out.println("LifeCycleServlet#doGet 2 is called..");


    }

    @Override
    public void destroy() {

        System.out.println("Destroying....");
    }
}
