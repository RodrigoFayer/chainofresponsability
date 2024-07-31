package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Manager manager;
    ManagerUniclass managerUniclass;
    ManagerPersonalite managerPersonalite;

    @BeforeEach
    void setUp() {
        managerPersonalite = new ManagerPersonalite(null);
        managerUniclass = new ManagerUniclass(managerPersonalite);
        manager = new Manager(managerUniclass);
    }

    @Test
    void shouldReturnManagerToOpenAccount() {
        assertEquals("Manager", manager.openAccount(new Account(AccountTypeDefault.getAccountTypeDefault())));
    }

    @Test
    void shouldReturnManagerUniclassToOpenAccount() {
        assertEquals("Manager Uniclass", manager.openAccount(new Account(AccountTypeUniclass.getAccountTypeUniclass())));
    }

    @Test
    void shouldReturnManagerPersonaliteToOpenAccount() {
        assertEquals("Manager Personalite", manager.openAccount(new Account(AccountTypePersonalite.getAccountTypePersonalite())));
    }

    @Test
    void shouldReturnNoManagaerToOpenAccount() {
        assertEquals("No manager to this account type.", manager.openAccount(new Account(AccountTypeKid.getAccountTypeKid())));
    }
}