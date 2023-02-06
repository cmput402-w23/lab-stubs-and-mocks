package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getCapitalizedName() {
        Address address = new Address("221B Baker Street", "London");
        Employee employee = new Employee("sherlock", 111, 5000, address);
        String capitalizedName  = employee.getCapitalizedName();
        assertEquals("Sherlock", capitalizedName);
    }
}