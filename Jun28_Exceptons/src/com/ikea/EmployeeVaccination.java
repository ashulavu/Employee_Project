package com.ikea;

import java.util.List;

public class EmployeeVaccination {
    public void isVaccinated(List<CGEmployee> cgEmployeeList) {

        int count1 = 0;
        int count2 = 0;

        for (CGEmployee e : cgEmployeeList) {
            if (e.isVaccinated()) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(count1 + " are vaccinated and  " + count2 + " are not vaccinated");
    }
}