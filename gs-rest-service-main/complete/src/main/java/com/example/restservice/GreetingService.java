package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {
    public List<CGEmployee> getEmployeeList(String name){

        List<CGEmployee> cgEmployeeList = new ArrayList<>();
        List<CGEmployee> returnDetailList = new ArrayList<>();
        CGEmployee emp1 = new CGEmployee("tom", "b", "1234567", 2000, "pune", "cg", "ODI", true);
        CGEmployee emp4 = new CGEmployee("jack", "b", "1234555", 6000, "bangalore", "cg", "MFT", false);
        CGEmployee emp5 = new CGEmployee("Lavanya", "b", "46045355", 4000, "bangalore", "cg", "ODI", true);
        CGEmployee emp6 = new CGEmployee("ravi", "b", "46045321", 5000, "hyderabad", "cg", "SOA", true);
        CGEmployee emp7 = new CGEmployee("Ashwini", "b", "46045431", 5000, "Chennai", "cg", "Kafka", true);
        cgEmployeeList.add(emp1);
        cgEmployeeList.add(emp4);
        cgEmployeeList.add(emp5);
        cgEmployeeList.add(emp6);
        cgEmployeeList.add(emp7);

        for (CGEmployee cg : cgEmployeeList) {
            if (name.equalsIgnoreCase(cg.getFirstName())) {
                returnDetailList.add(cg);
            }


        }
        return returnDetailList;
    }
}