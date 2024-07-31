package org.example;

public class AccountTypePersonalite implements AccountType{
    private static AccountTypePersonalite accountTypePersonalite = new AccountTypePersonalite();

    private AccountTypePersonalite() {};

    public static AccountTypePersonalite getAccountTypePersonalite() {
        return accountTypePersonalite;
    }
}
