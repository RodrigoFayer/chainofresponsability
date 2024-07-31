package org.example;

public class AccountTypeDefault implements AccountType{
    private static AccountTypeDefault accountTypeDefault = new AccountTypeDefault();

    private AccountTypeDefault() {};

    public static AccountTypeDefault getAccountTypeDefault() {
        return accountTypeDefault;
    }
}
