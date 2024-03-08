package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    List<Expense> expenses = new ArrayList<>();

    public void displayAllExpenses(){
        expenses.forEach(expense -> {
            System.out.println(expense.getDescription());
            System.out.println(expense.getMonth());
            System.out.println(expense.getType());
            System.out.println(expense.getValue());
        });
    }

    public void addExpense(Scanner scanner){
        System.out.println("Jaki wydatek chcesz dodać?");
        String description = scanner.nextLine();
        System.out.println("Jakiego typu jest ten wydatek?");
        String type = scanner.nextLine();
        System.out.println("Ile wynosi ten wydatek?");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("Z którego miesiąca jest wydatek(1-12)?");
        int month = Integer.parseInt(scanner.nextLine());

        Expense expense = new Expense(type,month,value,description);
        expenses.add(expense);

    }

    public void displayMonthlyExpenses(Scanner scanner){
        System.out.println("Z którego miesiąca chcesz wyswietlić wydatki?");
        int month = Integer.parseInt(scanner.nextLine());

        expenses.stream()
                .filter(expense -> expense.getMonth() ==month)
                .forEach(expense -> {
                    System.out.println(expense.getDescription());
                    System.out.println(expense.getMonth());
                    System.out.println(expense.getType());
                    System.out.println(expense.getValue());
                });

    }
}
