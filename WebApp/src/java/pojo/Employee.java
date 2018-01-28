/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;

/**
 *
 * @author roaggarw
 */
public class Employee implements Serializable {

    public Employee(String id, String name, String password) {
        this.Id = id;
        this.password = password;
        this.name = name;
    }

    public Employee(String name, String password) {
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String Id;
    private String name;
    private String password;

}
