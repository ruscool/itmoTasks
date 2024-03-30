package itmoTasks.Task2_1;

import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(double amount, String description) {
        Transaction transaction = new Transaction(amount, description);
        transactions.add(transaction);
        balance += amount;
//        System.out.println("Баланс счета после транзакции: " + balance);
    }

    public void printStatement() {
        System.out.println("История транзакций для счета " + accountNumber + ":");
        for (Transaction transaction : transactions) {
            System.out.println("Id транзакции: " + transaction.getId());
            System.out.println("Сумма: " + transaction.getAmount());
            System.out.println("Описание: " + transaction.getDescription());
            System.out.println("- - - - - - - - -");
        }
        System.out.println("Баланс счета: " + balance);
    }

    private class Transaction {
        private static int nextId = 1;
        private int id;
        private double amount;
        private String description;

        public Transaction(double amount, String description) {
            this.id = nextId++;
            this.amount = amount;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public double getAmount() {
            return amount;
        }

        public String getDescription() {
            return description;
        }
    }

}
