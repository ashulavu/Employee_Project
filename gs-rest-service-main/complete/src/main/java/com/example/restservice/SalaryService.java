package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryService {

    public String getEmployeeList(String name){
        String salary = "";
        List<CGEmployee> cgEmployeeList = new ArrayList<>();
        CGEmployee emp1 = new CGEmployee("sam", "a", "1234561", 2000, "pune", "cg", "ODI", false);
        CGEmployee emp2 = new CGEmployee("sac", "b", "1234562", 3000, "bangalore", "ikea", "Java", true);
        CGEmployee emp3 = new CGEmployee("john", "c", "1234563", 3000, "kolkata", "ikea", "SOA", true);
        CGEmployee emp4 = new CGEmployee("ashu", "d", "1234564", 6000, "pune", "cg", "ODI", false);
        CGEmployee emp5 = new CGEmployee( "ashu", "e", "1234565", 10000, "pune", "cg", "ODI", false);
        cgEmployeeList.add(emp1);
        cgEmployeeList.add(emp2);
        cgEmployeeList.add(emp3);
        cgEmployeeList.add(emp4);
        cgEmployeeList.add(emp5);

        for (CGEmployee cg: cgEmployeeList){
            if(name.equalsIgnoreCase(cg.getFirstName())){
                salary =salary+cg.getSalary()+"  ";

                continue;
            }
        }
        return salary;
    }

}

