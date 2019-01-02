package dao;

import model.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImp implements EmployeeDao {

    public static final String INSERT_EMPLOYEE="insert into Employee(name,surname,salary) values (?,?,?)";
    public static final String LIST_EMPLOYEE="select * from Employee";
    public static final String DELETE_EMPLOYEE="delete from employee where id";

    private DataSource getDataSource(){

        ConnectionManager connectionManager=new ConnectionManager();
        DataSource dataSource=connectionManager.getDataSource();
        return dataSource;
    }

    @Override
    public void insertEmployee(String name, String surname, String salary)  {

        DataSource dataSource=getDataSource();

        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setString(1,name);
            System.out.println("name = [" + name + "], surname = [" + surname + "], salary = [" + salary + "]");
            preparedStatement.setString(2,surname);
            preparedStatement.setString(3,salary);
            preparedStatement.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }




    }

    @Override
    public List<Employee> listEmployees() {

        DataSource dataSource=getDataSource();
        Connection connection;
        List<Employee> employeeList=new ArrayList<>();
        try {
            connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(LIST_EMPLOYEE);
            ResultSet resultSet=preparedStatement.executeQuery();

            while (resultSet.next()){

                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String surname=resultSet.getString("surname");
                String salary=resultSet.getString("salary");

                Employee employee=new Employee(id,name,surname,salary);
                employeeList.add(employee);

            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void removeEmployee(int id) {

        DataSource dataSource = getDataSource();

        Connection connection;
        try {
            connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(DELETE_EMPLOYEE);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    }

