package Spring_MVC_Hibernate.DAO;

import Spring_MVC_Hibernate.entity.Employee;


import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();

public void saveEmployee(Employee employee);

 public    Employee getAllEmployee(int id);

 public    void deleteEmployee(int id);
}


