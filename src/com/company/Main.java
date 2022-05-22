package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.deposit(2000);
        } catch (LimitExeption e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Сумма вывода");
                bankAccount.withDraw(scanner.nextInt());
            } catch (LimitExeption limitExeption) {
                System.out.println(limitExeption.getMessage());
                try {
                    bankAccount.withDraw((int) limitExeption.getRemainingAmount());
                } catch (LimitExeption e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}