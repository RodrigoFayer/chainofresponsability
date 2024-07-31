package org.example;

import java.util.ArrayList;

public abstract class Employee {
    protected ArrayList accounts = new ArrayList();
    private Employee manager;

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public abstract String getJobDescription();

    public String openAccount(Account account) {
        if (accounts.contains(account.getAccountType())) {
            return this.getJobDescription();
        }

        if (manager == null) {
            return "No manager to this account type.";
        }
        return manager.openAccount(account);
    }
}
