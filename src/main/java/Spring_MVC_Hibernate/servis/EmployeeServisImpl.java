package Spring_MVC_Hibernate.servis;

import Spring_MVC_Hibernate.entity.Employee;
import Spring_MVC_Hibernate.DAO.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServisImpl implements EmployeeServis{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

@Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDao.getAllEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee( id);
    }
}

