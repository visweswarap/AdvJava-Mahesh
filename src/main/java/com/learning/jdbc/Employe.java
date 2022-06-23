package com.learning.jdbc;

public class Employe {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String email;
    private String phoneno;
    private String address;

    public Employe(int id, String name, double salary, String department, String email,
                   String phoneno, String address)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email;
        this.phoneno = phoneno;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

