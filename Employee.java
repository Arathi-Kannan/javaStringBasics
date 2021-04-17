package com.training.java;

public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private char empGender;
    private float empSalary;

    public Employee() {
    }

    public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empGender = empGender;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void getEmployeeDetails() {
        System.out.println("ID: " + this.empId);
        System.out.println("Name: " + this.empName);
        System.out.println("Email: " + this.empEmail);
        System.out.println("Gender: " + this.empGender);
        System.out.println("Salary: " + this.empSalary);
    }

    public void setEmployeeDetails(Employee employee){
        this.empId = employee.empId;
        this.empName = employee.empName;
        this.empEmail = employee.empEmail;
        this.empGender = employee.empGender;
        this.empSalary = employee.empSalary;

    }
}
