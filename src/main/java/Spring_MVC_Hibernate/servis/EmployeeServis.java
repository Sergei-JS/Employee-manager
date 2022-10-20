package Spring_MVC_Hibernate.servis;

import Spring_MVC_Hibernate.entity.Employee;

import java.util.List;

public interface EmployeeServis {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
