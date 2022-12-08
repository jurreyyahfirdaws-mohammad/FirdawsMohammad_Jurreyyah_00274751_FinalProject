/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author akuls
 */
public class Employee {
    
    private String emp_name;
    private int emp_id;
    private static int count = 1;

    public Employee() {
        emp_id = count;
        count++;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    
    public String getEmp_name() {
        return emp_name;
    }

    @Override
    public String toString() {
        return emp_name;
    }
    
    
}
