package  third_day_9th.ques2;

class BankC extends Bank {
    private int balance;

    void deposit(int money) {
        balance += money;
    }

    @Override
    int getBalance() {
        return balance;
    }
}
