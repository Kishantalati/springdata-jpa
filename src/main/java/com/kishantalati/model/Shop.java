package com.kishantalati.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: kishan talati
 * Date: 09/07/15
 * Time: 5:16 PM
 */
@Entity
@Table(name = "shops")
public class Shop {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "employees")
    private Integer employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }
}