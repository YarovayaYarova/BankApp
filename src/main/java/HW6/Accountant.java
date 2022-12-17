package HW6;

public class Accountant extends Employee {


    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth, String address) {
        super(employeeName, employeeId, Constants.ACCOUNTANT_DEFAULT_SALARY, Constants.ACCOUNTANT_TYPE, employeeDateOfBirth, address);
    }

    public void createReport (){
        System.out.println("Report created");
    }
}
