package controller;

import dao.EmployeeDao;
import dao.EmployeeDaoImp;
import model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/employeeController")
public class EmployeeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("employeeId"));
        EmployeeDao employeeDAO = new EmployeeDaoImp();
        employeeDAO.removeEmployee(id);
        //

        //
        List<Employee> employeeList = employeeDAO.listEmployees();
        //
        req.setAttribute("allEmployee", employeeList);
        //
        RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String surname=req.getParameter("surname");
        String salary=req.getParameter("salary");


        EmployeeDao employeeDao=new EmployeeDaoImp();
        employeeDao.insertEmployee(name,surname,salary);


        List<Employee> employeeList=employeeDao.listEmployees();

        req.setAttribute("allEmployee",employeeList);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("employee.jsp");
        requestDispatcher.forward(req,resp);

    }

}
