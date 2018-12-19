package _01_filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

// 1.loglama yapıldı
// 2. encoding işlemi yapıldı.

// javax.servlet.Filter arabirimini implements et.

/*      Authentication Filters -> Kimlik Doğrulama
        Encryption and Decryption Filters -> Şifreleme ve şifre çözme
        Logging Filter -> Log kaydı tutma
        Auditing Filter -> Denetim
        İnput validation -> Giriş Doğrulama
        Formatting of request body or header before sending it to servlet ->Requesti düzenlemek*/

public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {


        //filter yardımıyla araya girip (intercept)

        // loglama
        // parametrelerin kontrolü

        HttpServletRequest req=( HttpServletRequest) request;

        String IP= req.getRemoteAddr();

        System.out.println(IP);    //0:0:0:0:0:0:0:1

        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
