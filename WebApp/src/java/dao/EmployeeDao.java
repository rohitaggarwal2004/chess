/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.Employee;

/**
 *
 * @author roaggarw
 */
public interface EmployeeDao {

    public boolean addEmployee(Employee employee);

    public boolean deleteEmployee(String id);

    public Employee findEmployee(String id);

}
