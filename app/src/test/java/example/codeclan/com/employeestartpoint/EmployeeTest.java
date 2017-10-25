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
        employee = new Employee(1, "Bob", "554", 10000.00);
        manager = new Manager(3, "Mr Brown", "332", 20000.00, "Fashion");
        admin = new Admin(4, "Mr Smith", "445", 10000.00);
        director = new Director(5, "Mrs Phillips", "320", 40000.00, "Finance", 400000.00);
        engineer = new Engineer(6, "Mrs Jones", "540", 20000.00);
    }



    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(20000.00);
        assertEquals(40000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        engineer.setName("Mrs Barrett");
        assertEquals("Mrs Barrett", engineer.getName());
    }

    @Test
    public void testNameEmpty() {
        String newName = "";
        employee.setName(newName);
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void testNameNull() {
        String newName = null;
        employee.setName(newName);
        assertEquals("Bob", employee.getName());
    }

}
