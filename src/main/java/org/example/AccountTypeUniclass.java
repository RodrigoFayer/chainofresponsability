package org.example;

public class AccountTypeUniclass implements AccountType{
    private static AccountTypeUniclass accountTypeUniclass = new AccountTypeUniclass();

    private AccountTypeUniclass() {};

    public static AccountTypeUniclass getAccountTypeUniclass() {
        return accountTypeUniclass;
    }
}
