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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteEmployee(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee findEmployee(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAllEmplloyee() {
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
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("password"));

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

        return new ArrayList<Employee>();
    }

}
