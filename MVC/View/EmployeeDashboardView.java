package MVC.View;

import MVC.Model.Employee;

public class EmployeeDashboardView {

    public void printEmployeeInformation(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("SSN: " + employee.getSsNumber());
        System.out.println("Salary: " + employee.getSalary());

    }
}