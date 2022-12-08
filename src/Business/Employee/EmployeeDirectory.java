/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author akuls
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employee_List;

    public EmployeeDirectory() {
        employee_List = new ArrayList();
    }

    public ArrayList<Employee> getEmployee_List() {
        return employee_List;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setEmp_name(name);
        employee_List.add(employee);
        return employee;
    }
}