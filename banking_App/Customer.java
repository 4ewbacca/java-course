package banking_App;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (!this.customers.contains(customer)) {
            this.customers.add(customer);
        }
    }

    public void addTransaction(Customer customer, double amount) {
        customer.addTransaction(amount);
        System.out.println("Added transaction of " + amount + " for customer " + customer.getName());
    }

    public void printStatement(Customer customer) {
        System.out.println("Statement for customer " + customer.getName());
        ArrayList<Double> transactions = customer.getTransactions();
        double balance = 0.0;
        for (double transaction : transactions) {
            balance += transaction;
            System.out.println("Transaction amount: " + transaction + ", Balance: " + balance);
        }
    }
    public static void main(String[] args){
        Bank bank = new Bank("My Bank");

        // create some customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Customer customer3 = new Customer("Bob");

        // add the customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        // add some transactions for Alice
        bank.addTransaction(customer1, 100.0);
        bank.addTransaction(customer1, -50.0);
        bank.addTransaction(customer1, 200.0);

        // add some transactions for Bob
        bank.addTransaction(customer2, 500.0);
        bank.addTransaction(customer2, -100.0);

        bank.addTransaction(customer3, 500.0);
        bank.addTransaction(customer3, -100.0);

        // print a statement for Alice
        bank.printStatement(customer1);

        // print a statement for Bob
        bank.printStatement(customer2);

        bank.printStatement(customer3);
    }

}
