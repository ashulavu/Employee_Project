package com.ikea;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

  public static void main(String[] args) {
    List<CGEmployee> cgEmployeeList = new ArrayList<>();
    CGEmployee emp3 = new CGEmployee("tom", "b", "1234567", "5000", "pune", "cg","ODI",true);
    CGEmployee emp4 = new CGEmployee("jack", "b", "1234555", "5000", "bangalore", "cg","zDI",false);
    CGEmployee emp5 = new CGEmployee("perugu", "b", "46045355", "5000", "bangalore", "cg","ODI", true);
    CGEmployee emp6 = new CGEmployee("ravi", "b", "46045321", "5000", "hyderabad", "cg", "FDI",true);
    cgEmployeeList.add(emp3);
    cgEmployeeList.add(emp4);
    cgEmployeeList.add(emp5);
    cgEmployeeList.add(emp6);
    EmployeeVaccination employeeVaccination = new EmployeeVaccination();
    employeeVaccination.isVaccinated(cgEmployeeList);

  }
}
