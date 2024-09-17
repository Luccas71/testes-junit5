package one.digitalinnovation.tests.entities;

import one.digitalinnovation.entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){
        double amount = 200.0;
        double expectedValue = 196.0;
        Account acc = new Account(1L, 0.0);

        acc.deposit(amount);

        Assertions.assertEquals(expectedValue, acc.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeDeposit() {
        Account acc = new Account(1L, 0.0);

        acc.deposit(-20.0);

        Assertions.assertEquals(0.0, acc.getBalance());
    }
}
