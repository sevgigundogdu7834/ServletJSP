package _02_Controller;

import _01_Model.Department;
import _01_Model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/employee")
public class EmployeeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Department department=new Department();
        department.setId(1);
        department.setName("Software Engineering");

        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("Sevgi");
        employee.setSalary(5000);
        employee.setDepartment(department);

        req.setAttribute("employeeAttribute",employee);

        req.setAttribute("departmentAttribute",department);

       // RequestDispatcher requestDispatcher=req.getRequestDispatcher("employee.jsp");  // hata yapma riski çok fazla
      // RequestDispatcher requestDispatcher=req.getRequestDispatcher("employeeUseBean.jsp");  // yetersiz
       RequestDispatcher requestDispatcher=req.getRequestDispatcher("employeeExpressionLanguage.jsp");  // her zaman bunu kullanıcaz pratik,kullanımı kolay ve yeterli

        requestDispatcher.forward(req,resp);
    }
}
