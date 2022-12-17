package HW6;

public class Clerk extends Employee {

    public Clerk(String employeeName, int employeeId, String employeeDateOfBirth, String address) {
        super(employeeName, employeeId, Constants.CLERK_DEFAULT_SALARY, Constants.CLERK_TYPE, employeeDateOfBirth, address);
    }

    public void makeCall (String customerName){
        System.out.println(String.format("Connected to customer %s", customerName));
    }

    public void getCall (String customerName){
        System.out.println(String.format("Answered to customer %s", customerName));
    }
}
