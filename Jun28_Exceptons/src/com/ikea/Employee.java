package com.ikea;

public class Employee {
  private String firstName;
  private String lastName;
  private String empno;
  private String salary;
  private String homeAddress;

  public Employee(String firstName, String lastName, String empno, String salary, String homeAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.empno = empno;
    this.salary = salary;
    this.homeAddress = homeAddress;
  }

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

  public String getEmpno() {
    return empno;
  }

  public void setEmpno(String empno) {
    this.empno = empno;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public String getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }
}
