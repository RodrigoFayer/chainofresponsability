package org.example;

public class ManagerUniclass extends Employee{
    public ManagerUniclass(Employee employee) {
        accounts.add(AccountTypeUniclass.getAccountTypeUniclass());
        setManager(employee);
    }

    public String getJobDescription() {
        return "Manager Uniclass";
    }
}
