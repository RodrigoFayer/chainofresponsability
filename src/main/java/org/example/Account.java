package org.example;

public class Account {
    private AccountType accountType;

    public Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
