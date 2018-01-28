/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceImpl;

import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import pojo.Employee;
import sevice.EmployeeService;

/**
 *
 * @author roaggarw
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee addEmployee(Employee employee) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.addEmployee(employee);
        return findEmployee(employee.getId());

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

}
