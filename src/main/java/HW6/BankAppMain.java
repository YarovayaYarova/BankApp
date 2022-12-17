package HW6;

import HW6.Accountant;

public class BankAppMain {
    public static void main(String[] args) {
        Manager manager1 = new Manager("John Smith", 1, "10.01.1977", "Beijing");
        Accountant accountant1 = new Accountant("Mary Jones", 2, "07.08.200", "Shanghai");
        Accountant accountant2 = new Accountant("Nicol Walker", 6, "06.06.1996", "Sanya");
        Accountant accountant3 = new Accountant("Bob Bober", 7, "03.02.1997", "Toronto");
        Accountant accountant4 = new Accountant("Victoria Smith", 8, "09.09.2003", "Warsaw");
        Accountant accountant5 = new Accountant("Gleb Glebov", 9, "04.04.1988", "Istanbul");
        Clerk clerk1 = new Clerk("Ivan Petrov", 3, "08.03.1994", "Toronto");
        Clerk clerk2 = new Clerk("Anna Johns", 4, "08.04.1988", "Shenzhen");
        Clerk clerk3 = new Clerk("Brian Walker", 5, "14.08.1992", "Shanghai");
        System.out.println(manager1.toString());
        System.out.println(accountant1.toString());
        System.out.println(accountant2.toString());
        System.out.println(accountant3.toString());
        System.out.println(accountant4.toString());
        System.out.println(accountant5.toString());
        System.out.println(clerk1.toString());
        System.out.println(clerk2.toString());
        System.out.println(clerk3.toString());

        manager1.fireEmployee("Ivan Petrov");
        accountant1.createReport();
        accountant5.createReport();
        clerk1.makeCall("Peter Ivanov");
        clerk2.getCall("Peter Petrov");
        clerk3.makeCall("Rodion Rodionov");

    }
}
