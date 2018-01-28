/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevice;

import pojo.Employee;
import java.util.List;

/**
 *
 * @author roaggarw
 */
public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    public boolean deleteEmployee(String id);

    public Employee findEmployee(String id);

    public List<Employee> getAllEmplloyee();
}
