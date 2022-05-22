package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double sum) throws LimitExeption{
        amount += sum;
        System.out.println("Вы пополнили сет на" + (int) getAmount() + "som");
    }
    public void withDraw(int sum)throws LimitExeption{
        if (sum > amount){
            System.out.println("Опперация не доступна, Не достаточно средств на счету" + amount);
        }else {
            amount -= sum;
            System.out.println("Вы сняли" + sum + "som" + "Остаток на счету" + amount);

        }
    }

}
