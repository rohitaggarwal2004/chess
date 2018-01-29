/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceImpl;

import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import java.util.List;
import pojo.Employee;
import sevice.EmployeeService;

/**
 *
 * @author roaggarw
 */
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl() {

    }

    @Override
    public Employee addEmployee(Employee employee) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        if (employeeDao.addEmployee(employee)) {
            return findEmployee(employee.getId());
        } else {
            throw new RuntimeException("----------");
        }

    }

    @Override
    public boolean deleteEmployee(String id) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.deleteEmployee(id);
    }

    @Override
    public Employee findEmployee(String id) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.findEmployee(id);
    }

    @Override
    public List<Employee> getAllEmplloyee() {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.getAllEmplloyee();
    }

}
