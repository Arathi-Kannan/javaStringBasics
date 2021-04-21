package com.training.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet>{
    private int empId;
    private String empName;
    private String empEmail;
    private char empGender;
    private float empSalary;
    TreeSet<EmployeeTreeSet> empTreeSet = new TreeSet<EmployeeTreeSet>();

    public EmployeeTreeSet(int empId, String empName, String empEmail, char empGender, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empGender = empGender;
        this.empSalary = empSalary;
    }

    public EmployeeTreeSet() {
    }

    public int getEmpId() {
        return empId;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmployeeDetails(EmployeeTreeSet employee){
        this.empId = employee.empId;
        this.empName = employee.empName;
        this.empEmail = employee.empEmail;
        this.empGender = employee.empGender;
        this.empSalary = employee.empSalary;
    }
    
    public void getEmployeeDetails() {
        System.out.println("ID: " + this.empId);
        System.out.println("Name: " + this.empName);
        System.out.println("Email: " + this.empEmail);
        System.out.println("Gender: " + this.empGender);
        System.out.println("Salary: " + this.empSalary);
    }

    public boolean addEmployee(EmployeeTreeSet employee){
            boolean addEmp = false;
            if (employee != null) {
                //Adding the employee object into the TreeSet
                empTreeSet.add(employee);
                addEmp = true;
            }
            return addEmp;
        }

        public boolean deleteEmployee(int empId){
            boolean deleted = false;
            Iterator<EmployeeTreeSet> it = empTreeSet.iterator();
            EmployeeTreeSet chkEmp = new EmployeeTreeSet();
            try{
                while (it.hasNext()) {
                    chkEmp = it.next();
                    //checking the employee id
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
            Iterator<EmployeeTreeSet> it = empTreeSet.iterator();
            while (it.hasNext()) {
                EmployeeTreeSet chkEmp = it.next();
                //checking the employee id 
                if (chkEmp.getEmpId() == empId) {
                    pay = chkEmp.getEmpSalary();
                    paySlip = "The employee ID "+empId+"'s pay is "+pay;
                }
            }
            System.out.println(paySlip);
            return paySlip;
        }

    //returns an array of employee objects
        public EmployeeTreeSet[] listAll(){
            int size = empTreeSet.size();
            EmployeeTreeSet[] allEmps = new EmployeeTreeSet[size];
            empTreeSet.toArray(allEmps);
            return allEmps;
        }

        public static void main(String args[]){
            EmployeeTreeSet employeeTreeSetObj = new EmployeeTreeSet();
            EmployeeTreeSet emp1 = new EmployeeTreeSet(3,"name3","name3@abc.com",'F',50000);
            EmployeeTreeSet emp2 = new EmployeeTreeSet(1,"name2","name2@abc.com",'M',51000);
            EmployeeTreeSet emp3 = new EmployeeTreeSet(2,"name1","name1@abc.com",'F',52000);
            employeeTreeSetObj.addEmployee(emp1);
            employeeTreeSetObj.addEmployee(emp2);
            employeeTreeSetObj.addEmployee(emp3);
            employeeTreeSetObj.showPaySlip(2);
            boolean isDel = employeeTreeSetObj.deleteEmployee(1);
            System.out.println("Deleted is "+isDel);
            //TreeSet sorts the objects because of the overridden compareTo method 
            EmployeeTreeSet[] employees = employeeTreeSetObj.listAll();
            for(int i =0;i<employees.length;i++){
                employees[i].getEmployeeDetails();
            }

        }

    //Overriding the compareTo method of the Comparable interface
    @Override
    public int compareTo(EmployeeTreeSet e) {

        if((this.empId == e.empId) &&
                (this.empName.equals(e.empName)) &&
                (this.empEmail.equals(e.empEmail)) &&
                (this.empGender == e.empGender) &&
                (this.empSalary == e.empSalary))
            return 0;
        else {return -1;}

    }
}
