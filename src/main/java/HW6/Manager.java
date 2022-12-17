package HW6;

import HW6.Constants;

public class Manager extends Employee {



    public Manager(String employeeName, int employeeId, String employeeDateOfBirth, String address) {
        super(employeeName, employeeId, Constants.MANAGER_DEFAULT_SALARY, Constants.MANAGER_TYPE, employeeDateOfBirth, address);
    }
    public void hireEmployee (String employeeName){
        System.out.println(String.format("The employee %s was hired", employeeName));
    }
    public void fireEmployee (String  employeeName){
        System.out.println(String.format("The employee %s was fired", employeeName));
    }


}
