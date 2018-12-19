package _02_listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.WebServiceRefs;

@WebListener
public class ServletContextListener_2 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("ServletContextListener_2###contextInitialized.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        System.out.println("ServletContextListener_2###contextDestroyed.....");
    }
}
