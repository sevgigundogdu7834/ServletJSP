package _03_requestDispatchMode.controller;

import _03_requestDispatchMode.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/person")
public class PersonController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // controller seviyesinde veritabanı bağlantısı direk yapılmaz.

        // controller service layer a o da layer a erişir.

        Person person1=new Person("Sevgi","Gündoğdu",24);
        Person person2=new Person("Ayşegül","Gündoğdu",23);
        Person person3=new Person("Metin","Gündoğdu",21);

        List<Person> personList= new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        // bu kısımlar query sonrası veritabanından gelsin..

        //request scope a objeyi ekle..!..
        req.setAttribute("persons",personList);

        //Bir istek karşılandığında işin içine jsp dosyasını da katıyoruz.
        //Yani isteği karşılarken hem servlet hem de jsp dosyasından faydalanırız.

        RequestDispatcher requestDispatcher= getServletContext().getRequestDispatcher("/person/personView.jsp");
        requestDispatcher.forward(req,resp);
    }
}
