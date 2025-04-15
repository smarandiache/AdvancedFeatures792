package org.example.part1_class_types.class_final;

// extend MathUtils -> cannot inherit from final
public class BankAccount {

    private final String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
    }

}
