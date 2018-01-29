/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.EmployeeDao;
import java.util.List;
import pojo.Employee;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author roaggarw
 */
public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public boolean addEmployee(Employee employee) {
        Context ctx = null;
        Connection con = null;
        PreparedStatement pstmt = null;

        boolean isAdded = false;
        try {
            ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/TestDB");
            con = ds.getConnection();
            String query = " insert into employee (id, name, password )"
                    + " values (?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, employee.getId());
            pstmt.setString(2, employee.getName());
            pstmt.setString(3, employee.getPassword());
            pstmt.execute();
            isAdded = true;
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {

                pstmt.close();
                con.close();
                ctx.close();
            } catch (SQLException e) {
                System.out.println("Exception in closing DB resources");
            } catch (NamingException e) {
                System.out.println("Exception in closing Context");
            }
        }
        return isAdded;
    }

    @Override
    public boolean deleteEmployee(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee findEmployee(String id) {
        Context ctx = null;
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Employee emp = null;
        try {
            ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/TestDB");
            con = ds.getConnection();
            String selectSQL = "select * from Employee where id =" + id;
            preparedStatement = con.prepareStatement(selectSQL);
            rs = preparedStatement.executeQuery(selectSQL);
            if (rs.next()) {
                emp = new Employee(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            }

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                preparedStatement.close();
                con.close();
                ctx.close();
            } catch (SQLException e) {
                System.out.println("Exception in closing DB resources");
            } catch (NamingException e) {
                System.out.println("Exception in closing Context");
            }
        }
        return emp;

    }

    @Override
    public List<Employee> getAllEmplloyee() {
        List<Employee> list = new ArrayList<Employee>();
        Context ctx = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/TestDB");

            con = ds.getConnection();
            stmt = con.createStatement();

            rs = stmt.executeQuery("select * from Employee");

            while (rs.next()) {
                list.add(new Employee(rs.getString("id"), rs.getString("name"), rs.getString("password")));
            }

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
                ctx.close();
            } catch (SQLException e) {
                System.out.println("Exception in closing DB resources");
            } catch (NamingException e) {
                System.out.println("Exception in closing Context");
            }
        }
        return list;
    }

}
