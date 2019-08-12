package com.vapasi.adapter;

public class EmployeeAdapterFromLdap implements Employee {
    private EmployeeLdap employeeLdap;

    public EmployeeAdapterFromLdap(EmployeeLdap employeeFromLdap) {
        this.employeeLdap = employeeFromLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }

    public String toString() {
        return "ID: " + employeeLdap.getCn();
    }
}
