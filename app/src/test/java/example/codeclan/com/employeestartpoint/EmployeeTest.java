package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Admin admin;
    Director director;
    Engineer engineer;

    @Before
    public void before() {
        employee = new Employee();
        manager = new Manager();
        admin = new Admin();
        director = new Director();
        engineer = new Engineer();
    }




    @Test
    public void canRaiseSalary() {
        Manager manager = new Manager(3, "Mr Brown", "332", 20000.00, "Fashion");
        manager.raiseSalary(20000.00);
        assertEquals(20000.00, manager.getSalary(), 0.1);
    }

}
