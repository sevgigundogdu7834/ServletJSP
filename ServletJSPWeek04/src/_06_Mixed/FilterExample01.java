package _06_Mixed;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.LogRecord;
import java.util.Date;


public class FilterExample01 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        Date date=new Date();

        HttpServletRequest request=(HttpServletRequest) servletRequest;

        String ıp=request.getRemoteAddr();
        StringBuffer url=request.getRequestURL();

        System.out.println("ıp = [" + ıp + "], url= [" + url + "], date = [" + date + "]");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
