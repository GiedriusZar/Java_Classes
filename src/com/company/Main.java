package com.company;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account();

        try {
            acc.withdraw(90);
            System.out.println("Nuskaityta");
            acc.withdraw(50);
            System.out.println("Nuskaityta");
        } catch (AccountException e) {
            System.out.println(e.getMessage() + "  " + e.getBalance());
        }

    }
}
