package com.vapasi.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

//        Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
//        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

//        employees.add(new EmployeeAdapterFromLdap(employeeFromLdap));

        return employees;
    }
}
