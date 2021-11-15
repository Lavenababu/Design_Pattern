package MVC;

import MVC.Controller.EmployeeController;
import MVC.Model.Employee;
import MVC.View.EmployeeDashboardView;

public class MVCMain {

    public static void main(String[] args) {

        Employee employee = retrieveEmployeeFromServer();

        //Create our view to which we'll write our employee information into
        EmployeeDashboardView view = new EmployeeDashboardView();

        //Create our controller
        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateDashboardView();
    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setSsNumber("32765523");
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setSalary(125000);

        return employee;

    }
}
