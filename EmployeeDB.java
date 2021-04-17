package com.training.java;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB{

    ArrayList<Employee> empArrayList = new ArrayList<>();

    public boolean addEmployee(Employee employee){
        boolean addEmp = false;
        if (employee != null) {
            empArrayList.add(employee);
            addEmp = true;
        }
        return addEmp;
    }

    public boolean deleteEmployee(int empId){
        boolean deleted = false;
        Iterator<Employee> it = empArrayList.iterator();
        Employee chkEmp = new Employee();
        try{
            while (it.hasNext()) {
                chkEmp = it.next();
                if (chkEmp.getEmpId() == empId) {
                    it.remove();
                    deleted = true;
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return deleted;
    }


    public String showPaySlip(int empId){
        float pay = 0;
        String paySlip = "";
        Iterator<Employee> it = empArrayList.iterator();
        while (it.hasNext()) {
            Employee chkEmp = it.next();
            if (chkEmp.getEmpId() == empId) {
                pay = chkEmp.getEmpSalary();
                paySlip = "The employee ID "+empId+"'s pay is "+pay;
            }
        }
        System.out.println(paySlip);
        return paySlip;
    }

    public Employee[] listAll(){
        Iterator<Employee> it = empArrayList.iterator();
        Employee[] allEmps = new Employee[3];
        int size = 0;
        while(it.hasNext()) {
            Employee emp = new Employee();
            emp.setEmployeeDetails(it.next());
            emp.getEmployeeDetails();
            allEmps[size]=emp;
            size++;
        }
        return allEmps;
    }

    public static void main(String args[]){
        EmployeeDB empdb = new EmployeeDB();
        Employee emp1 = new Employee(1,"name1","name1@abc.com",'F',50000);
        Employee emp2 = new Employee(2,"name2","name2@abc.com",'M',51000);
        Employee emp3 = new Employee(3,"name3","name3@abc.com",'F',52000);
        empdb.addEmployee(emp1);
        empdb.addEmployee(emp2);
        empdb.addEmployee(emp3);
        empdb.showPaySlip(2);
        boolean isDel = empdb.deleteEmployee(1);
        System.out.println("Deleted is "+isDel);
        Employee[] employees = empdb.listAll();
    }
}
