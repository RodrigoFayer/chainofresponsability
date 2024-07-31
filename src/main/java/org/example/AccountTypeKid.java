package org.example;

public class AccountTypeKid implements AccountType{
    private static AccountTypeKid accountTypeKid = new AccountTypeKid();

    private AccountTypeKid() {};

    public static AccountTypeKid getAccountTypeKid() {
        return accountTypeKid;
    }
}
