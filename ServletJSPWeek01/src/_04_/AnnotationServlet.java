package _04_;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/annotationServlet")
@WebServlet(urlPatterns = {"/annotationServlet","/annotationServlet2"})

public class AnnotationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw=resp.getWriter();

        pw.print("HELLO MY ANNOTATİON SERVLET !!!!");
    }
}
