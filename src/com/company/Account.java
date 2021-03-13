package com.company;

public class Account {

    private int balance = 100;

    public void withdraw(int amount) throws AccountException {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            throw new AccountException("Neigiamas balansas", balance-amount);
        }

    }

    public int getBalance() {
        return balance;
    }
}
