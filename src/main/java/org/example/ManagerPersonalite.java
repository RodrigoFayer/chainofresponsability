package org.example;

public class ManagerPersonalite extends Employee{
    public ManagerPersonalite(Employee employee) {
        accounts.add(AccountTypePersonalite.getAccountTypePersonalite());
        setManager(employee);
    }

    public String getJobDescription() {
        return "Manager Personalite";
    }
}
