package org.example;

public class Manager extends Employee{
    public Manager(Employee employee) {
        accounts.add(AccountTypeDefault.getAccountTypeDefault());
        setManager(employee);
    }

    public String getJobDescription() {
        return "Manager";
    }
}
