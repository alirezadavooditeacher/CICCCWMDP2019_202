package app.criteria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import app.entity.Account;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AccountSuspendedTest {
    AccountSuspended criteria;
    ArrayList<Account> accounts;

    @BeforeEach
    void setUp() {
        criteria = new AccountSuspended();

        accounts = new ArrayList<>();
        accounts.add(new Account("test1@example.com", "password", true));
        accounts.add(new Account("test2@example.com", "password", false));
    }

    @Test
    void satisfiedReturnsTrueIfTheAccountHasSuspended() {
        boolean actual = criteria.satisfied(accounts.get(0), accounts);
        assertTrue(actual);
    }

    @Test
    void satisfiedReturnsFalseIfTheAccountHasNotSuspended() {
        boolean actual = criteria.satisfied(accounts.get(1), accounts);
        assertFalse(actual);
    }
}