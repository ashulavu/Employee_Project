package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @GetMapping("/Salary")
    public String greeting(@RequestParam(value = "name", defaultValue = "neha") String name) {
        String employeeList = salaryService.getEmployeeList(name);

        return employeeList;
    }

    }






