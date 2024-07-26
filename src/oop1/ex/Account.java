package oop1.ex;

public class Account {
    int balance; // 잔액

    // 입금
    void deposit(int amount) {
        balance += amount;
        System.out.println("입금이 완료되었습니다.");
    }

    // 출금
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println("출금이 완료되었습니다.");
        }
    }

}
