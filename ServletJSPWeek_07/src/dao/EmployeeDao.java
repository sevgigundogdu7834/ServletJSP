package dao;

import model.Employee;
import java.util.List;

public interface EmployeeDao {

    public void insertEmployee(String name,String surname,String salary);

    public List<Employee> listEmployees();

    public void removeEmployee(int id);
}
