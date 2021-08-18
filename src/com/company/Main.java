package com.company;

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account(1234, 99.99);
        System.out.println(a1); // toStringO
        Account a2 = new Account(8888);
        System.out.println(a2); // проверка toStringO

        a1.setBalance(88.88);
        System.out.println(a1); // обращаемся к toStringO Для проверки измененного объекта
        System.out.println("Hoмep счета: " + a1 .getAccount());
        System.out.println("Баланc: " + a1 .getBalance());
        a1.credit(10);
        System.out.println(a1); // вызываем toString()/pni проверки измененного объекта
        a1 .debit(5);
        System.out.println(a1);
        a1 .debit(500); // Проверка метода debit() при наличии ошибки
        System.out.println(a1);
    }
}