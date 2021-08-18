package com.company;

public class Account {
    private final int account;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.account = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber) {
        this.account = accountNumber;
        this.balance = 0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return String.format("Номер счета: %d, баланс: %.2f", this.account, this.balance);
    }
    public int getAccount() {
        return this.account;
    }
    public double getBalance() {
        return this.balance;
    }

    public void credit(double amount) {
        this.balance += amount;
        System.out.println(String.format("Номер счета: %d, кредит: %.2f", account, amount));
    }
    public void debit(double amount) {
        if (amount > balance) {
            System.out.print(String.format("Номер счета: %d, дебет : %.2f", account, amount));
            System.out.println(" - \"Недостаточно средств на Вашем счете\"");
        } else {
            balance -= amount;
            System.out.println(String.format("Номер счета: %d, дебет : %.2f", account, amount));
        }
    }
}
