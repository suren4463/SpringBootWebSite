package com.niku.valuefm.domain;

public class EmployeeModel {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Employee TranslateModelToEmployee(){
        Employee employee= new Employee();
        employee.setFirstName(this.firstName);
        employee.setLastName(this.lastName);
        employee.setAddress(this.address);
        employee.setEmailAddress(this.emailAddress);
        employee.setCountry(this.country);
        employee.setState(this.state);
        employee.setPhoneNumber(this.phoneNumber);

        return employee;

    }
}
